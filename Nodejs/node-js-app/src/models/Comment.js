const mongoose = require("mongoose");

//The Many side of the Relationship 
//use Reference bcoz comments are often added
//Comment model to handle comments for each Tutorial
const Comment = mongoose.model(
  "Comment",
  new mongoose.Schema({
    username: String,
    text: String,
    createdAt: Date
  })
);

module.exports = Comment;
