

// exports.showCourses = (req, res) => { //a
//     res.render("courses");
// };



//12.9
//defining an array of courses 
var courses = [{
        title: "Event Driven Cakes",
        cost: 50
    },
    {
        title: "Asynchronous Artichoke",
        cost: 25
    },
    {
        title: "Object Oriented Orange Juice",
        cost: 10
    }
];

//12.5 pg 125
//re-coded function a)
exports.showCourses = (req, res) => {
    res.render("courses", {
        offeredCourses: courses//pass the array to the view
    });
};


exports.showSignUp = (req, res) => { //b
    res.render("contact");
};
exports.postedSignUpForm = (req, res) => { //c
    res.render("thanks");
};


