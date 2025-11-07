async function call_add_item(new_item_type, new_item_ID, new_item_size, new_item_color, new_item_brand, new_item_description) {
    let response = await fetch("http://localhost:3000/add-item", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            type: new_item_type,
            Item_ID: new_item_ID,
            size: new_item_size,
            color: new_item_color,
            brand: new_item_brand,
            description: new_item_description
        })

    });
    
    let the_data = await response.json();
    console.log(the_data);
};
//call_add_item("shirts", "s_02", "small", "blue", "AE", "long sleeve");
//call_return_category("shirts");

async function call_return_category(call_type) {
    let response = await fetch("http://localhost:3000/return-category", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            type: call_type,
        })
    });
    let the_data = await response.json();
    console.log(the_data);
};
//call_return_category("dresses");


async function call_read_clothing_items() {
    let response = await fetch("http://localhost:3000/read-clothingItems", {
        method : "GET",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        }
    });
    let the_data = await response.json();
    let the_closet = the_data.the_closet;
    for (let key in the_closet) {
        console.log("Item : " + the_closet[key])
    }
};

async function call_read_specific_item(ID) {
    let response = await fetch("http://localhost:3000/read-specificItem", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            specificID : ID
        })

    });
    
    let the_data = await response.json();
    console.log(the_data);
};

//call_read_specific_item("S_01");

async function call_delete_item(delete_item_type, delete_item_ID) {
    let response = await fetch("http://localhost:3000/delete-item", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            type: delete_item_type,
            Item_ID: delete_item_ID,
        })

    });
    
    let the_data = await response.json();
    console.log(the_data);
};

call_delete_item("shirts", "s_01");
call_return_category("shirts");