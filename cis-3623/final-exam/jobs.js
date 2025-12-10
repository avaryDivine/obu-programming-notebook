let salary_button = document.getElementById("find_salary");
salary_button.addEventListener("click", async function(event) {
    console.log(event.target.id + " clicked ...");
    let type = document.getElementById("jobDropdown");

    let the_job_type = type.value;

    console.log("Finding highest salary for job type:" + the_job_type);

    let response = await fetch("http://localhost:3000/returnHighest-Salary", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            job_type: the_job_type,
        })
    });
    let the_data = await response.json();
    console.log(the_data);

    let the_div_placeholder = document.getElementById("salary_id");
    let the_response = document.createElement("p");
    the_response.innerHTML = "<b>The highest salary is:</b>" + the_data;
    the_div_placeholder.appendChild(the_response);
});
