//user input for detonation from 1-10
var detonationSeconds = prompt("put detonation second(from 1-10)");

//loop until detonation condition is false
for (var detonation = detonationSeconds; detonation > 0; detonation--) {

        if (detonation === 1) {
                //if detonation seconds reaches 1 display message with smile of destruction
                alert("detonation in " + detonation + " :)");
        } else {
                //otherwise desplay normal message
                alert("detonation in " + detonation);
        }
}
alert("Booooom!!");

/*
var colors = ["Red","Blue", "Purple", "Green"];

   for(var i = 0; i < colors.length; i++)
   {
    console.log("My favourite colors are " + colors[i] + ":)");
   }
 


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

/*
//tryItOut: powers of 3 forloop

//number limit selected by user to be reached by powers of 3 
var selectedNumber = prompt("enter number(from 30 - 10000) to see the powers of 3 under that number: ");

//if selected number is in between 30 and 10000 then run the loop
if (selectedNumber >= 30 && selectedNumber <= 10000) {
        for (var y = 3; y < selectedNumber; y = y * 3) {
                //display all the powers of three under the selected number limit
                console.log(y);

        }
}
//otherwise warn them of putting numbers not in the parameters  
else {
        alert("!!Numbers not in given parameters are invalid!!");
}



//Programing Challenge

//#1
/*
var animals = ["Hawk","Snake","Wolf","Crocodile","Tiger","Honey Badgers"];

   for(var j = 0; j < animals.length; j++ ){
           
        animals[j] = "Awesome " + animals[j];
            
   } 
   console.log(animals);

*/
/*
   var alphabet = "abcdefghijklmnopqrstuvwxyz";
       var randomString = "";
       
      
       while(randomString.length <= 6)
       {
            
          randomString += alphabet[Math.floor(Math.random() * alphabet.length)];
           
       }
       
       console.log(randomString);
*/
