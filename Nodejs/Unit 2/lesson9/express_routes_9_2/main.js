"use strict";

const port = 3000,
  express = require("express"),
  app = express();

app.use(
  express.urlencoded({
    extended: false
  })
);
app.use(express.json());

app.use((req, res, next) => {
  console.log(`request made to: ${req.url}`);
  next();
});

app.post("/", (req, res) => {
  console.log(req.body);
  console.log(req.query);
  res.send("POST Successful!");
});

app.get("/items/:vegetable", (req, res) => {//a)for get vegtable in items param
  let veg = req.params.vegetable;//b)store vegetable to veg variable
  res.send(`This is the page for ${veg}`);//c)send response with the veg
});

app.listen(port, () => {
  console.log(`Server running on port: ${port}`);
});
