const mongoose = require("mongoose");
const db = require("./models");


//the CreateTutorial function
const createTutorial = function(tutorial) {
  return db.Tutorial.create(tutorial).then(docTutorial => {
    console.log("\n>> Created Tutorial:\n", docTutorial);
    return docTutorial;
  });
};

//the createImage function
const createImage = function(tutorialId, image) {
  return db.Image.create(image).then(docImage => {
    console.log("\n>> Created Image:\n", docImage);
    return db.Tutorial.findByIdAndUpdate(
      tutorialId,
      {
        $push: {
          images: {
            _id: docImage._id,
            url: docImage.url,
            caption: docImage.caption
          }
        }
      },
      { new: true, useFindAndModify: false }
    );
  });
};

//createComment function
const createComment = function(tutorialId, comment) {
  //use create() to make new comment....
  return db.Comment.create(comment).then(docComment => {
    console.log("\n>> Created Comment:\n", docComment);

    //add that new comment to the specified tutorial.... 
    return db.Tutorial.findByIdAndUpdate(
      tutorialId,
      { $push: { comments: docComment._id } },
      { new: true, useFindAndModify: false }
    );
  });
};

//the createCategory function
const createCategory = function(category) {
  //use create() to create a category using the functions argument
  return db.Category.create(category).then(docCategory => {
    console.log("\n>> Created Category:\n", docCategory);
    return docCategory;
  });
};

//an addTutorialToCategory function
const addTutorialToCategory = function(tutorialId, categoryId) {
  //we use FindByIdAndUpdate() to add tutorial into a Category
  return db.Tutorial.findByIdAndUpdate(
    tutorialId,
    { category: categoryId },
    { new: true, useFindAndModify: false }
  );
};

//this function use populate()
const getTutorialWithPopulate = function(id) {
  return db.Tutorial.findById(id)
  //populate()helps with getting all the Tutorial data 
    .populate("comments", "-_id -__v")
    .populate("category", "name -_id")
    .select("-images._id -__v");
};
//this function  gets Tutorial within a category 
const getTutorialsInCategory = function(categoryId) {
  return db.Tutorial.find({ category: categoryId })
    .populate("category", "name -_id")
    .select("-comments -images -__v");
};

//Run function will execute  some hard coded data
const run = async function() {
  //we create a tutorial
  var tutorial = await createTutorial({
    title: "MongoDB One-to-Many Relationship example",
    author: "bezkoder.com"
  });

  //we create some images and add them to that particular tutorial
  tutorial = await createImage(tutorial._id, {
    path: "sites/uploads/images/mongodb.png",
    url: "https://bezkoder.com/images/mongodb.png",
    caption: "MongoDB Database",
    createdAt: Date.now()
  });
  console.log("\n>> Tutorial:\n", tutorial);
 //another image for the tutorial
  tutorial = await createImage(tutorial._id, {
    path: "sites/uploads/images/one-to-many.png",
    url: "https://bezkoder.com/images/one-to-many.png",
    caption: "One to Many Relationship",
    createdAt: Date.now()
  });
  console.log("\n>> Tutorial:\n", tutorial);

  //created some comments for this tutorial
  tutorial = await createComment(tutorial._id, {
    username: "jack",
    text: "This is a great tutorial.",
    createdAt: Date.now()
  });
  console.log("\n>> Tutorial:\n", tutorial);
//another comment
  tutorial = await createComment(tutorial._id, {
    username: "mary",
    text: "Thank you, it helps me alot.",
    createdAt: Date.now()
  });
  console.log("\n>> Tutorial:\n", tutorial);
//created a category
  var category = await createCategory({
    name: "Node.js",
    description: "Node.js tutorial"
  });
//then assign that category
  tutorial = await addTutorialToCategory(tutorial._id, category._id);
  console.log("\n>> Tutorial:\n", tutorial);
//
  tutorial = await getTutorialWithPopulate(tutorial._id);
  console.log("\n>> populated Tutorial:\n", tutorial);
//created another tutorial
  var newTutorial = await createTutorial({
    title: "Mongoose tutorial with examples",
    author: "bezkoder.com"
  });
//the we use this function to add the newly created tutorial to a specific category
  await addTutorialToCategory(newTutorial._id, category._id);
//then we have an array/object of tutorials  from a specific category...
  var tutorials = await getTutorialsInCategory(category._id);
  console.log("\n>> all Tutorials in Cagetory:\n", tutorials);
};

mongoose
  .connect("mongodb://127.0.0.1:27017/bezkoder_db", {
    useNewUrlParser: true,
    useUnifiedTopology: true
  })
  .then(() => console.log("Successfully connect to MongoDB."))
  .catch(err => console.error("Connection error", err));

run();
