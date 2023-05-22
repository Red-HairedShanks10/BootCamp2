
//creating arrays 
var favColors = ["Red", "Blue", "Purple", "Green"];

//accessing an element in an array
console.log(favColors[0]);//accessing first element in the favColors array

//adding an element at the start of an array
favColors.unshift("Neon-Purple");
console.log("New First element is: " + favColors[0]);

//adding an element at the end of an array
favColors.push("yellow");
console.log("Last element is: " + favColors[favColors.length - 1]);//accessing last element of an array


//removing first element of an array
favColors.shift();
console.log("first element was Neon-Purple but now it is: " + favColors[0]);

//adding arrays
var favPets = ["Dogs", "Rabbits", "Birds"];

var favPetsAndColors = favColors.concat(favPets);
console.log(favPetsAndColors);

//Arrays within an array
var favThings = [favPets, favColors, ["Cars","Games", "ComicsandManga"]];

//accessing arrays within an array
console.log(favThings[2][1]);
console.log(favThings[0][1]);
console.log(favThings[1]);

//making a string with an array
 var numbers = [3,2,1];
console.log(numbers.join(" is bigger than "));

//changing webpage background color with color array
var bodyColor = document.body;
 bodyColor.style.backgroundColor = favColors[1];
