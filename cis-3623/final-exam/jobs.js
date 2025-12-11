let salary_button = document.getElementById("find_salary");
salary_button.addEventListener("click", async function(event) {
    console.log(event.target.id + " clicked ...");
    document.getElementById("the_average").innerHTML = `
        <caption><b>Average Salary</b></caption>
        <tr>
        <th>Statistics</th>
        <th>Value</th>
        </tr>
    `;

    let type = document.getElementById("jobDropdown");
    let the_job_type = type.value;
    let exp = document.getElementsByName("expLevel");
    let the_exp_level = "";
    for (let i = 0; i < exp.length; i++) {
        if (exp[i].checked) {
            the_exp_level = exp[i].value;
            break;
        }
    };
    if (the_exp_level === "") {
        the_exp_level = null;
    }

    let emp = document.getElementsByName("empType");
    let the_emp_type = "";
    for (let i = 0; i < emp.length; i++) {
        if (emp[i].checked) {
            the_emp_type = emp[i].value;
            break;
        }
    };
    if (the_emp_type === "") {
        the_emp_type = null;
    }

    let a_response = await fetch("http://localhost:3000/returnJob-Average", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            job_type: the_job_type,
        })
    });
    let some_data = await a_response.json();
    console.log(some_data);

    the_div_placeholder = document.getElementById("the_average");

    row = document.createElement("tr");

    row.innerHTML =
    "<td>" + the_job_type + "</td>" +
    "<td>" + some_data + "</td>";
    the_div_placeholder.appendChild(row);
   
    console.log("Finding average salary for job type:" + the_job_type);
    let response = await fetch("http://localhost:3000/returnAverage-Salary", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            job_type: the_job_type,
            exp_level: the_exp_level,
            emp_level: the_emp_type
        })
    });
    let the_data = await response.json();
    console.log(the_data);

    the_div_placeholder = document.getElementById("the_average");

    row = document.createElement("tr");


    if (the_exp_level == null) {
        row.innerHTML =
        "<td>" + the_job_type + ", " + the_emp_type + "</td>" +
        "<td>" + the_data + "</td>";
    }
    else if (the_emp_type == null) {
        row.innerHTML =
        "<td>" + the_job_type + ", " + the_exp_level + "</td>" +
        "<td>" + the_data + "</td>";
    }
    else {
        row.innerHTML =
        "<td>" + the_job_type + ", " + the_exp_level + ", " + the_emp_type + "</td>" +
        "<td>" + the_data + "</td>";
    }

    the_div_placeholder.appendChild(row);

    
});
