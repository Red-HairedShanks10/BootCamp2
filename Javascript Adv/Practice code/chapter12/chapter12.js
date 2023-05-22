'use strict';

//let text = "I love React and JavaScript";

//alert(text.match(/javascript/i));

// console.log(text.match(/javascript|nodejs|react/i));

// console.log(text.match(/javascript|nodejs|react/gi));


//
// let text = "d";
//console.log(text.match(/[abc]/));
// console.log(text.match(/[a-d]/));

//
// let text = "6";//number as string
// console.log(text.match(/[a-zA-Z0-9]/));//only works with strings

// let text = "äé!";
// console.log(text.match(/./g));

// let text = "Just some text.";
// console.log(text.match(/\./g));

// let text = "I'm 29 years old.";
// console.log(text.match(/\d/g));

// let text = "Coding is a lot of fun!";
// console.log(text.match(/\s/g));

// let text = "At the end or at the beginning?";
// console.log(text.match(/\bat/gi));


//Groups
// let text = "I love JavaScript!";
// console.log(text.match(/(love|dislike)\s(javascript|spiders)/gi));


// let text = "I love JavaScript!";
// console.log(text.match(/[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]/g));

// let words = "You are doing great!";
// console.log(words.match(/n?g/gi));

// let text = "123123123";
// console.log(text.match(/(123)/));

// let text = "abcabcabc";
// console.log(text.match(/(abc){1,3}/));

// let text = "I love JavaScript!";
// console.log(text.match(/(?<language>javascript)/i));



//Practical regex
// let text = "That's not the case.";
// console.log(text.search(/Case/i));


// let text = "Coding is fun. Coding opens up a lot of opportunities.";
// console.log(text.replace(/Coding/g, "JavaScript"));

////******/////


/* pg312***Email**
let emailPattern = /([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-zA-Z0-9._-]+)/g;
let validEmail = "maaike_1234@email.com";
let invalidEmail = "maaike@mail@.com";
console.log(validEmail.match(emailPattern));
console.log(invalidEmail.match(emailPattern));

//********/

//*pg314***Functions and the arguments object**//

/*
function test(a, b, c) {
    console.log("first:", a, arguments[0]);
    console.log("second:", b, arguments[1]);
    console.log("third:", c, arguments[2]);
    }
    test("fun", "js", "secrets");
*/

/*
function test(a, b, c) {
    a = "nice";
    arguments[1] = "JavaScript";
    console.log("first:", a, arguments[0]);
    console.log("second:", b, arguments[1]);
    console.log("third:", c, arguments[2]);
    }
    test("fun", "js", "secrets");

*/

//*pg315*Hoisting*****/

/*
var x;
x = 5;
console.log(x);

x = 5;
console.log(x);
var x; */

/*function sayHi() {

    greeting = "Hello!";
    console.log(greeting);
    }
    sayHi(); */


//**Debugging*****//

//*****//

//*pg325**Error handling*****//

/* 
try {
    somethingVeryDangerous();
} catch (e) {
    if (e instanceof TypeError) {
        // deal with TypeError exceptions
        console.log("oops  " + e);
    } else if (e instanceof RangeError) {
        // deal with RangeError exceptions
        console.log("oops " + e);
    } else if (e instanceof EvalError) {
        // deal with EvalError exceptions
        console.log("oops " + e);
    } else if (e instanceof ReferenceError) //if its a referenceError display this...
    {
        console.log(`${e}: greeting is not defined`)
    } 
    
    else {
        //deal with all other exceptions
        console.log(e);
       // throw e; //rethrow
    }
}


function somethingVeryDangerous() {
   let greeting = "h";
   // console.log(greeting);
    if(greeting.length < 2)
    {
        throw "ShortGreeting";
    }
}*/

/*
try {
    somethingVeryDangerous();
    } catch (e) {
    console.log("Oh oh");
    } 
    
    finally {
    console.log("Error or no error, I will be logged!");
    }

    function somethingVeryDangerous() {
       // throw RangeError();
         console.log("no errors");
        } */


//**pg327*Cookies*****//

///////////////


//*pg330**Local Storage**//
/*
let message = "Hello storage!";
localStorage.setItem("example", message);
if (localStorage.getItem("example")) {
document.getElementById("stored").innerHTML =
localStorage.getItem("example");
}
*/

/*

document.getElementById("stored").innerHTML =
localStorage.getItem("example");
*/


//window.localStorage.removeItem("example");
// alert(window.localStorage.key(0));
// alert(window.localStorage.getItem(window.localStorage.key(0)));

//**********************************************************************************/


//*pg333***JSON****//
/*
{
    "companies" [{
            "name": "JavaScript Code Dojo",
            "addresses": [{
                    "street": "123 Main street",
                    "zipcode": 12345,
                    "city": "Scott"
                },
                {
                    "street": "123 Side street",
                    "zipcode": 35401,
                    "city": "Tuscaloosa"
                }
            ]
        },
        {
            "name": "Python Code Dojo",
            "addresses": [{
                    "street": "123 Party street",
                    "zipcode": 68863,
                    "city": "Nebraska"
                },
                {
                    "street": "123 Monty street",
                    "zipcode": 33306,
                    "city": "Florida"
                }
            ]
        }
    ]
}
*/


//*pg336*parsing JSON**//
/*let str = '{"name": "Maaike", "age": 30}';
let obj = JSON.parse(str);
console.log(obj);
console.log(obj.name, "is", obj.age);
*/


let dog = {
    "name": "wiesje",
    "breed": "dachshund"
};

let strdog = JSON.stringify(dog);
console.log(typeof strdog);
console.log(strdog);

let myList = [{
        "name": "Learn JavaScript",
        "status": true
    },
    {
        "name": "Try JSON",
        "status": false
    }
];

const newStr = JSON.stringify(myList);
const newObj = JSON.parse(newStr);
newObj.forEach((el) => {
    console.log(el);
});