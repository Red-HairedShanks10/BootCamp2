//*pg346***Concurrency *//

//*pg346*Callbacks

// function doSomething(callback) {
//     callback();
// }

// function sayHi() {
//     console.log("Hi!");
// }
// doSomething(sayHi);

// //********//


// //*pg347-pg348**//
// function judge(grade) {
//     switch (true) {
//         case grade == "A":
//             console.log("You got an", grade, ": amazing!");
//             break;
//         case grade == "B":
//             console.log("You got a", grade, ": well done!");
//             break;
//         case grade == "C":
//             console.log("You got a", grade, ": alright.");
//             break;
//         case grade == "D":
//             console.log("You got a", grade, ": hmmm...");
//             break;
//         default:
//             console.log("An", grade, "! What?!");
//     }
// }

// function getGrade(score, callback) {
//     let grade;
//     switch (true) {
//         case score >= 90:
//             grade = "A";
//             break;
//         case score >= 80:
//             console.log(score);
//             grade = "B";
//             break;
//         case score >= 70:
//             grade = "C";
//             break;
//         case score >= 60:
//             grade = "D";
//             break;
//         default:
//             grade = "F";
//     }
//     callback(grade);
// }
// getGrade(85, judge);

// //****************//

// //**pg348****//
// setInterval(encourage, 500);

// function encourage() {
//     console.log("You're doing great, keep going!");
// }

/*********/


//**pg349*****Promises//

/**pg350*****example 1
const promise = new Promise((resolve, reject) => {
        resolve("success!");
    })
    .then(value => {
        console.log(value);
        return "we";
    })
    .then(value => {
        console.log(value);
        return "can";
    })
    .then(value => {
        console.log(value);
        return "chain";
    })
    .then(value => {
        console.log(value);
        return "promises";
    })
    .then(value => {
        console.log(value);
    })
    .catch(value => {
        console.log(value);
    })

    //*****************/


/**pg351**example 2//

const promise = new Promise((resolve, reject) => {
        reject("oops... ");
    })
    .then(value => {
        console.log(value);
        return "we";
    })
    .then(value => {
        console.log(value);
        return "can";
    })
    .then(value => {
        console.log(value);
        return "chain";
    })
    .then(value => {
        console.log(value);
        return "promises";
    })
    .then(value => {
        console.log(value);
    })
    .catch(value => {
        console.log(value);
    })
   
 /**************/


//**pg353**Async and wait***//

/*example 1
function saySomething(x) {
   return new Promise(resolve => {
   setTimeout(() => {
   resolve("something" + x);
   }, 2000);
   });
   }
   async function talk(x) {
   const words = await saySomething(x);
   console.log(words);
   }
   talk(2);
   talk(4);
   talk(8);
   */


//**pg355***Event loop*****//

// //*example 1
// console.log("Hi there");
// add(4, 5);

// function add(x, y) {
//     return x + y;
// }

// //pg356 example 2
// console.log("Hi there");
// setTimeout(() => console.log("Sorry I'm late"), 1000);
// console.log(add(4, 5));

// function add(x, y) {
//     return x + y;
// }

//pg358 example 3
console.log("Hi there");
setTimeout(() => console.log("Sorry I'm late"), 0);
console.log(add(4, 5));

function add(x, y) {
    return x + y;
}

//  */