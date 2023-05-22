//***pg87************************LOOPS*****************************//

//** While loops **//

//example 1
let someArray = ["Mike", "Antal", "Marc", "Emir", "Louiza", "Jacky"];
let notFound = true;
while (notFound && someArray.length > 0) {
    if (someArray[0] === "Louiza") {
        console.log("Found her!");
        notFound = false;
    } else {
        someArray.shift();
    }
}

// example 2
let nr1 = 0;
let nr2 = 1;
let temp;
fibonacciArray = [];

while (fibonacciArray.length < 25) {
    fibonacciArray.push(nr1);
    temp = nr1 + nr2;
    nr1 = nr2;
    nr2 = temp;
}



//****END OF WHILE LOOPS*****//


//***pg91****do while loops********//

let number;
do {
    number = prompt("Please enter a number between 0 and 100: ");
} while (!(number >= 0 && number < 100));

//****END OF DO WHILE LOOPS*****//


//***pg92****FOR LOOPS********//

//example 1
for (let i = 0; i < 10; i++) {
    console.log(i);
}

//example 2
let arr = [];
for (let i = 0; i < 100; i++) {
    arr.push(i);
}

//example 3
let arr1 = [];
for (let i = 0; i < 100; i = i + 2) {
    arr1.push(i);
}



//****END OF FOR LOOPS*****//



//***pg95****Nested loops********//
let arrOfArrays = [];
for (let i = 0; i < 3; i++) {
    arrOfArrays.push([]);
    for (let j = 0; j < 7; j++) {
        arrOfArrays[i].push(j);
    }
}



//****END OF NESTED LOOPS*****//




//***pg98****LOOPS AND ARRAYS********//

// // pg 99--example 1
// let names = ["Chantal", "John", "Maxime", "Bobbi", "Jair"];
// for (let i = 0; i < names.length; i ++){
// names[i] = "hello " + names[i];
// }

//pg 99-- example 2
let names = ["Chantal", "John", "Maxime", "Bobbi", "Jair"];
for (let i = 0; i < names.length; i++) {
    if (names[i].startsWith("M")) {
        delete names[i];
        continue;
    }
    names[i] = "hello " + names[i];
}
console.log(names);

//pg 100--example 3
let names1 = ["Chantal", "John", "Maxime", "Bobbi", "Jair"];
for (let i = 0; i < names1.length; i++) {
    names1.push("...")
}



//****END OF LOOPS AND ARRAYS****//


//*pg101***for of loop****//

//example1
let names2 = ["Chantal", "John", "Maxime", "Bobbi", "Jair"];
for (let name of names2) {
    console.log(name);
}

//****END OF LOOPS AND ARRAYS****//


//*pg102***LOOPS AND OBJECTS****//

//*pg103**for in loops****//

//example 1
let car = {
    model: "Golf",
    make: "Volkswagen",
    year: 1999,
    color: "black",
};
for (let prop in car) {
    console.log(car[prop]);
}

//example 2
for (let prop in car) {
    console.log(prop);
}


//****//  

//*pg104**Looping over objects by converting to an array****//
//example 1
let arrKeys = Object.keys(car);
console.log(arrKeys);

//example 2
for (let key of Object.keys(car)) {
    console.log(key);
}

//example 3
for (let key of Object.values(car)) {
    console.log(key);
}

//example 4
//using example 1
for (let i = 0; i < arrKeys.length; i++) {
    console.log(arrKeys[i] + ": " + car[arrKeys[i]]);
}

//example 5
let arrEntries = Object.entries(car);
console.log(arrEntries);

//example 6
for (const [key, value] of Object.entries(car)) {
    console.log(key, ":", value);
    }


//****//

//****END OF LOOPS AND OBJECTS****//

//*pg107***Break and Continue****//

//array of cars
let cars = [
    {
    model: "Golf",
    make: "Volkswagen",
    year: 1999,
    color: "black",
    },
    {
    model: "Picanto",
    make: "Kia",
    year: 2020,
    color: "red",
    },
    {
    model: "Peugeot",
    make: "208",
    year: 2021,
    color: "black",
    },
    {
    model: "Fiat",
    make: "Punto",
    year: 2020,
    color: "black",
    }
    ];
    
//****END OF Break and Continue****//


