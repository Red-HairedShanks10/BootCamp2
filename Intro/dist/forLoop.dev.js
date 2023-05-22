"use strict";

/*var detonationSeconds = prompt("put detonation second(from 1-10)");

for (var detonation = detonationSeconds; detonation > 0; detonation--)
{
        
        if (detonation === 1) {
                alert("detonation in " + detonation + " :)" );
        }else{
                alert("detonation in " + detonation );
        }
}alert("Booooom!!");
*/

/*var colors = ["Red","Blue", "Purple", "Green"];

   for(var i = 0; i < colors.length; i++)
   {
    console.log("My favourite colors are " + colors[i] + ":)");
   }
 */

/*
   var inPutName = prompt("let us see what your name contains");

   for (var i = 0; i < inPutName.length; i++ )
   {
     console.log("This name contains the letters: " + inPutName[i] + ".");
   }
*/

/*for (var x = 2; x < 10000; x = x * 2) {
    console.log(x);
    }
*/
//tryItOut: powers of 3 forloop

/*var selectedNumber = prompt("enter number(from 30 - 10000) to see the powers of 3 under that number: ");
      
if(selectedNumber >=30 && selectedNumber <= 10000){
for(var y = 3; y < selectedNumber; y = y * 3)
{
       console.log(y);

}
}
else {
alert("!!Numbers not in given parameters are invalid!!");
}
*/
//Programing Challenge
//#1

/*
var animals = ["Hawk","Snake","Wolf","Crocodile","Tiger","Honey Badgers"];

   for(var j = 0; j < animals.length; j++ ){
           
        animals[j] = "Awesome " + animals[j];
            
   } 
   console.log(animals);

*/
var alphabet = "abcdefghijklmnopqrstuvwxyz";
var randomString = "";

while (randomString.length <= 6) {
  randomString += alphabet[Math.floor(Math.random() * alphabet.length)];
}

console.log(randomString);