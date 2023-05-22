//creating secret words
var words = [
    "javascript",
    "monkey",
    "amazing",
    "pancake", 
    "cave",
    "Devil"
];

// picking random word from words array
var word = words[Math.floor(Math.random() * words.length)];

//creating answer array
var answerArray = [];
for (var i = 0; i < word.length; i++) {
    answerArray[i] = "_";
}

var remainingLetters = word.length;
var guesses = 10;

while ((remainingLetters > 0) && guesses > 0) {
    // Game code goes here

    // Show the player their progress

    alert(answerArray.join(" "));
     

    // Take input from the player
    var guess = prompt("Guess a letter, or click cancel to stop playing."); 
       guesses--;
      guess = guess.toLowerCase();
      alert("you have " + guesses +" guesses left ");

    if (guess === null) {
        break;
    } 
    
    else if (guess.length !== 1) {
        alert("Please enter a single letter.");
    } 
    
    else {
        // Update the game state with the guess
        for (var j = 0; j < word.length; j++) {
            if ((word[j] === guess) && (answerArray[j] === "_")) {
                answerArray[j] = guess;
                remainingLetters--;
            }
        }



    } 

}

alert(answerArray.join(" "));
if(remainingLetters === 0 ){
alert("Good job! The answer was " + word);
}
else if(guesses === 0){
    alert("Your guesses were only " + guesses);
}