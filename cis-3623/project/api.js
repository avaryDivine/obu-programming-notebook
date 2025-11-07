
let MyCloset = {
    "dresses": {
        "d_01" : {size: "Medium", color: "White", brand: "Old Navy", description: "Short with poofy sleeves"},
    },
    "shirts" : {
        "s_01" : {size: "Large", color: "Gray", brand: "National Parks", description: "Graphic of Smokey the Bear"}
    },
    "pants" : {
        "p_01" : {size: "8", color: "Light wash", brand: "Universal Thread", description: "Rip in one knee, flower pockets"}
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

export function returnItem(type, item_ID) {
    let return_item = {
        status: "OK",
        item: MyCloset[type][item_ID]
    }
    return return_item;
}
//console.log(MyCloset["pants"]["p_01"]);
//let the_return = returnItem("dresses", "d_01");
//console.log(the_return);

export function addItem(type, item_ID, size, color, brand, description) {
   
    let the_type = returnCategory(type);
    the_type[item_ID] = {"size" : size, "color" : color, "brand" : brand, "description" : description};
    let new_item = MyCloset[type][item_ID];
    return new_item;
}

export function deleteItem(type, item_ID) {
    delete MyCloset[type][item_ID];
}

//deleteItem("shirts", "s_01");
//let deletedCloset = returnCloset();
//console.log(deletedCloset);





