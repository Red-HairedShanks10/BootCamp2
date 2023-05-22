//*pg172**Exercise 8.1******//
const secretMes1 = "How's%20it%20going%3F";
const secretMes2 = "How's it going?";
const decodedComp = decodeURIComponent(secretMes1);
console.log(decodedComp);
const encodedComp = encodeURIComponent(secretMes2);
console.log(encodedComp);
const uri = "http://www.basescripts.com?=Hello World";
const encoded = encodeURI(uri);
console.log(encoded);
//*****end of exercise 8.1******//

//**p180***Exercise 8.2********//
let arr = ["Laurence", "Mike", "Larry", "Kim", "Joanne", "Laurence",
    "Mike", "Laurence", "Mike", "Laurence", "Mike"
];
let arr2 = arr.filter((value, index, array) => {
    console.log(value, index, array.indexOf(value));
    return array.indexOf(value) === index;
});
console.log(arr2);

//********End of exercise 8.2*********//


//**p181***Exercise 8.3********//
let myArr = [1, 4, 5, 6];
let myArr1 = myArr.map(function (ele) {
    return ele * 2;
});
console.log(myArr1);
let myArr2 = myArr.map((ele) => ele * 2);
console.log(myArr2);

//*****End of exercise 8.3*******//

//**Exercise 8.4********//
let val = "thIs will be capiTalized for each word";

function wordsCaps(str) {
    str = str.toLowerCase();
    tempArr = [];
    words = str.split(" ");
    words.forEach(word => {
        let temp = word.slice(0, 1).toUpperCase() + word.slice(1);
        tempArr.push(temp);
    });
    return tempArr.join(" ");
}
console.log(wordsCaps(val))
//***End of exercise 8.4*************//

//**Exercise 8.5******//
//1)
let str_val = "I love JavaScript";
str_val = str_val.toLowerCase();
//2)
let vowels = ["a", "e", "i", "o", "u"];
//3)
vowels.forEach((letter, index) => {
    console.log(letter);
    //4)
    str_val = str_val.replaceAll(letter, index);
});
//5)
console.log(str_val);

//******End of exercise 8.5********//

//****Exercise 8.6********//
console.log(Math.ceil(5.7));
console.log(Math.floor(5.7));
console.log(Math.round(5.7));
console.log(Math.random());
console.log(Math.floor(Math.random() * 11)); // 0-10
console.log(Math.floor(Math.random() * 10) + 1); // 1-10;
console.log(Math.floor(Math.random() * 100) + 1); // 1-100;
function ranNum(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
for (let x = 0; x < 100; x++) {
    console.log(ranNum(1, 100));
}

//***End of exercise 8.6********//

//****Exercise 8.7************//
let future = new Date(2025, 5, 15);
console.log(future);
let months = ["January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
];
let day = future.getDate();
let month = future.getMonth();
let year = future.getFullYear();
let myDate = `${months[month-1]} ${day} ${year}`;
console.log(myDate);

//***End of exercise 8.7********//

//****Projects*****//

//**pg201**Word Scrambler******//
//1)
let str = "Katana";
//2)
function Scrambler(val) {
    //3)
    let max_str = val.length;
    //4)
    let temp = "";
    //5)
    for (let i = 0; i < max_str; i++) {
        console.log(val.length);//log current length of val
        //6)
        let index = Math.floor(Math.random() * val.length);
        //7)
        temp += val[index];
        //8
        console.log(temp);
        //9
        val = val.substr(0, index) + val.substr(index + 1);
        console.log(val);
    }
    //10)
    return temp;
}
console.log(Scrambler(str));

//***End of Word Scramber********//

//**pg202***CountDown timer*****//
let endDate = "Sept 1 2022";
function countdown() {
 let total = Date.parse(endDate) - new Date();
 let days = Math.floor(total / (1000 * 60 * 60 * 24));
 let hrs = Math.floor((total / (1000 * 60 * 60)) % 24);
 let mins = Math.floor((total / 1000 / 60) % 60);
 let secs = Math.floor((total / 1000) % 60);
 return {
 days,
 hrs,
 mins,
 secs
 };
}
function update() {
  temp = countdown();
}

//******End of CountDown timer********//