//stores items in the localStorage
function store() {
    //a)
    var brand = document.getElementById('carBrand').value;
    var price = document.getElementById('carPrice').value;
    var key = document.getElementById('key').value; //gets the key from the user

    const car = {
        brand: brand,
        price: price,
    }

    //b)
    window.localStorage.setItem(key, JSON.stringify(car));
    //converting object to string
}

////


//2) retrieves items in the localStorage
function retrieveRecords() {
    console.log("retrieve records");
    var key = document.getElementById('retrieveKey').value;
    var records = window.localStorage.getItem(key);//a
    var paragraph = document.createElement("p");
    var infor = document.createTextNode(records);
    paragraph.appendChild(infor);
    var element = document.getElementById("retrieve");
    element.appendChild(paragraph);
}

//3) deletes item from localStorage
function removeItem() {
    var key = document.getElementById('removeKey').value;
    localStorage.removeItem(key)
    console.log("remove items");
}


//4) clears the entire localStorage
function clearStorage() {
    localStorage.clear()//absolute clearance
    console.log("clear records");
}


//5) ensures the page is loaded before functions are executed.
window.onload = function () {
    document.getElementById("carForm").onsubmit = store
    document.getElementById("clearButton").onclick = clearStorage
    document.getElementById("removeButton").onclick = removeItem
    document.getElementById("retrieveButton").onclick = retrieveRecords
}