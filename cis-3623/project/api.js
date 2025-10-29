
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
console.log(MyCloset);

function returnCloset() {
    let return_closet = {
        status: "OK",
        closet: MyCloset
    }
    return return_closet;
}
//console.log(MyCloset["pants"]);

function returnCategory(type) {
    let theType = MyCloset[type];
    return theType;
}
let category = returnCategory("shirt");
console.log(category);

export function returnItem(type, ID) {
    let return_item = {
        status: "OK",
        itme: MyCloset[type][ID]
    }
    return return_item;
}
//let the_return = returnItem("dress", 1);
//console.log(the_return);

function addItem(type, ID, size, color, brand, description) {
    let the_type = returnCategory(type);
    the_type[ID] = {"size" : size, "color" : color, "brand" : brand, "description" : description};
    let new_item = MyCloset[type][ID];
    return new_item;
}

//let displayItem = addItem("dress", "D_02", "medium", "blue","Walmart", "tank top, long");
//console.log(displayItem);





