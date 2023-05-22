/*var thisFunction = function(){
    console.log("Hello World");
};

thisFunction();

function secondFunction (){
    alert("Yeeeerr!");
}

secondFunction();

 */


/*userNameInput = prompt("Enter Name: ");


function thirdFunction(userName){
    console.log("Hello: " + userName);
}

thirdFunction(userNameInput);
*/
 
/*
function drawCats (howManytimes){
     for (var i = 0; i < howManytimes; i++){
        console.log(i + " =^.^=");
     }
};

drawCats(10);
*/

/* var userPrintingChoice = prompt("what do you want to print?");

 var userNumberOfChoice = prompt("How many times? ");
function printMultipleTimes(whatToDraw,howManytimes){
    for (var i = 0; i < howManytimes; i++){
        console.log(i + " " + whatToDraw);
    }
};

printMultipleTimes(userPrintingChoice,userNumberOfChoice);

*/

/*
function double(number){
   return number * 2;
};

console.log(  double(20)/double(2) );
*/

/*
function pickRandomWord (words){
      return words[Math.floor(Math.random() * words.length)];
}; */
 /*
var someRandomWords = ["Lethal","Smooth","Criminal","Poison"];

console.log(pickRandomWord(someRandomWords));
*/
 

/*
function generateRandomInsult (){
    var randomBodyParts = ["Face", "Nose", "Hair", "Arms"];
    var randomAdjectives = ["Smelly", "Asymmetrical", "Dusty"];
    var randomWords = ["Fly", "Koala", "Stick", "Donkey", "Rat"];
    
       var randomString = "Your " + pickRandomWord(randomBodyParts) + " is like a " + pickRandomWord(randomAdjectives) 
       + " " + pickRandomWord(randomWords);

    return randomString;
};

console.log(generateRandomInsult());

*/

/*
function fifthLetter  (myname) {
     if (myname.length < 5) {
     return;
    }
    return "The fifth letter of your name is " + myname[4] + ".";
    };

    console.log(fifthLetter("Kilomaisa"));
    */

    var randomScore = Math.floor(Math.random() * 10);
function medalForScore (score){
     if (score < 5) {
        return "Bronze";
     }

     if (score < 9){
        return "silver";
    }

    return "Gold";
};


console.log(medalForScore(randomScore));