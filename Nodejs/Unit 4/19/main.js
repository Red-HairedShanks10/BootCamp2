const mongoose = require("mongoose");
const express = require("express");
const app = express();
// Added the Router module
const router = express.Router()
const Subscriber = require("./models/subscriber");
const subscribersController = require("./controllers/subscribersController");
const coursesController = require("./controllers/coursesController");
const usersController = require("./controllers/usersController");
const homeController = require("./controllers/homeController");
const layouts = require("express-ejs-layouts");

mongoose.connect(
  "mongodb://127.0.0.1:27017/recipe_db",
  { useNewUrlParser: true }
);
const db = mongoose.connection;

db.once("open", () => {
  console.log("Successfully connected to MongoDB using Mongoose!");
});

app.set("port", process.env.PORT || 3000);
app.set("view engine", "ejs");

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use(layouts);
app.use(express.static("public"));

app.get("/subscribers", subscribersController.getAllSubscribers, (req, res, next) => {
  console.log(req.data);
  res.render("subscribers", {subscribers: req.data})
});

// Add Router middleware
app.use("/", router);

router.get("/users", usersController.index);
// Renders the new.ejs file
router.get("/users/new", usersController.new);
// Accepts POST requests and passes that incoming body body data to the create action
// Followed by a view redirect
router.post("/users/create", usersController.create, usersController.redirectView)

//for courses route
router.get("/courses", coursesController.index, coursesController.indexView);
router.get("/courses/new", coursesController.new);
router.post("/courses/create", coursesController.create, coursesController.redirectView);
router.get("/courses/:id", coursesController.show, coursesController.showView);
router.get("/courses/:id/edit", coursesController.edit);
router.put("/courses/:id/update", coursesController.update, coursesController.redirectView);
router.delete("/courses/:id/delete", coursesController.delete, coursesController.redirectView);

// This show route, uses the /users path and passes the :id parameter to the userController.show
router.get("/users/:id", usersController.show, usersController.showView)

router.get("/contact", subscribersController.getSubscriptionPage);
router.post("/subscribe", subscribersController.saveSubscriber);
app.get("/", homeController.respondWithName);

app.listen(app.get("port"), () => {
  console.log(`Server running at http://localhost:${app.get("port")}`);
});