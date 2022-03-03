class Dinosaur {
    constructor(name, diet, habitat) {
        this.name = name;
        this.diet = diet;
        this.habitat = habitat;
    }

    getDescription() {
        console.log(`${this.name} is a ${this.diet} and lives in the ${this.habitat}`)
    }

    get['description'] () {
        return `${this.name} is a ${this.diet} and lives in the ${this.habitat}`;
    }

    static message() {
        console.log('Dinos!');
    }


}

// create our first dino:
var dino1 = new Dinosaur('Spinosaurus', 'carniovore', 'forest');
var dino2 = new Dinosaur('Velociraptor', 'carnivore', 'jungle');
var dino3 = new Dinosaur('ichthyosaur', 'herbivore', 'seas');

console.log(dino1);

console.log(dino2.description);

Dinosaur.message();
