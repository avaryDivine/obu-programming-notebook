
async function return_SmallEvent(theSection, theEvent, theElementIdx) {
    let response = await fetch("http://localhost:3000/return-SmallEvent", {
        method: "POST",
        headers: {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify({
            section: theSection,
            event: theEvent,
            elementIdx: theElementIdx

        })
    });
    let the_data = await response.json();
    console.log(the_data); 
};
//return_SmallEvent("the-weekend", "bison-day", 0);

async function return_subEvent(theSection, theEvent) {
    let response = await fetch("http://localhost:3000/return-subEvent", {
        method: "POST",
        headers: {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify({
            section: theSection,
            event: theEvent

        })
    });
    let the_data = await response.json();
    console.log(the_data); 
};


async function add_event(category, eventName, the_name, the_date, the_location) {
    let response = await fetch("http://localhost:3000/add-event", {
        method: "POST",
        headers: {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify({
            event_category : category,
            event_name : eventName,
            sub_event_name : the_name,
            date : the_date,
            location : the_location

        })
    });
    let the_data = await response.json();
    console.log(the_data); 
};
//add_event("the-weekend", "bison-day", "Comp Sci", "10-15-25", "Bailey");
//return_SmallEvent("the-weekend", "bison-day", 3);

async function delete_event(category, eventName, the_name) {
    let response = await fetch("http://localhost:3000/delete-event", {
        method: "POST",
        headers: {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify({
            event_category : category,
            event_name : eventName,
            sub_event_name : the_name,

        })
    });
    let the_data = await response.json();
    console.log(the_data); 
};
delete_event("stem-day", "science", "Nursing");
return_subEvent("stem-day", "science");


