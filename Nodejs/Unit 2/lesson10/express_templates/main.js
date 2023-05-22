  "Use strict";

  const express = require("express"),
    app = express(),
    layouts = require("express-ejs-layouts"),
    homeController = require("./controllers/homeController"),
    errorController = require("./errorController/errorController");


  app.set("port", process.env.PORT || 3000);
  app.set("view engine", "ejs");
  app.use(layouts);
  //app.use(errorController.logErrors);
  app.use(express.static("public"));
  

  app.get("/name/:myName", homeController.respondWithName);
  app.use(errorController.respondNoResourceFound);
  app.use(errorController.respondInternalError);
  app.listen(app.get("port"), () => {
    console.log(`The Express.js server has started and is listening on port number: ${app.get("port")}`);
  });