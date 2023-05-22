"use strict";

//**********Exercise 9.1************** */
//finding the document object nested in window object using console.dir(window):
console.dir(window); //document will be in a list before external....
//**END OF EXERCISE 9.1*********/
//*pg217*******EXERCISE 9.2***************//
//displays the protocol of current file

console.log(window.location.protocol); //displays the directory of current file....

console.log(window.location.href); //***END OF EXERCISE 9.2*****************//
//* pg221***********EXERCISE 9.3*************

var output = document.querySelector('.output'); //gets the document output and stores it in the variable "output"

output.textContent = "Hello World"; //the  textcontent property will have the string value of "Hello world"

output.classList.add("red");
output.id = "tester";
output.style.backgroundColor = "red"; //background color for the element will be set to red

console.log(document.URL); //display on the console the URL of the current file.....

output.textContent = document.URL; //textcontent for the element will change to URL of file....
//**************************END OF EXERCISE 9.3***********/
//*****************************************END OF CHAPTER 9 EXERCISES********************************************//

/*
for (const property in document) {
    console.log(`${property}: ${document[property]}`);
}


for (const property in window) {
    console.log(`${property}: ${document[window]}`);
}


const op = document.querySelector('h1');
op.textContent = "Hello World"; */