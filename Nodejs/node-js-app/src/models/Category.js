const mongoose = require("mongoose");

//This is the many(alot) side of the relationship with Tutorial
//alot  because data of this kind is frequently updated
//so we use a reference to this Model 
const Category = mongoose.model(
  "Category",
  new mongoose.Schema({
    name: String,
    description: String
  })
);

module.exports = Category;
