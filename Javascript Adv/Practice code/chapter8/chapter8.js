//*****pg167***********************************Built in JAVASCRIPT METHODS********************************************************//


//pg168 some built in methods
let s = "Hello";
console.log(
    s.concat(" there!")
    .toUpperCase()
    .replace("THERE", "you")
    .concat(" You're amazing!")
);


//2/pg169*** Global methods **//

//using isNan to test if variable x is not a number or not.....
let x = 7;
console.log(Number.isNaN(x)); //isNan() doesnt need the object name(Number) infront of it to be acessed and used...

console.log(isNaN(x)); //hence isNan() is a global method(no need to specify the object it belongs to, to be used)


//2.1/pg169***encoding and decoding URIs**//
let uri = "https://www.example.com/submit?name=maaike van putten";
let encoded_uri = encodeURI(uri);
console.log("Encoded:", encoded_uri);
let decoded_uri = decodeURI(encoded_uri);
console.log("Decoded:", decoded_uri);

//another example
let uri1 = "https://www.example.com/submit?name=maaike van putten";
let encoded_uri1 = encodeURIComponent(uri1);
console.log("Encoded:", encoded_uri1);
let decoded_uri1 = decodeURIComponent(encoded_uri1);
console.log("Decoded:", decoded_uri1);

////***END OF URIs****///////

//2.2/pg172***Parsing Numbers*******///


//**parseInt() to change string datatype to numbers
let str_int = "6";
let int_int = parseInt(str_int);
console.log("Type of ", int_int, "is", typeof int_int);

//making float with parseInt()
let str_float = "7.6";
let int_float = parseInt(str_float);
console.log("Type of", int_float, "is", typeof int_float); ///will return whole number not actual float

//making int binary............
let str_binary = "0b101";
let int_binary = parseInt(str_binary);
console.log("Type of", int_binary, "is", typeof int_binary);

//*parsefloat() to change string to float number
let str_float1 = "7.6";
let float_float = parseFloat(str_float1);
console.log("Type of", float_float, "is", typeof float_float); //returns actual float....

//***END OF GLOBAL Methods*****************//

//3/pg176*******ARRAY METHODS*****************/

/** 3.1.1
let arr = ["grapefruit", 4, "hello", 5.6, true];

function printStuff(element, index) {
console.log("Printing stuff:", element, "on array position:", index);
}
arr.forEach(printStuff);
*/

//3.1.2/
let arr1 = ["squirrel", 5, "Tjed", new Date(), true];

function checkString(element, index) {
    return typeof element === "string";
}

let filterArr = arr1.filter(checkString);
console.log(filterArr);

//3.1.3
let arr = ["grapefruit", 4, "hello", 5.6, true, false];
arr.copyWithin(0, 3);
console.log(arr);

//3.1.4 mapping an array values
let arr2 = [1, 2, 3, 4];
let mapped_arr = arr2.map(x => x + 1);
console.log(mapped_arr);

//3.1.5
let bb = ["so", "bye", "bye", "love"];
console.log(bb.lastIndexOf("bye"));

//****END OF ARRAY METHOD**********//


//4/pg181*******STRING METHODS************//

//4.1 concat() to combine strings....
let s1 = "Hello ";
let s2 = "JavaScript";
let result = s1.concat(s2);
console.log(result);

//4.2 split() to convert a string to an array.....
let result1 = "Hello JavaScript";
let arr_result = result1.split(" ");
console.log(arr_result);

//another example
let favoriteFruits = "strawberry,watermelon,grapefruit";
let arr_fruits = favoriteFruits.split(",");
console.log(arr_fruits);


//4.3 converting an array to a string with join().....
let letters = ["a", "b", "c"];
let join_letters = letters.join();
console.log(join_letters);


//4.3.1 specifying the joining symbol
let letters1 = ["a", "b", "c"];
let joined_x = letters.join('-');
console.log(joined_x);

//** Working with indexes **//

//example 1
let poem = "Roses are red, violets are blue, if I can do JS, then you can too!";
let index_re = poem.indexOf("re");
console.log(index_re);//logs the first occurence of "re" which is at index 7....

//example 2
let indexNotFound = poem.indexOf("python");
console.log(indexNotFound);//returns -1 to indicate that the occurence of "python" doesnt exist....

//using search()
let searchStr = "When I see my fellow, I say hello";
let pos = searchStr.search("lo");
console.log(pos);


//other example of search()
let notFound = searchStr.search("JavaScript");
console.log(notFound);
//////END OF Indexes/////


//********END OF STRING METHODS****************//


//**pg190******NUMBER METHODS**************************//

//5.1
let xa = 34;
console.log(isNaN(xa));
console.log(!isNaN(xa));
let str = "hi";
console.log(isNaN(str));

//5.2
let str1 = "5";
console.log(isNaN(str1));


//Checking if somthing is finite with isFinite()
let xb = 3;
let str2 = "finite";
console.log(isFinite(xb));
console.log(isFinite(str2));
console.log(isFinite(Infinity));
console.log(isFinite(10 / 0));

//checking if variables are a number
let xc = 3;
let str3 = "integer";
console.log(Number.isInteger(xc));
console.log(Number.isInteger(str3));
console.log(Number.isInteger(Infinity));
console.log(Number.isInteger(2.4));



//specifying a decimal number with toFixed()
let xd = 1.23456;
let newX = xd.toFixed(2);


//example 2  of specifying decimal number
let xe = 1.23456;
let newX1 = xe.toFixed(3);
console.log(xe, newX1);


//specifying precision with precision
let xf = 1.23456;
let newX2 = xf.toPrecision(2);

//example 2 of precision
let xg = 1.23456;
let newX3 = xg.toPrecision(4);
console.log(newX3);


//5.3******** Math Methods****//

//5.3.1 Math.max()
let highest = Math.max(2, 56, 12, 1, 233, 4);
console.log(highest);

//5.3.2 Math.min()
let lowest = Math.min(2, 56, 12, 1, 233, 4);
console.log(lowest);


//
let highestOfWords = Math.max("hi", 3, "bye");
console.log(highestOfWords);


//5.3.3 sqrt()
let result2 = Math.sqrt(64);
console.log(result2);

//5.3.3.1 pow()
let result3 = Math.pow(5, 3);
console.log(result3);


//using Math.ceil()
let w = 6.78;
let z = 5.34;

console.log("w:", w, "becomes", Math.ceil(w));
console.log("z:", z, "becomes", Math.ceil(z));

//ceil() with negative values
let negativeX = -w;
let negativeY = -z;
console.log("negativeW:", negativeX, "becomes", Math.ceil(negativeX));
console.log("negativeZ:", negativeY, "becomes", Math.ceil(negativeY));


//using floor()
console.log("X:", w, "becomes", Math.floor(w));
console.log("Y:", z, "becomes", Math.floor(z));


//using trunc()
console.log("X:", w, "becomes", Math.trunc(w));
console.log("Y:", z, "becomes", Math.trunc(z));

///END OF*******5.3.3*****//

//5.3.4****Exponents and  Logarithms****//

//5.3.4.1
let xh = 2;
let exp = Math.exp(xh);
console.log("Exp:", exp);
let log = Math.log(exp);
console.log("Log:", log);

//*****END OF EXPONENTS and Logarithms *//

//5.3.5*****pg197**DATE METHODS***//

//create a date 
let currentDateTime = new Date();
console.log(currentDateTime);

//
