import express from "express"
import bodyParser from "body-parser"
import cors from "cors";
import {returnJob, returnLevelNum, returnHighestSalary, returnAverageSalary, returnJobAverage} from "./api.js"

const app = express(); // ALWAYS

app.use(express.json());
app.use(bodyParser.json());
app.use(cors());

app.post("/returnLevel-Num", function(req,res) {
    console.log("/returnLevel-Num");
    let job_type = req.body.job_type;
    let exp_level = req.body.exp_level;

    let level = returnLevelNum(job_type, exp_level);
    res.json(level);
})

app.post("/return-Job", function(req,res) {
    console.log("/return-Job");
    let job_type = req.body.job_type;

    let level = returnJob(job_type);
    res.json(level);
})

app.post("/returnHighest-Salary", function(req,res) {
    console.log("/returnHighest-Salary");
    let job_type = req.body.job_type;

    let level = returnHighestSalary(job_type);
    res.json(level);
})

app.post("/returnAverage-Salary", function(req,res) {
    console.log("/returnAverage-Salary");
    let job_type = req.body.job_type;
    let exp_level = req.body.exp_level;
    let emp_type = req.body.emp_type;

    let salary = returnAverageSalary(job_type, exp_level, emp_type);
    res.json(salary);
})

app.post("/returnJob-Average", function(req,res) {
    console.log("/returnJob-Average");
    let job_type = req.body.job_type;

    let salary = returnJobAverage(job_type);
    res.json(salary);
})


// Start a server
app.listen(3000, function() {
    console.log("Listening on port 3000")
})