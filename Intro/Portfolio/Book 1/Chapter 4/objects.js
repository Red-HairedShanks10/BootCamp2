//creating an object
var dog = {
     _name: "",
     age: 3,
     $status: "Stray",

};
 

/***accessing properties of an array***/
//using dot notation to access key-value pairs
console.log(dog.age);

//using bracket notation to access key-value pairs[]
console.log(dog["$status"]);

/*adding new keys and values*/
//using dot notation to add keys and values
dog.color = "brown";
//using bracket notation to add keys and values
dog["breed"] = "Husky";

console.log(dog);