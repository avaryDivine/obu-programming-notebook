async function call_add_item(new_item_type, new_item_id, new_item_size, new_item_color, new_item_brand, new_item_description) {
    let response = await fetch("http://localhost:3000/add-item", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
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
//call_return_category("shirts");


async function call_return_closet() {
    let response = await fetch("http://localhost:3000/return-closet", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        }
    });
    let the_data = await response.json();
    let the_closet = the_data.closet;
    console.log(the_closet);
};
//call_return_closet();

async function call_return_item(the_type, id) {
    let response = await fetch("http://localhost:3000/return-item", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            type : the_type,
            item_id : id
        })

    });
    
    let the_data = await response.json();
    console.log(the_data);
};

//call_return_item("shirts","s_01");

async function call_delete_item(delete_item_type, delete_item_id) {
    let response = await fetch("http://localhost:3000/delete-item", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
        },
        body : JSON.stringify({
            type: delete_item_type,
            item_id: delete_item_id,
        })

    });
    
    let the_data = await response.json();
    console.log(the_data);
};

//call_delete_item("shirts", "s_01");

async function call_update_item(new_item_type, new_item_id, new_item_size, new_item_color, new_item_brand, new_item_description) {
    let response = await fetch("http://localhost:3000/update-item", {
        method : "POST",
        headers : {
            'Accept' : 'application/json',
            'Content-type' : 'application/json'
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
};

//call_update_item("shirts", "s_01", "large", "black", "Old Navy", "long sleeve");
//call_return_category("shirts");
