// Closures:
// they are functions that return a function
// the returned fucntion still has access to variables that were created in the outer function

function outer() {
	let counter = 0;

	function inner() {
		counter++;
		console.log(counter);
	}

	return inner;
}

const charlesCounter = outer();
charlesCounter();
charlesCounter();
charlesCounter();
charlesCounter();
console.log();

const mikeCounter = outer();
mikeCounter();
mikeCounter();
mikeCounter();
mikeCounter();
mikeCounter();
