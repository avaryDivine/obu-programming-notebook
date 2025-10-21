async function call_create_item(new_item_ID, new_item_type, new_item_size, new_item_color, new_item_brand, new_item_description) {
    let response = await fetch("http://localhost:3000/create-clothingItem", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            Item_ID: new_item_ID,
            Item_type: new_item_type,
            Item_size: new_item_size,
            Item_color: new_item_color,
            Item_brand: new_item_brand,
            Item_description: new_item_description
        })

    });
    
    let the_data = await response.json();
    console.log(the_data);
};


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

call_read_specific_item("S_01");
