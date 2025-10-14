
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
}
get_SmallEvent("the-weekend", "bison-day", 0);