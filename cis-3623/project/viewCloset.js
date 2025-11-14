let view_closet_button = document.getElementById("view_closet_btn");
    view_closet_button.addEventListener("click", async function(event) {
        console.log(event.target.id + " clicked ...");
       let response = await fetch("http://localhost:3000/return-closet", {
            method: "POST",
            headers: {
                'Accept' : 'application/json',
                'Content-Type' : 'application/json'
            }
        });
        let the_data = await response.json();
        console.log(the_data);
        

        let the_div_placeholder = document.getElementById("closet_table");
        let the_response = document.createElement("p");
        let categories = the_data.type;
        for (let type in the_data) {
            for (let id in the_data[type]) {
                let item = the_data[type][id];

                let row = document.createElement("tr");

                row.innerHTML = `
                <td>${type}</td>
                <td>${id}</td>
                <td>${item.size}</td>
                <td>${item.color}</td>
                <td>${item.brand}</td>
                `;

                tableBody.appendChild(row);
            }
        }
        
    });