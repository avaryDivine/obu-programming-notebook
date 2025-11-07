import express from "express"
import bodyParser from "body-parser"
import cors from "cors";
import {returnItem, returnCategory, addItem, deleteItem} from "./api.js"

const app = express(); // ALWAYS

app.use(express.json());
app.use(bodyParser.json());
app.use(cors());

app.post("/return-category", function(req,res) {
    console.log("/return-category");
    let type = req.body.type;

    let the_category = returnCategory(type);
    res.json(the_category);
})


app.post("/return-Item", function(req,res) {
    console.log("/return-Item");
    let type = req.body.type;
    let item_ID = req.body.ID;

    let the_item = returnItem(type, item_ID);
    res.json(the_item);
})


app.post("/add-item", function(req, res) {
    console.log("/add-Item")
    
    
    let type = req.body.type;
    let item_ID = req.body.Item_ID;
    let size = req.body.size;
    let color = req.body.color;
    let brand = req.body.brand;
    let description = req.body.description;

    let new_Item = addItem(type, item_ID, size, color, brand, description);
    res.json(new_Item);
})

app.post("/delete-item", function(req, res) {
    console.log("/delete-Item")
    
    
    let type = req.body.type;
    let item_ID = req.body.Item_ID;

    let deleted_Item = deleteItem(type, item_ID);
    res.json(deleted_Item);
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
