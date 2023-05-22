
//exercise 2.1//pg32
let str1 = 'Laurence';
let str2 = "Svekis";
let val1 = undefined;
let val2 = null;
let myNum = 1000;

// types of variables above^^^
console.log(typeof(str1));
console.log(typeof(str2));
console.log(typeof(val1));
console.log(typeof(val2));
console.log(typeof(myNum));

//**END EXERCISE 2.1********//


//exercise 2.2//pg33
let myName = "Marco";
let myAge = 22;
let can_code = true;
let message = `Hello, my name is ${myName}, I am ${myAge} years old and I can code JavaScript: ${can_code}`;
console.log(message);

//****END OF EXERCISE 2.2****//

//exercise 2.3//pg38
//***finding the hypotenuse of triangle

//1)
let a = prompt("Value 1?");
let b = prompt("Value 2?");
//2)
a = Number(a);
b = Number(b);
//3)
let hypot = Math.sqrt((a ** 2) + (b ** 2));
console.log(hypot);


//**END OF exercise 2.3***//

//*pg39*exercise 2.4****//

// let a1 = 4;
// let b1 = 11;
// let c1 = 21;
// a1 += b1;
// a1 /c1
// c1 %= b1;
// console.log(a1, b1, c1);

//**END OF EXERCISE 2.4*****//



//**Projects****//
//*pg44*BMI calculator****/

//1 inch = 2.54 centimetres.
//2.2046 pounds in a kilo

//a)values for inches and pounds
let inches = 72;
let pounds = 180;
//b)values  for weight(kilos) and height(cm)
let weight = pounds / 2.2046; // in kilos
let height = inches * 2.54; // height in centimetres
//c)
console.log(weight, height);

//d)find the bmi
let bmi = weight/((height/100)**2);
console.log(bmi);





