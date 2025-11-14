    let add_item_button = document.getElementById("add_item_btn");
    add_item_button.addEventListener("click", async function(event) {
        console.log(event.target.id + " clicked ...");
        let type = document.getElementsByName("type");
        let new_item_type = "";
        for (let i = 0; i < type.length; i++) {
            if (type[i].checked) {
                new_item_type = type[i].value;
                break;
            };
        };
        let id_input_text = document.getElementById("input-id");
        let size = document.getElementsByName("size");
        let new_item_size = "";
        for (let i = 0; i < size.length; i++) {  
            if (size[i].checked) {
                new_item_size = size[i].value;
                break;
            };
        };
        let color = document.getElementById("input-color");
        let brand = document.getElementById("input-brand");
        let description = document.getElementById("input-description");

        let new_item_id = id_input_text.value;
        let new_item_color = color.value;
        let new_item_brand = brand.value;
        let new_item_description = description.value;
        console.log("Adding new item with characteristics:", {
            type: new_item_type,
            id: new_item_id,
            size: new_item_size,
            color: new_item_color,
            brand: new_item_brand,
            description: new_item_description
        });
       let response = await fetch("http://localhost:3000/add-item", {
            method: "POST",
            headers: {
                'Accept' : 'application/json',
                'Content-Type' : 'application/json'
            },
            body : JSON.stringify({
                type: new_item_type,
                item_id: new_item_id,
                size: new_item_size,
                color: new_item_color,
                brand: new_item_brand,
                description: new_item_description
            })
        });
        let the_data = await response.json();
        console.log(the_data);
        

        let the_div_placeholder = document.getElementById("add_id");
        let the_response = document.createElement("p");
        the_response.innerHTML = "<b>Item was Added!</b>";
        the_div_placeholder.appendChild(the_response);
    });

    