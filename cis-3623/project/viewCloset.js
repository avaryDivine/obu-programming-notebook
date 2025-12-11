let view_closet_button = document.getElementById("view_closet_btn");
    view_closet_button.addEventListener("click", async function(event) {
        console.log(event.target.id + " clicked ...");
        document.getElementById("the_shirts").innerHTML = `
            <caption><b>Shirts</b></caption>
            <tr>
            <th>ID</th><th>Size</th><th>Color</th><th>Brand</th><th>Description</th>
            </tr>
        `;

        document.getElementById("the_pants").innerHTML = `
            <caption><b>Pants</b></caption>
            <tr>
            <th>ID</th><th>Size</th><th>Color</th><th>Brand</th><th>Description</th>
            </tr>
        `;

        document.getElementById("the_dresses").innerHTML = `
            <caption><b>Dresses</b></caption>
            <tr>
            <th>ID</th><th>Size</th><th>Color</th><th>Brand</th><th>Description</th>
            </tr>
        `;

       let response = await fetch("http://localhost:3000/return-closet", {
            method: "POST",
            headers: {
                'Accept' : 'application/json',
                'Content-Type' : 'application/json'
            }
        });
        let the_data = await response.json();
        console.log(the_data);
        
        let the_closet = the_data.closet;

        for (let type in the_closet) {
            let the_div_placeholder = document.getElementById("the_" + type);
            for (let id in the_closet[type]) {
                let item = the_closet[type][id];

                let row = document.createElement("tr");

                row.innerHTML =
                "<td>" + id + "</td>" +
                "<td>" + item.size + "</td>" +
                "<td><div style='width:20px;height:20px;background:" + item.color + ";margin:auto;'></div>" + item.color + "</td>" +
                "<td>" + item.brand + "</td>" +
                "<td>" + item.description + "</td>";

                the_div_placeholder.appendChild(row);
            }
        }
        
    });