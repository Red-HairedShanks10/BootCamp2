/*1)*/
const port = 3000,
    http = require("http"),
    httpStatus = require("http-status-codes"),
    getJSONString = obj => { return JSON.stringify(obj, null, 2);},
    app = http.createServer();  


app.on("request", (req, res) => {
    //2
    // console.log(req.method);
    // console.log(req.url);
    // console.log(req.headers);
    //a)
    console.log(`Method: ${getJSONString(req.method)}`);
    console.log(`url: ${getJSONString(req.url)}`);
    console.log(`header: ${getJSONString(req.headers)}`);

    res.writeHead(httpStatus.OK, {
        "Content-Type": "text/html"
    });
    let responseMessage = "<h1>Hello.</h1>";
    res.end(responseMessage);
});



app.listen(port);
console.log(`The server has started and is listening on port number: ${port}`);


/*3--handling request data */
//a)
// app.on("request", (req, res) => {
//     var body = []; //b)
//     req.on("data", (bodyData) => { //c)
//         body.push(bodyData);
//     });
//     req.on("end", () => { //d
//         body = Buffer.concat(body).toString();
//         console.log(`Request Body Contents: ${body}`);
//     });

//     console.log(`Method: ${getJSONString(req.method)}`);
//     console.log(`URL: ${getJSONString(req.url)}`);
//     console.log(`Headers: ${getJSONString(req.headers)}`);

//     res.writeHead(httpStatus.OK, {
//         "Content-Type": "text/html"
//     });
//     let responseMessage = "<h1>This will show on the screen.</h1>";
//     res.end(responseMessage);
// });
// app.listen(port);
// console.log(`The server has started and is listening on port number: ${port}`);


/**pg55**listing 5.5 

const port = 3000,
http = require("http"),
httpStatus = require("http-status-codes"),
app = http
.createServer((req, res) => {
res.writeHead(httpStatus.OK, {
"Content-Type": "text/html"
});
let responseMessage = "<h1>Welcome!</h1>";
res.end(responseMessage);
})
.listen(port);
**/

/*listing 5.6 
const routeResponseMap = {
    "/info": "<h1>Info Page</h1>",
    "/contact": "<h1>Contact Us</h1>",
    "/about": "<h1>Learn More About Us.</h1>",
    "/hello": "<h1>Say hello by emailing us here</h1>",
    "/error": "<h1>Sorry the page you are looking for is not here.</h1>"
};
const port = 3000,
    http = require("http"),
    httpStatus = require("http-status-codes"),
    app = http.createServer((req, res) => {
        res.writeHead(200, {
            "Content-Type": "text/html"
        });
        if (routeResponseMap[req.url]) {
            res.end(routeResponseMap[req.url]);
        } else {
            res.end("<h1>Welcome!</h1>");
        }
    });
app.listen(port);
console.log(`The server has started and is listening on port number:${port}`);
*/