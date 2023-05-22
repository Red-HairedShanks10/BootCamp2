//Friend checker game answers

let person = prompt("Enter a name");
let message;
//switch
switch (person) {
 case "Luffy" :
 case "Shanks" :
 case "Khaya" :
 case "Kamo" :
 message = person + " is my friend";//make message if its cases above
 break;
 default :
 message = "I don't know " + person;//make message if its non of the cases above
}
console.log(message);