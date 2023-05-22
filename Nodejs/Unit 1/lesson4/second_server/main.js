/**/
//1)
const port = 3000,
    http = require("http"), //importing http module
    httpStatus = require("http-status-codes"), //importing http-status-codes module
    //2)
    app = http.createServer(); //using the createSever() to create a new instance of http.Server
   //a)
    app.on("request", (req, res) => {
    //b
    res.writeHead(httpStatus.OK, {
        "Content-Type": "text/html"
    });
    //c
    let responseMessage = "<h1>This will show on the screen.</h1>";
    res.end(responseMessage);
});
//d
app.listen(port);
console.log(`The server has started and is listening on port number: ${port}`);


/* /1)
const port = 3000,
    http = require("http"),
    httpStatus = require("http-status-codes"),
    //2)
    app = http.createServer((request, response) => {//a
        console.log("Received an incoming request!");
        response.writeHead(httpStatus.OK, {
            "Content-Type": "text/html"
        });
         //write response
        let responseMessage = "<h1>Hello, Universe!</h1>";
        response.write(responseMessage);
        response.end();
        });

app.listen(port);
console.log(`The server has started and is listening on port number:${port}`);

*/