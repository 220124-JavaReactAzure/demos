const dog = {
	name: "Atlas",
	bark: () => {
		console.log("Bork Bork!");
	}
};

console.log(dog.bark);

const array = [1, 2, 3, "4"];

const print = (e) => {
	console.log(e);
};

const addMult = (a = 1, b = 5) => {
	const add = a + b;
	const mult = a * b;
	return add + mult;
};

function addDiv(a, b) {
	const add = a + b;
	const div = a / b;
	return add + div;
}

array.map(print);
console.log(array.reduce(addMult));
console.log(array.reduce(addDiv));
console.log(addMult());

const add = (...i) => {
	return i.reduce((a, b) => a + b);
};

console.log(add(1, 2, 4, 5, 7));
