"use strict";

//16.2
const mongoose = require("mongoose"),

//creating a schema for subscriber(model)object
  subscriberSchema = mongoose.Schema({
    //schema properties
    name: String,
    email: String,
    zipCode: Number
  });

  //add the subscriber model to module.exports object
module.exports = mongoose.model("Subscriber", subscriberSchema);
