const express =  require("express") //ALWAYS NEED
const bodyParser = require("body-parser");
const app = express() // ALWAYS NEED

app.use(express.json());
app.use(bodyParser.json());

let MyCloset = {
    D_01 : {type: "Dress", size: "Medium", color: "White", brand: "Old Navy", description: "Short with poofy sleeves"},
    S_01 : {type: "T-Shirt", size: "Large", color: "Gray", brand: "National Parks", description: "Graphic of Smokey the Bear"},
    P_01 : {type: "Pants", size: "8", color: "Light wash", brand: "Universal Thread", description: "Rip in one knee, flower pockets"}

};

app.post("/create-clothingItem", function(req, res) {
    console.log("New Clothing Item: " + req.body.Item_ID);
    console.log("Type: " + req.body.Item_type);
    console.log("Size: " + req.body.Item_size);
    console.log("Color: " + req.body.Item_color);
    console.log("Brand: " + req.body.Item_brand);
    console.log("Additional Info: " + req.body.Item_description);
    
    let Item_ID = req.body.Item_ID;
    let Item_type = req.body.Item_type;
    let Item_size = req.body.Item_size;
    let Item_color = req.body.Item_color;
    let Item_brand = req.body.Item_brand;
    let Item_description = req.body.Item_description;

    MyCloset[Item_ID] = {
        type: Item_type, 
        size: Item_size, 
        color: Item_color, 
        brand: Item_brand, 
        description: Item_description
    };

    let return_newItem = {
        status : "SUCCESS",
        output : MyCloset[Item_ID]

    };

    res.json(return_newItem);
})

app.get("/read-clothingItems", function(req, res) {
    //console.log("Call to /read-clothingItems");
    let the_return_closet = {
        status: "SUCCESS",
        the_closet : MyCloset
    };
    res.json(the_return_closet);
});

app.post("/read-specificItem", function(req, res) {
    console.log("ID of the item you want: " + req.body.specificID);
    let specificID = req.body.specificID;

    let return_item = {
        status: "SUCCESS",
        output : MyCloset[specificID]
    };

    res.json(return_item);
})



// Start a server
app.listen(3000, function() {
    console.log("Listening on port 3000")
})
