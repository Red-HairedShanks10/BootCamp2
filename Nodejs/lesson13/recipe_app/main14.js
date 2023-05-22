/* const MongoDB = require("mongodb").MongoClient,
    dbURL = "mongodb://127.0.0.1:27017",
    dbName = "recipe_db";

MongoDB.connect(dbURL, (error, client) => {
    if (error) throw error;

    let db = client.db(dbName);
    db.collection("contacts")
        .find()
        .toArray((error, data) => {
            if (error) throw error;
            console.log("Received data: ")
            console.log(data);
        })
        
        db.collection("contacts")
        .insert({
            name: "Freddie Mercury",
            email: "fred@queen.com"
        }, (error, db) => {
            if (error) throw error;
            console.log(db);
        });
    })

*/

/////Lesson 14///////

const mongoose = require("mongoose"),
subscribersController = require("./controllers/subscribersController"),
Subscriber = require("./models/subscriber");//14.5 importing from subsciber.js
mongoose.connect(
    "mongodb://127.0.0.1:27017/recipe_db", {
        useNewUrlParser: true
    }
);
const db = mongoose.connection;

app.get("/subscribers", subscribersController.getAllSubscribers,(req, res, next) => {
console.log(req.data);
res.send(req.data);
});

//14.2
db.once("open", () => {
    console.log("Successfully connected to MongoDB using Mongoose!");
});

//14.3
/*const subscriberSchema = mongoose.Schema({
    name: String,
    email: String,
    zipCode: Number
});

const Subscriber = mongoose.model("Subscriber", subscriberSchema)
*/

//14.4 ways of making models...??

//a)using new to create an instance and save method together

/*var subscriber1 = new Subscriber({
    name: "Jon Wexler",
    email: "jon@jonwexler.com"
});

subscriber1.save((error, savedDocument) => {
    if (error) console.log(error);
    console.log(savedDocument);
});
*/

//b)using create method with with then() and catch()

/*
  Subscriber.create({
        name: "Marco3",
        email: "Marco3@gmail.com"
    })
    .then((result) =>{
         console.log("printin result");
         console.log(result);

    })
    .catch((err) => {
        console.log(`Printing error ${err}`);

    });

    Subscriber.create({
        name: "Jon Wexler",
        email: "jon@jonwexler.com"
    })
    .then((result) =>{
         console.log("printin result");
         console.log(result);

    })
    .catch((err) => {
        console.log(`Printing error ${err}`);

    });
*/



    /*using create() with a call back function (doesnt work??)
    function (error, savedDocument) {
        if (error) console.log(error);
        console.log(savedDocument);
    }
);*/



//using findOne() with exec()
let query = Subscriber.findOne({ name: "Jon Wexler" })
.where("email", /wexler/);

query.exec()
.then((result) => {
    console.log(`result 1: ${result}`);
}).catch((err) => {
    console.log(`this error: ${err}`);
});



//pg152 running findOne()  immidiately
Subscriber.findOne({ name: "Marco" })
.where("email", /Marco/)
.then((result) => {
    console.log(`result 2: ${result}`);
}).catch((err) => {
    console.log(`this error: ${err}`);
});
/**/



