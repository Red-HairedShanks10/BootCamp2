//***************************Exercises*******************************************************//

//***********Exercise 6.1***********//
function adder(a, b) {
    return a + b;
    }
    const val1 = 10;
    const val2 = 20;
    console.log(adder(val1, val2));
    console.log(adder(20, 30));
//*****End of Exercise 6.1*********************//

//***Exercise 6.2************//
const adj = ["super", "wonderful", "bad", "angry", "careful"];
function myFun() {
 const question = prompt("What is your name?");
 const nameAdj = Math.floor(Math.random() * adj.length);
 console.log(adj[nameAdj] + " " + question );
}
myFun();

//*********end of exercise 6.2***************//

//***Exercise 6.3******calculator function to add or subtract****pg122/

//variables for numbers to be calculatedwith operator variable
var num1 = 4;
var num2 = 8;
var op = prompt("enter operator between + or -");

//*calculator function to add or subtract*//

function cal(op, a, b) { //arguments for cal function

    if (op == "-") {
        //subtract param values if op is the minus oprator
        console.log(a - b);
    }
    //otherwise add param values if + or other unspecified options are chosen 
    else {
        console.log(a + b);
    }
}
//funct takes in the global variables, when invonked
cal(op, num1, num2);

//************************************End of 6.3*************************/



//****************pg137***********************Exercise 6.5***************Using IIFE*************************//

//step 1:
//set global variable to a string
let str_var = "1000";


//2) function with a local variable with the same name as the global variable
(function () {
    str_var = "100"; //local variable
    console.log(str_var);
})(); //imidiately invoked  without param

//step 3)
let result = (function () { //result holds the value returned by the function
    let str_var = "Marco";
    return str_var;
})(); //invoked without param

console.log(result);
console.log(str_var);


//step 4)
(function (str_var) {
    console.log(`Hello there,this is ${str_var}`);
})("Luffy");

//step 4 arrow format
((str_var) => 
{
    console.log(`Hi there,this is ${str_var}`);
})("Zoro");

//*****End of exercise 6.5***************//

//***Exercise 6.6**************//
function calcFactorial(nr) {
    console.log(nr);
    if (nr === 0) {
    return 1;
    }
    else {
    return nr * calcFactorial(--nr);
    }
   }
   console.log(calcFactorial(4));

 //***End of exercise 6.6 *******//


//****pg147******exercise 6.7************//

let start = 10;

//1st loop funct
function loop1(val) {
    console.log(val);
    if (val < 1) {
        return;
    }
    return loop1(val - 1);
}
loop1(start);

//2nd loop funct
(function loop2(val) {
    console.log(val);
    if (val > 0) {
        val--;
        return loop2(val);
    }
    return;
})(start);

//*****End of exercise 6.7*******//

//***Exercise 6.8******//
const test = function(val){
    console.log(val);
   }
   test('hello 1');
   function test1(val){
    console.log(val);
   }
   test1("hello 2");

//*****END of exercise 6.8*********//

//********************************************************* End of Exercises*******************************************************//


//*********************************************************pg145*Projects*********************************************************//

//**********************1) Recursive function***************//
 (function rec_funct(val) {
    console.log(val);//log current param value
    if (val < 10) {
        return rec_funct(val + 1);//add 1 to param value as the function is invoked
    }
    return;
})(1);

//*************END of recursive function****************//

//**********2)timeout order (arrow format)*****************//

let funct_one = () => console.log('one');
let funct_two = () => console.log('two');
let funct_three = () => {
    console.log('three');
    funct_one();
    funct_two();
};

let funct_four = () => {
    console.log('four');
    setTimeout(funct_one, 0);
    funct_three();
};

funct_four();

//****************END OF timeout order project**************//

