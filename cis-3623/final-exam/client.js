async function returnLevel_Num(the_type, experience) {
    let response = await fetch("http://localhost:3000/returnLevel-Num", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            job_type: the_type,
            exp_level: experience
        })
    });
    let the_data = await response.json();
    console.log(the_data);
};
returnLevel_Num("AI Engineer", "SE");

async function return_Job(the_type) {
    let response = await fetch("http://localhost:3000/return-Job", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            job_type: the_type,
        })
    });
    let the_data = await response.json();
    console.log(the_data);
};
return_Job("AI Engineer");

async function returnHighest_Salary(the_type) {
    let response = await fetch("http://localhost:3000/returnHighest-Salary", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            job_type: the_type,
        })
    });
    let the_data = await response.json();
    console.log(the_data);
};
returnHighest_Salary("AI Engineer");
