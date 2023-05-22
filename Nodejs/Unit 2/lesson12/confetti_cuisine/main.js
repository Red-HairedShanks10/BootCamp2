//12.3 pg124
//1)
const express = require("express"),
app = express(),//instatiate express app
homeController = require("./controllers/homeController"),
layouts = require("express-ejs-layouts"),
errorController = require("./controllers/errorController");


//2)set port to 3000?
app.set("port", process.env.PORT || 3000);

//12.4 pg124
app.use(
    express.urlencoded({
        extended: false
    })
);

//12.7 pg126 layout ejs
app.use(express.json());
app.set("view engine", "ejs");//a
app.use(layouts);//b
app.use(express.static("public"));

app.get("/", (req, res) => {
    res.render("index");
  });
//12.6 pg125
app.get("/courses.ejs", homeController.showCourses);//handle GET requests made to course
app.get("/contact.ejs", homeController.showSignUp);//handle Get requests made to /contact 
app.post("/contact", homeController.postedSignUpForm);//handle Post requests using /contact



//12.12 adding error handling routes as middleware functions
app.use(errorController.pageNotFoundError);
app.use(errorController.internalServerError);




//12.3 continued....
//listen on port 3000
app.listen(app.get("port"), () => {
    console.log(`Server running at http://localhost:${app.get("port")}`);
});
