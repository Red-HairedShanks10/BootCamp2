
const httpStatus = require("http-status-codes"),
    contentTypes = require("./contentTypes"),
    utils = require("./utils");

//2
const routes = {
    "GET": {},
    "POST": {}
};

//3
exports.handle = (req, res) => {
    try {
        routes[req.method][req.url](req, res);
    } catch (e) {
        res.writeHead(httpStatus.OK, contentTypes.html);
        utils.getFile("views/error.html", res);
    }
};

//4)
exports.get = (url, action) => {
    routes["GET"][url] = action;
};
exports.post = (url, action) => {
    routes["POST"][url] = action;
};