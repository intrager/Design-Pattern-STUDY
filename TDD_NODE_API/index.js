var express = require("express");
var app = express();
var morgan = require("morgan");
var users = [
  {
    id: 1,
    name: "han",
  },
  {
    id: 2,
    name: "lee",
  },
  {
    id: 3,
    name: "park",
  },
];

app.use(morgan("dev"));

app.get("/users", function (req, res) {
  res.json(users);
});

app.listen(3000, function () {
  console.log("Example app listening on port 3000");
});

module.exports = app;
