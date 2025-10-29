import express from "express"
import bodyParser from "body-parser"
import {returnItem} from "./api.js"

const app = express(); // ALWAYS

app.use(express.json());
app.use(bodyParser.json());

app.post("/return-Item", function(req,res) {
    console.log("/return-Item");
    let type = req.body.type;
    let ID = req.body.ID;

    let the_item = returnItem(type, ID);
    res.json(the_item);
})




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
