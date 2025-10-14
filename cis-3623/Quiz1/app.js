import express from "express"
import bodyParser from "body-parser"
import {getSmallEvent } from "./api.js"

const app = express(); // ALWAYS

app.use(express.json());
app.use(bodyParser.json());

app.post("/return-SmallEvent", function(req, res) {
    console.log("/return-SmallEvent");
    let section = req.body.section;
    let event = req.body.event;
    let elementIdx = req.body.elementIdx;
    console.log("/return-SmallEvent section: " + section + ", event: " + event + ", elementIdx: " + elementIdx);

    let the_event = getSmallEvent(section, event, elementIdx);

    res.json(the_event);
})



// Start a server
app.listen(3000, function() {
    console.log("Listening on port 3000");
});