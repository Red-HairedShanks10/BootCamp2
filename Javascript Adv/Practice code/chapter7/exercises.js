//**pg154***Exercise 7.1*****//

class Person {
    constructor(firstname, lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    //exercise 7.2
    fullname() {
        return `${this.firstname} ${this.lastname}`;
    };

}
let person1 = new Person("Luffy", "Monkey D");
let person2 = new Person("Shanks", "Figarlan D");
console.log(`hello, ${person1.firstname}.`);
console.log(`hello, ${person2.firstname}.`);


//**End of exercise 7.1 ******//


//*pg156***Exercise 7.2**********//
console.log(person1.fullname());
console.log(person2.fullname());

//**END of exercise 7.2*****//



//*pg163***Exercise 7.3*******//

class Animal {
    constructor(species, sounds) {
        this.species = species;
        this.sounds = sounds;
    }
    speak() {
        console.log(this.species + " " + this.sounds);
    }
}
Animal.prototype.eat = function () {
    return this.species + " is eating";
}

let cat = new Animal("cat", "meow");
let dog = new Animal("dog", "bark");
cat.speak();
console.log(dog.eat());
console.log(dog);

//***END of Exercise 7.3*****//


//************************Projects**********************//

//****pg163***Employee tracking*************//
class Employee {
    constructor(first, last, years) {
        this.first = first;
        this.last = last;
        this.years = years;
    }
}

let emp1 = new Employee("Marco", "Spynx", 3);
let emp2 = new Employee("Dragon", "Kai", 2);
let workers = [emp1, emp2];

Employee.prototype.details = function () {
    return `${this.first} ${this.last} has ${this.years} years of experience `;
}

workers.forEach((worker) => {
    console.log(worker.details());
});

//***************END OF Employee Tracker*******//

//***pg163****Menu items price calculator**********//
class Menu {
    #offer1 = 10;
    #offer2 = 20;
    constructor(val1, val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    calTotal() {
        return (this.val1 * this.#offer1) + (this.val2 * this.#offer2);
    }
    get total() {
        return this.calTotal();
    }
}

const val1 = new Menu(2, 0);
const val2 = new Menu(1, 3);
const val3 = new Menu(3, 2);
console.log(val1.total);
console.log(val2.total);
console.log(val3.total);

//***END OF Menu items price calculator******//