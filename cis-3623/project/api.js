
let MyCloset = {
    "shirts" : {
        "s_01" : {size: "Large", color: "#f85186", brand: "National Parks", description: "Graphic of Smokey the Bear"}
    },
     "pants" : {
        "p_01" : {size: "Medium", color: "#b6aaba", brand: "Universal Thread", description: "Rip in one knee"}
    },
    "dresses": {
        "d_01" : {size: "Medium", color: "#aa0024", brand: "Old Navy", description: "Short with poofy sleeves"},
    }
   

};
//console.log(MyCloset);

export function returnCloset() {
    let return_closet = {
        status: "OK",
        closet: MyCloset
    }
    return return_closet;
}
//let closet = returnCloset();
//console.log(closet);

export function returnCategory(type) {
    let theType = MyCloset[type];
    return theType;
}
//let category = returnCategory("shirts");
//console.log(category);

export function returnItem(type, item_id) {
    if (!MyCloset[type][item_id]) {
        return { status: "ERROR", item: "Item does not exist!" };
    }
    let return_item = {
        status: "OK",
        item: MyCloset[type][item_id]
    }
    return return_item;
}
//console.log(MyCloset["pants"]["p_01"]);
//let the_return = returnItem("dresses", "d_01");
//console.log(the_return);

export function addItem(type, item_id, size, color, brand, description) {
   
    let the_type = returnCategory(type);
    the_type[item_id] = {"size" : size, "color" : color, "brand" : brand, "description" : description};
    let new_item = MyCloset[type][item_id];
    return new_item;
}

export function deleteItem(type, item_id) {
    delete MyCloset[type][item_id];
    let return_status = {
        status : "OK",
        message : "Deleted!"
    }
    return return_status;
}
//deleteItem("shirts", "s_01");
//console.log(returnCloset());

export function updateItem(type, item_id, size, color, brand, description) {
    let the_type = returnCategory(type);
    the_type[item_id] = {"size" : size, "color" : color, "brand" : brand, "description" : description};
    let return_status = {
        status: "OK",
        message : "Updated!"
    }
    return return_status;
}

//deleteItem("shirts", "s_01");
//let deletedCloset = returnCloset();
//console.log(deletedCloset);





