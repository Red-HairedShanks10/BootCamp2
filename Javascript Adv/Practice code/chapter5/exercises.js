//**pg90** exercise 5.1*******//
const max = 5;
const ranNumber = Math.floor(Math.random() * max) + 1;
//console.log(ranNumber);
let correct = false;
while (!correct) {
    let guess = prompt("Guess a Number 1 - " + max);
    guess = Number(guess);
    if (guess === ranNumber) {
        correct = true;
        console.log("You got it " + ranNumber);
    } else if (guess > ranNumber) {
        console.log("Too high");
    } else {
        console.log("Too Low");
    }
}
//**END OF EXERCISE 5.1****//


//pg92**exercise 5.2*******//
//1 set counter to 0
let counter = 0;
//2 creating step with any given value
let step = 5;
//3 do while loop
do {
    //a) display counter value to console
    console.log(counter);
    //b) increment counter using step
    counter += step;
}
//4) do this while counter <= 100
while (counter <= 100);

//***END OF EXERCISE 5.2*****//


//**pg95**exercise 5.3******//

const myWork = [];
for (let x = 1; x < 10; x++) {
    let stat = x % 2 ? true : false;
    let temp = {
        name: `Lesson ${x}`,
        status: stat
    };
    myWork.push(temp);
}
console.log(myWork);

//**END OF EXERCISE 5.3**********//

//**pg97**exercise 5.4********//
let myTable = [];
let rows = 4;
let cols = 7;
let counter_a = 0;
for (let y = 0; y < rows; y++) {
    let tempTable = [];
    for (let x = 0; x < cols; x++) {
        counter_a++;
        tempTable.push(counter_a);
    }
    myTable.push(tempTable);
}
console.table(myTable);

//**END OF EXERCISE 5.4*****//

//**pg100***Exercise 5.5******//
let grid = [];
let cells = 64;
let counterb = 0;
let row;
for (let x = 0; x < cells + 1; x++) {
    if (counterb % 8 == 0) {
        if (row != undefined) {
            grid.push(row);
        }
        row = [];
    }
    counterb++;
    let temp = counterb;
    row.push(temp);
}
console.table(grid);
//**END OF EXERCISE 5.5***//


//***********Projects**************//

//pg114***Multiplication table****//
//1 creating an empty array
let proj_table = [];
//2 setting number of elements to be multiplied with each other...
let vnum = 5;

//3 creating outer for-loop 
for (let x = 0; x < vnum; x++) {
    //a)temporary array to store row values
    let temp = [];
     
    //b)inner array
    for (let y = 0; y < vnum; y++) {
        //temp[y] = x * y;
        temp.push(x * y);
    }
//5) adding each rows values to the main array
    proj_table.push(temp);
}
console.table(proj_table);