//***Exercise 4.1****//
const test = false;
console.log(test);
if (test) {
    console.log("It's True");
}
if (!test) {
    console.log("False now");
}

//***END of exercise 4.1******//


//***Exercise 4.2****//
let age = prompt("How old are you?");
age = Number(age);
let message;
if (age >= 21) {
    message = "You can enter and drink.";
} else if (age >= 19) {
    message = "You can enter but not drink.";
} else {
    message = "You are not allowed in!";
}
console.log(message);
//***END Of Exercise 4.2****//


//***Exercise 4.3********//
const id = true;
const message = (id) ? "Allowed In" : "Denied Entry";
console.log(message);
//***END OF Exercise 4.3******//


//****Exercise 4.4******//
const randomNumber = Math.floor(Math.random() * 6);
let answer = "Something went wrong";
let question = prompt("Ask me anything");
switch (randomNumber) {
    case 0:
        answer = "It will work out";
        break;
    case 1:
        answer = "Maybe, maybe not";
        break;
    case 2:
        answer = "Probably not";
        break;
    case 3:
        answer = "Highly likely";
        break;
    default:
        answer = "I don't know about that";
}
let output = "You asked me " + question + ". I think that " + answer;
console.log(output);

//***End of Exercise 4.4*******//


//********Exercise 4.5***********//
let prize = prompt("Pick a number 0-10");
prize = Number(prize);
let output = "My Selection: ";
switch (prize) {
    case 0:
        output += "Gold ";
    case 1:
        output += "Coin ";
        break;
    case 2:
        output += "Big ";
    case 3:
        output += "Box of ";
    case 4:
        output += "Silver ";
    case 5:
        output += "Bricks ";
        break;
    default:
        output += "Sorry Try Again";
}
console.log(output);

//****END Of exercise 4.5******//

