
var randomBodyParts = ["Face", "Nose", "Hair", "Arms", "legs"];
var randomAdjectives = ["Smelly", "Boring", "Stupid", "Well Endowed", "Cursed", "Mutated"];
var randomWords = ["Dog", "Marmot", "FurBall", "Larma", "Donkey"];

// Picking a random body part from randomBodyPart array
 var randomBodyPart = randomBodyParts[Math.floor(Math.random() * randomBodyParts.length)];

// Picking a random adjective from randomAdjectives array
var randomAdjective = randomAdjectives[Math.floor(Math.random() * randomAdjectives.length)];

// Picking a random word from the randomwords. array
 var randomWord = randomWords[Math.floor(Math.random() * randomWords.length)];

 /* Joining all the random strings into a sentence:
var randomInsult = "Your " + randomBodyPart + " is like a " + 
randomAdjective + " " + randomWord + "!!!"; */

//joining all random string into a sentence with join method
var randomInsult = ["Your", randomBodyPart, "is", "like", "a", 
randomAdjective, randomWord + "!!!"].join(" ");
 
//displaying it in the console
console.log(randomInsult);