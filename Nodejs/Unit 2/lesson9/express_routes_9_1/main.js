"use strict";

const port = 3000,
  express = require("express"),
  app = express();

// //1) ADD middleware function app.use()9.4//
// app.use((req, res, next) => { //a)define the middleware
//   console.log(`request made to: ${req.url}`); //b) log req.url to  
//   next(); //c) call the next function
// });

// //2) responding with path param
// app.get("/items/:vegetable", (req, res) => { //a)get vegetable from items param
//   let veg = req.params.vegetable; //b)store that vegetable value to veg variable
//   res.send(`This is the page for ${veg}`); //c)send response message with interpolated string
// });



//9.5
app.use(
  express.urlencoded({
    extended: false
  })
);
app.use(express.json());
app.post("/", (req, res) => {//make a post route

  console.log( req.body);//log request body
  console.log(req.params);
  console.log( req.query);
  res.send("POST Successful!");
});


app.listen(port, () => { //listen at port 3000
  console.log(`Server running on port: ${port}`);
});