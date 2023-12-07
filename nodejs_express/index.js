var express = require("express");
var app = express();


// app.get(url, fun)
//calc?num1=5&num2=9
app.get("/calc", (req, res) => {
    x = Number(req.query['num1'])
    y = Number(req.query['num2'])
    res.send(`${x} + ${y} = ${x + y}`)
})

//CW1: CA Web service /sub which with method POST and print message I am from sub
app.post("/calc", (req, res) => {
    x = req.query['num1']
    y = req.query['num2']
    res.send(`${x} - ${y} = ${x - y}`)
})

app.use(express.json())

//CW2: CA Web service /mul which with method PUT and print message I am from mul
app.put("/calc", (req, res) => {
    console.log(req.body)
    x = req.body['num1']
    y = req.body['num2']
    res.send(`${x} * ${y} = ${x * y}`)
})

//CW3: CA Web service /div which with method DELETE and print message I am from div
app.delete("/calc", (req, res) => {
    res.send("I am from div function")
})


var cors = require('cors')
app.use(cors())

app.get("/sqr/:num", (req, res) => {
    console.log(req.params)
    x = req.params['num']
    res.send({"result": `I am from web service ${x * x}`})
    // res.send(`Square of ${x} is ${x * x}`)
})















app.listen(8989, () => {
    console.log("Listening at port 8989");
});