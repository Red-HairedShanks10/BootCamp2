
var secret = Math.floor(Math.random() * 10) + 1;
  console.log(secret);


while(guess !== secret){

    var answer = prompt("please enter a secret number 1-10");
    var guess = parseInt(answer);
     
    if(guess === secret){
        alert("correct guess");
 } 
   else if( guess > secret){
        alert("Incorrect!! too high");
    }
    else if(guess < secret) {
        alert("Incorrect!! too low");
    } 
    
    else{
        break;
    }
    
     
}

