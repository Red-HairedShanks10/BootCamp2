const mongoose = require("mongoose");

//Tutorial model handles the relationships of tutorial
const Tutorial = mongoose.model(
  "Tutorial",
  new mongoose.Schema({
    title: String,
    author: String,
    images: [],//add images array//for the relationship between a Tutorial and its images(one(Tutorial) to many/few(Images))

    //child referencing of Comment Model
    comments: [//establish a one to many Relationship for Tutorials and comments(one(Tutorial), many(comments))
      {
        type: mongoose.Schema.Types.ObjectId,//set all types of comments to ObjectId
        ref: "Comment"//using ref helps get all the fields of Comment model when we call populate()
      }
    ],
    category: {//parent referencing of Category Model
      type: mongoose.Schema.Types.ObjectId,
      ref: "Category"
    }
  })
);

module.exports = Tutorial;
