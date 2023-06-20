const mongoose = require("mongoose");

//Many(few) side of the Relationship //few because we the data is rarely updated
//so we embed this data
//created a Image model to help query instances of this schema//in their own collection 
const Image = mongoose.model(
  "Image",
  new mongoose.Schema({
    path: String,
    url: String,
    caption: String,
    createdAt: Date
  })
);

module.exports = Image;
