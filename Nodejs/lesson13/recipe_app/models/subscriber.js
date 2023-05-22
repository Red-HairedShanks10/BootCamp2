//14.5
const mongoose = require("mongoose"),
//Subscriber = mongoose.model("Subscriber", subscriberSchema),
    subscriberSchema = mongoose.Schema({
        name: String,
        email: String,
        zipCode: Number
    });
module.exports = mongoose.model("Subscriber", subscriberSchema);



