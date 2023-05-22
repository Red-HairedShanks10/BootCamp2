"use strict";

/*
var greeting = "Hello World";
console.log(greeting);

var thisName = "Bas";
  console.log("Hello " + thisName);
  if (thisName.length > 7) {
        console.log("Your Name is long :(");
  }else
  {
        console.log("Short name nice :)" );
  } 
*/

/*
 console.log("!!!Warning!!! detonation in 5 seconds!")
  var detonationTimeInSeconds = 5;
    while(detonationTimeInSeconds > 0)
    {
        console.log("Detonating in: " + detonationTimeInSeconds );
        detonationTimeInSeconds--;
    }
    console.log("Boooooom!!");

*/
//Code Challenge: powers of 3 whileloop
var y = 3;
var powersOfThree = [];

while (y < 10000) {
  console.log(y);
  powersOfThree.push(y);
  y = y * 3;
}

console("these are the powers of three under 10,000: " + powersOfThree);