class Pet {
    constructor(legs) {
        this.legs = legs;
    }

    walk() {
        console.log(`walking on ${this.legs} legs`)
    }
}

class Dog extends Pet {
    constructor() {
        super(4);
    }

    bark() {
        console.log('bark bark!');
    }
}


let snake = new Pet(0);
snake.walk();
snake.bark();

let dog = new Dog();
dog.walk();
dog.bark();
