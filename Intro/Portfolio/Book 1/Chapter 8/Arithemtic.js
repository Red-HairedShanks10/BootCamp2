

function add(number1, number2){
     return number1 + number2;
};

function multiply(number1, number2){
    return number1 * number2;
};
 
//calling add function
console.log(add(23,35));

//calling multiply function
console.log(multiply(20,5));

//calling multiply function with add function as an argument
 console.log(multiply(add(4,4), add(5,5)) );


 console.log(add(multiply(36325, 9824), 777));