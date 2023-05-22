"use strict";

/*8.1--1) */
const port = 3000,
    express = require("express"),//a)
    app = express();//b)
const homeController = require("./controllers/homeController");//c)

//2
app.get("/", (req, res) => {//a)
        res.send("Hello, Uni");//b
    })
    .listen(port, () => {//listen a port 3000
        console.log(`The Express.js server has started and is listening on port number: ${port}`);
    });





/*
  app.post("/", (req, res) => {
    console.log("param" + req.params);
    console.log("body" + req.body);
    console.log("url" + req.url);
    console.log("query" + req.query);
    res.send("Hello, Universe!");
})
 */

/*9.3
app.use((req, res, next) => {
    console.log(`request made to: ${req.url}`);
    next();
})
app.get("/items/:vegetable", (req, res) => {
        let veg = req.params.vegetable;
        res.send(`This is the page for ${veg}`);
    })

    .listen(port, () => {
        console.log(`The Express.js server has started and is listening on port number: ${port}`);
    });
    */

/*9.2
app.get("/items/:vegetable", (req, res) => {
    res.send(req.params.vegetable);
})
.listen(port, () => {
    console.log(`The Express.js server has started and is listening on port number: ${port}`);
});*/


/*9.4*/
// app.use((req, res, next) => {
//     console.log(`request made to: ${req.url}`);
//     next();
//     });

// app.use(
//     express.urlencoded({
//         extended: false
//     })
// );
// app.use(express.json());
// app.post("/", (req, res) => {
//     console.log(req.body);
//     console.log(req.query);
//     console.log(req.params);
//     res.send("POST Successful!");
// })


// app.get("/items/:vegetable", homeController.sendReqParam);
// app.listen(port, () => {
//     console.log(`The Express.js server has started and is listening on port number: ${port}`);
// });



