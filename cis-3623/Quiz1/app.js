import express from "express"
import bodyParser from "body-parser"
import {returnSmallEvent, addEvent, deleteEvent, returnSubEvent } from "./api.js"

const app = express(); // ALWAYS

app.use(express.json());
app.use(bodyParser.json());

app.post("/return-SmallEvent", function(req, res) {
    console.log("/return-SmallEvent");
    let section = req.body.section;
    let event = req.body.event;
    let elementIdx = req.body.elementIdx;
    console.log("/return-SmallEvent section: " + section + ", event: " + event + ", elementIdx: " + elementIdx);

    let the_event = returnSmallEvent(section, event, elementIdx);

    res.json(the_event);
});

app.post("/return-subEvent", function(req, res) {
    console.log("/return-subEvent");
    let section = req.body.section;
    let event = req.body.event;
    console.log("/return-subEvent section: " + section + ", event: " + event);

    let the_event = returnSubEvent(section, event);

    res.json(the_event);
})



app.post("/add-event", function(req, res) {
    let event_category = req.body.event_category;
    let event_name = req.body.event_name;
    let sub_event_name = req.body.sub_event_name;
    let date = req.body.date;
    let location = req.body.location;

    let addedEvent = {
        status: "OK",
        the_new_sub_event : {
            event_category: event_category,
            event_name: event_name,
            sub_event_name: sub_event_name,
            date: date,
            location: location
        }
    }

    addEvent(event_category, event_name, sub_event_name, date, location);
    res.json(addedEvent);

});

app.post("/delete-event", function(req, res) {
    let event_category = req.body.event_category;
    let event_name = req.body.event_name;
    let sub_event_name = req.body.sub_event_name;

    let deletedEvent = {
        status: "OK",
        the_deleted_event : {
            event_category: event_category,
            event_name: event_name,
            sub_event_name: sub_event_name,
        }
    }

    deleteEvent(event_category, event_name, sub_event_name);
    res.json(deletedEvent);

});


// Start a server
app.listen(3000, function() {
    console.log("Listening on port 3000");
});