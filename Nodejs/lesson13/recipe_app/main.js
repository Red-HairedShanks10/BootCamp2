//Lesson 15
"use strict ";

const express = require("express"),
    app = express(),
    errorController = require("./controllers/errorController"),
    homeController = require("./controllers/homeController"),
    layouts = require("express-ejs-layouts"),
    subscribersController = require("./controllers/subscribersController"),
    mongoose = require("mongoose");
   // Subscriber = require("./models/subscriber");

    mongoose.connect(
        "mongodb://127.0.0.1:27017/recipe_db", {
            useNewUrlParser: true
        }
    );

    const db = mongoose.connection;
 db.once("open", () => {
     console.log("Successfully connected to MongoDB using Mongoose!");
 });


app.set("port", process.env.PORT || 3000);
app.set("view engine", "ejs");

app.use(express.static("public"));
app.use(layouts);
app.use(
    express.urlencoded({
        extended: false
    })
);
app.use(express.json());
app.use(homeController.logRequestPaths);

app.get("/contact", subscribersController.getSubscriptionPage);
app.post("/subscribe", subscribersController.saveSubscriber);
app.get("/name", homeController.respondWithName);
app.get("/items/:vegetable", homeController.sendReqParam);



app.post("/", (req, res) => {
    console.log(req.body);
    console.log(req.query);
    res.send("POST Successful!");
});

app.get("/subscribers", subscribersController.getAllSubscribers,(req, res, next) => {
    console.log(req.data);
    //res.send(req.data);
    res.render("subscribers", {subscribers: req.data});
    });

app.use(errorController.logErrors);
app.use(errorController.respondNoResourceFound);
app.use(errorController.respondInternalError);

app.listen(app.get("port"), () => {
            console.log(`Server running at http: 127.0.0.1:27017 ${app.get("port")}`);
         });