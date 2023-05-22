//** Arrow functions */

//one paramtr
let doingArrowStuff = x => console.log(x);
doingArrowStuff('helooooooo!');
//////////////////////////////

//two paramtr
let addTwoNumbers = (x, y) => console.log(x + y);
addTwoNumbers(3, 4);
///////////////////////////

//
const arr = ["squirrel", "alpaca", "buddy"];
arr.forEach(e => console.log(e));
/**************** */

//**spread operator (...)**/
let spread = ["so", "much", "fun"];
let message = ["JavaScript", "is", ...spread, "and", "very", "powerful"]; //spread array elements now separated to individual elements..

console.log(message);

//* using spread as an argument value....
/*
function addNumbers(x, y, z, a) {
    console.log(x + y + z + a);
    }

    let arr1 = [5, 9, 7, 8];
    addNumbers(...arr1); */
/************************ */


/* using rest operator as an argument
function someFunction(param1, ...param2) {
    console.log(param1, param2);
    }
    someFunction("hi", "there!", "How are you?");

    //returning values from functions
    let result = addTwoNumbers(4, 5);
      console.log(result);
*/

// 
/*
function addTwoNumbers(x, y) {
    return x + y;
    }
*/
/*
    function doingStuff() {
        if (true) {
       
        let x = "local";// can only be used in the if statement block...
        console.log(x);
        }
        }
        doingStuff();
*/

//IIFE functions
let x = "1000";
let b = 1000;
(function () {
    let x = 5000;
    console.log(x);
})();

//assigning returned value to a variable
let result = (function () {
    let x = 4000;
    return x;
})();

console.log(x); //display global variable
console.log(result); //displays value assigned to result from function(4000)

//
let result2 = (function (y, z) {
    let a = y * z;
    return a;
})(b, 7); //global variable value(x) times 7
console.log(result2);
/********************************** */

/***************Recursive functions***************/
/* function getRecursive(nr) {
    console.log(nr);
    if (nr > 0) {
    getRecursive(--nr);
    }
    }
    getRecursive(3);

//////////
    function logRecursive(nr) {
        console.log("Started function:", nr);
        if (nr > 0) {
        logRecursive(nr - 1);
        } else {
        console.log("done with recursion");
        }
        console.log("Ended function:", nr);
        }
        logRecursive(3); */

//*******************************************************************/


/********************nested functions*****************************/
/*function doOuterFunctionStuff(nr) {
    console.log("Outer function");
    doInnerFunctionStuff(nr);
    function doInnerFunctionStuff(x) {
    console.log(x + 7);
    console.log("I can access outer variables:", nr);
}
}
doOuterFunctionStuff(2); */

//causes references error///
/*
function doOuterFunctionStuff(nr) {
    
    function doInnerFunctionStuff(x) {
    let z = 10;
    console.log(z);
    }
    doInnerFunctionStuff(3);
    }(3);
   */



/**************************************************************/

/************************Anonymus functions**********************/

/*/no-name function
function () {
    console.log("Not so secret though.");
    };*/

//storing the function into a variable...
let functionVariable = function () {
    console.log("Not so secret though.");
};

functionVariable(); //callling it function variable....

//passing a function as an argument for another function
function doFlexibleStuff(executeStuff) {
    executeStuff(); //param bcomes a function here...
    console.log("Inside doFlexibleStuffFunction.");
}
doFlexibleStuff(functionVariable);

//execute at a certain time
let youGotThis = function () {
    console.log("You're doing really well, keep coding!");
};
setTimeout(youGotThis, 1000); ///using the setTimeout method to specify the time of executuion.....


//self-quiz 2
(function () {
    console.log("Welcome");
})();
(function () {
    let firstName = "Laurence";
})();
let result1 = (function () {
    let firstName = "Laurence";
    return firstName;
})();
console.log(result1);
(function (firstName) {
    console.log("My Name is " + firstName);
})("Laurence");


//self quiz 4
let test2 = (num) => num + 5;
console.log(test2(14));

//self-quiz5
var addFive1 = function addFive1(num) {
    return num + 2;
};
let addFive2 = (num) => num + 2;
console.log(addFive1(14));


