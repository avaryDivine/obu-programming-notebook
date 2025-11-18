let find_item_button = document.getElementById("find_item_btn");
    find_item_button.addEventListener("click", async function(event) {
        console.log(event.target.id + " clicked ...");
        let type = document.getElementsByName("type");
        let return_item_type = "";
        for (let i = 0; i < type.length; i++) {
            if (type[i].checked) {
                return_item_type = type[i].value;
                break;
            };
        };
        let id_input_text = document.getElementById("input-id");
        console.log("Finding item with:", {
            id: id_input_text.value,
        });
       let response = await fetch("http://localhost:3000/return-item", {
            method: "POST",
            headers: {
                'Accept' : 'application/json',
                'Content-Type' : 'application/json'
            },
            body : JSON.stringify({
                type : return_item_type,
                item_id : id_input_text.value
            })
        });
        let the_data = await response.json();
        console.log(the_data);
       

        let the_div_placeholder = document.getElementById("find_item");
        let the_response = document.createElement("p");
        if (the_data.status === "ERROR") {
            let item = the_data.item;
            the_response.innerHTML = "<b>" + item + "</b>";
            the_div_placeholder.appendChild(the_response);
        }
        else {
            let item = the_data.item;
            the_response.innerHTML = 
            "<h3>Item Found:</h3>" +
            "<b>Size: </b>" + item.size + "<br>" +
            "<b>Color: </b>" + item.color + "<br>" +
            "<b>Brand: </b>" + item.brand + "<br>" +
            "<b>Description: </b>" + item.description;
            the_div_placeholder.appendChild(the_response);
        }
    });


    let update_item_button = document.getElementById("update_item_btn");
    update_item_button.addEventListener("click", async function(event) {
        console.log(event.target.id + " clicked ...");
        let type = document.getElementsByName("type");
        let update_item_type = "";
        for (let i = 0; i < type.length; i++) {
            if (type[i].checked) {
                update_item_type = type[i].value;
                break;
            };
        };
        let id_input_text = document.getElementById("input-id");
        let size = document.getElementsByName("size");
        let update_item_size = "";
        for (let i = 0; i < size.length; i++) {  
            if (size[i].checked) {
                update_item_size = size[i].value;
                break;
            };
        };
        let color = document.getElementById("input-color");
        let brand = document.getElementById("input-brand");
        let description = document.getElementById("input-description");

        let update_item_id = id_input_text.value;
        let update_item_color = color.value;
        let update_item_brand = brand.value;
        let update_item_description = description.value;

        console.log("Updating item with characteristics:", {
            type: update_item_type,
            id: update_item_id,
            size: update_item_size,
            color: update_item_color,
            brand: update_item_brand,
            description: update_item_description
        });

       let response = await fetch("http://localhost:3000/update-item", {
            method: "POST",
            headers: {
                'Accept' : 'application/json',
                'Content-Type' : 'application/json'
            },
            body : JSON.stringify({
                type: update_item_type,
                item_id: update_item_id,
                size: update_item_size,
                color: update_item_color,
                brand: update_item_brand,
                description: update_item_description
            })
        });
        let the_data = await response.json();
        console.log(the_data);
      

        let the_div_placeholder = document.getElementById("update_result");
        let the_response = document.createElement("p");
        let item = the_data.item;
        the_response.innerHTML = "<b>" + item + "</b>"
        the_div_placeholder.appendChild(the_response);
    });
