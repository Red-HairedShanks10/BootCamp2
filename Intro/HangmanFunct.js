var words = [
    "javascript",
    "monkey",
    "amazing",
    "pancake", 
    "cave",
    "Devil"
];

function pickword(){
    return words[Math.floor(math.random() * words.length)];
} ;

  
 var word = pickword();
 var answerArray = [];


 function SetanswerArray(word){
    for (var i = 0; i < word.length; i++) {
         answerArray[i] = "_";
    };  
};


function ShowPlayerProgress(answerArray){
    alert(answerArray.join(" "));
}

function getGuess (){
    var guess = prompt("Guess a letter, or click cancel to stop playing."); 
    guesses--;
   guess = guess.toLowerCase();

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

