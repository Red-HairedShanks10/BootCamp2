/*****************CLASSSES**************************/

/*class syntax*/
class ClassName {
    constructor(prop1, prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
}
let obj = new ClassName("arg1", "arg2");
/******/



//*Dog class//

class Dog {
    constructor(dogName, weight, color, breed) {
        this.adogName = dogName;
        this.aweight = weight;
        this.acolor = color;
        this.abreed = breed;
    }
}

let dog = new Dog("JavaScript", 2.4, "brown", "Husky");

console.log(dog.adogName, "is a", dog.abreed, "and weighs", dog.aweight, "kg.");
//********/

//***Person class...
class Person {
    constructor(firstname, lastname = "Doe") { //constructor helps initialised the properties
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

let p = new Person("Saba", "Fiba"); // new keyword enables the constructor to run
console.log("Hi", p.firstname, p.lastname);

let p1 = new Person("Maaike"); //creating an object without specifying all the properties will return undefined values...
console.log(p1.firstname, p1.lastname);
//*****/


/* /***Methods**** //

class Persons {
   constructor(firstname, lastname) {
   this.firstname = firstname;
   this.lastname = lastname;
   }
   greet() {// Class funtion (method)
   console.log("Hi there! I'm", this.firstname);
   }
   
   //compliment method
   compliment(name, object) {
       return "That's a wonderful " + object + ", " + name;
       }

   }
   
   // calling a class's method
   let p2 = new Persons("Saba", "Fiba");
    p2.greet();
    //assigning compliment method into a variable....
    var compliment = p2.compliment("Marco", dog.abreed);
    console.log(compliment);

//********/

//***Properties***//

class Persons {
    #firstname;
    #lastname;
    constructor(firstname, lastname) {
        this.#firstname = firstname;
        this.#lastname = lastname;
    }

    //get firstname
    get firstname() {
        return this.#firstname;
    }

    //set firstname
    set firstname(firstname) {
        this.#firstname = firstname;
    }

    //get lastname
    get lastname() {
        return this.#lastname;
    }

    //set lastname
    set lastname(lastname) {
        this.#lastname = lastname;
    }


    greet() { // Class funtion (method)
        console.log("Hi there! I'm", this.firstname);
    }

    //compliment method
    compliment(name, object) {
        return "That's a wonderful " + object + ", " + name;
    }

}
let p3 = new Persons("Maria", "Saga");
console.log(p3.firstname, p3.lastname); //uses the get methods with the names: firstname and lastname respectively
p3.greet();

//**************//

//***Inheritance***pg159//

//*Vehicle class

class Vehicle {
    constructor(color, currentSpeed, maxSpeed) {
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
    }
    move() {
        console.log("moving at", this.currentSpeed);
    }
    accelerate(amount) {
        this.currentSpeed += amount;
    }
}

//***Motorcycle class inherits from Vehicle class****/
class Motorcycle extends Vehicle { //inherits with the use of the extends keyword
    constructor(color, currentSpeed, maxSpeed, fuel) { //child class's contrustor param
        super(color, currentSpeed, maxSpeed); //using super keyword to access the parent class's fields and methods....
        this.fuel = fuel; //the only field to be initialised in this class...
    }
    doWheelie() { //method specific to the motocycle class
        console.log("Driving on one wheel!");
    }
}


let motor = new Motorcycle("Black", 0, 250, "gasoline"); //
console.log(motor.color);
motor.accelerate(50);
console.log(motor.currentSpeed);
motor.move();

//**************/



/**Prototypes******pg161*********/

class Persona {
    constructor(firstname, lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    greet() {
        console.log("Hi there!");
    }
}


Persona.prototype.introduce = function () {
    console.log("Hi, I'm", this.firstname);
};

Persona.prototype.favoriteColor = "green";

let pa = new Persona("Maria", "Saga");
console.log(pa.favoriteColor);
pa.introduce();

/****END of Prototypes***********/