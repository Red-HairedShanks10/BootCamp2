"use strict";

//1)
const Subscriber = require("../models/subscriber");

//2)
exports.getAllSubscribers = (req, res) => {
  Subscriber.find({})//a)
    .exec()
    .then(subscribers => {//b)
      res.render("subscribers", {
        subscribers: subscribers
      });
    })
    .catch(error => {
      console.log(error.message);
      return [];
    })
    .then(() => {//c)
      console.log("promise complete");
    });
};

//3)
exports.getSubscriptionPage = (req, res) => {
  res.render("contact");
};

//4)
exports.saveSubscriber = (req, res) => {
  let newSubscriber = new Subscriber({
    name: req.body.name,
    email: req.body.email,
    zipCode: req.body.zipCode
  });
  newSubscriber
    .save()
    .then(() => {
      res.render("thanks");//render thanks.ejs
    })
    .catch(error => {
      res.send(error);
    });
};
