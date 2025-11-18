let events = {
    "the-weekend" : {
        "bison-day" : [
            {
                "name" : "Fun on the oval",
                "date" : "2025-10-24",
                "location" : "The oval"
            },
            {
                "name" : "Musical gala",
                "date" : "2025-10-24",
                "location" : "RAWC"
            },
            {
                "name" : "Bison pep rally",
                "date" : "2025-10-24",
                "location" : "Noble"
            }
        ],
        "family-weekend" : [
            {
                "name" : "Ice cream social",
                "date" : "2025-10-24",
                "location" : "Lower level GC"
            },
            {
                "name" : "Family weekend worship and fellowship",
                "date" : "2025-10-25",
                "location" : "Upper GC 219-220"
            }
        ]
    },
    "stem-day" : {
        "science" : [
            {
                "name" : "Nursing",
                "date" : "2025-11-15",
                "location" : "Stavros sim lab"
            },
            {
                "name" : "Rocketry",
                "date" : "2025-11-15",
                "location" : "The oval"
            }
        ],
        "technology" : [
            {
                "name" : "Computer Science",
                "date" : "2025-11-15",
                "location" : "Stavros computer lab"
            }
        ]
    }
}

//console.log(events);

// section = "stem-day" or "the-weekend"
// event = "bison day", "family-weekend" or "science", "technology"
// element = "name", "date" or "location"

function getBigEvent(section) {
    let return_events = {
        status: "OK",
        events: events[section]
    }
    return return_events;
}

//let anEvent = getBigEvent("the-weekend");
//console.log(anEvent);

export function returnSubEvent(section, event) {
    let theEvents = events[section][event]
    return theEvents;
}

//let Bison = returnSubEvent("the-weekend", "family-weekend");
//console.log(Bison);



export function returnSmallEvent(section, event, elementIdx) {
    let return_events = {
        status: "OK",
        events: events[section][event][elementIdx]
    }
    return return_events;
}

//let BisonEvent = returnSmallEvent("stem-day", "science", 0);
//console.log(BisonEvent);


function addSmallEvent(section, event, jsonBook) {
    let BigEvent = returnSubEvent(section, event);
    BigEvent.push(jsonBook);
}

addSmallEvent("the-weekend", "family-weekend",
    {
        "name" : "Math Talk",
        "date" : "2025-10-24",
        "location" : "Bailey"
    }
)

//let bisonEvent = returnSubEvent("the-weekend", "family-weekend");
//console.log(bisonEvent);


function updateElement(section, event, eventIdx, element, updatedValue){
    events[section][event][eventIdx][element] = updatedValue;
}

//updateElement("stem-day", "science", 0, "date", "10-15-25");
//let smallEvent = returnSmallEvent("stem-day", "science", 0);
//console.log(smallEvent);

function deleteElement(section, event, eventIdx) {
    let theSmallEvent = events[section][event];
    theSmallEvent.splice(eventIdx,1);
}

//deleteElement("stem-day", "science", 0);
//let Event = returnSubEvent("stem-day", "science");
//console.log(Event)

export function addEvent(event_category, event_name, sub_event_name, date, location) {
    addSmallEvent(event_category, event_name, {"name": sub_event_name, "date": date, "location":location})

    let newEvent = events[event_category][event_name];
    let printEvent = newEvent[newEvent.length - 1];
    return printEvent;
}
//let displayEvent = addEvent("the-weekend", "bison-day", "tours", "10-15-25", "WMU");
//console.log(displayEvent);

export function deleteEvent(event_category, event_name, sub_event_name) {
    for (let i = 0; i < events[event_category][event_name].length; i++) {
        if (events[event_category][event_name][i].name === sub_event_name) {
            events[event_category][event_name].splice(i, 1);
            break;
        }
    }
}

//deleteEvent("stem-day", "science", "Nursing");
//let the_delete = returnSubEvent("stem-day", "science");
//console.log(the_delete);