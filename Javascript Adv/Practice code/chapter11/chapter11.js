//pg266
//document.getElementById("unique").onclick = function() { magic(); };

//pg268
//document.getElementById("unique").addEventListener("click", magic);

//pg268
// document.getElementById("unique").addEventListener("click", function()
// { magic(arg1, arg2) });

//pg269
// document.addEventListener("DOMContentLoaded", (e) => {
//     console.log(e);
//     });


//pg270
// function changeColor() {
//     document.getElementById("divvy").style.backgroundColor = "blue";
// };

//pg 271
// window.onload = function donenow() {
//     console.log("hi");
//     document.getElementById("divvy").addEventListener("mousedown",
//         function () {
//             changeColor(this, "green");
//         });
//     document.getElementById("divvy").addEventListener("mouseup",
//         function () {
//             changeColor(this, "yellow");
//         });
//     document.getElementById("divvy").addEventListener("dblclick",
//         function () {
//             changeColor(this, "black");
//         });
//     document.getElementById("divvy").addEventListener("mouseout",
//         function () {
//             changeColor(this, "blue");
//         });
// }
// console.log("hi2");

// function changeColor(el, color) {
//     el.style.backgroundColor = color;
// }


//pg 273
// function sendInfo() {
//     let p = event.target.parentElement;
//     message("Welcome " + p.firstname.value + " " + p.lastname.
//     value);
//     }
//     function message(m) {
//     document.getElementById("welcome").innerHTML = m;
//     }


// //pg276/pg277
// function bubble() {
//     console.log(this.innerText);
//     }
//     let divs = document.getElementsByTagName("div");
//     for (let i = 0; i < divs.length; i++) {
//     divs[i].addEventListener("click", bubble);
//     }


//pg280/pg281
// function logEvent() {
//     let p = event.target;
//     if (p.name == "firstname") {
//     message("First Name Changed to " + p.value);
//     } else {
//     message("Last Name Changed to " + p.value);
//     }
//     }
//     function sendInfo() {
//     let p = event.target.parentElement;
//     message("Welcome " + p.firstname.value + " " + p.lastname.
//     value);
//     }

//     function message(m) {
//         document.getElementById("welcome").innerHTML = m;
//         }

//pg283
// function numCheck() {
//     message("Number: " + !isNaN(event.key));
//     return !isNaN(event.key);
// }

// function numCheck2() {
//     message("Not a number: " + isNaN(event.key));
//     return isNaN(event.key);
// }

// function message(m) {
//     document.getElementById('wrapper').innerHTML = m;
// }
// onkeypress="return numCheck2()";

//pg284
// function numCheck() {
//     message(!isNaN(event.key));
//     return !isNaN(event.key);
//     }
//     function numCheck2() {
//     message(isNaN(event.key));
//     return isNaN(event.key);
//     }
//     function message(m) {
//     document.getElementById("wrapper").innerHTML = m;
//     }

//pg285->pg287
// let holderItem;

// function dStart() {
//     holderItem = event.target;
// }

// function nDrop() {
//     event.preventDefault();
// }

// function dDrop() {
//     event.preventDefault();
//     if (event.target.className == "box") {
//         event.target.appendChild(holderItem);
//     }
// }

//pg289
// let q = window.location.search;
// let params = new URLSearchParams(q);
// let name = params.get("name");
// console.log(name);

//pg290/pg291
// function valForm() {
//     var p = event.target.children;
//     if (p.firstName.value == "") {
//         message("Need a first name!!");
//         return false;
//         }
//         if (p.lastName.value == "") {
//         message("Need a last name!!");
//         return false;
//         }
//         if (p.age.value == "") {
//         message("Need an age!!");
//         return false;
//         }
//         return true;
//         }
//         function message(m) {
//         document.getElementById("wrapper").innerHTML = m;
//         }

//pg292
// function toTheRight() {
//     let b = document.getElementById("block");
//     let x = 0;
//     setInterval(function () {
//         if (x === 600) {
//             clearInterval();
//         } else {
//             x++;
//             b.style.left = x + "px";
//         }
//     }, 2);
// }

