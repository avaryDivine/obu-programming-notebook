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
                item_ID : id_input_text.value
            })
        });
        let the_data = await response.json();
        console.log(the_data);
        console.log("Success");

        let the_div_placeholder = document.getElementById("find_item");
        let the_response = document.createElement("p");
        let item = the_data.item;
        the_response.innerHTML = `
            <h3>Item Found:</h3>
            <b>Size:</b> ${item.size}<br>
            <b>Color:</b> ${item.color}<br>
            <b>Brand:</b> ${item.brand}<br>
            <b>Description:</b> ${item.description}`
        the_div_placeholder.appendChild(the_response);
    });
