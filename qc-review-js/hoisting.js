// Hoist up!

// Functions go through a 2 pass system with JS
// JS reads the function and sees there is a greeting variable
// it then creates a default greeting variable
helloThere("hi"); // what if variable above function? Can be hoisted as they are generated ahead of time by the 2pass system

function helloThere(input) {
	greeting = input || "hello"; // working as intended
	console.log(greeting);
	//var greeting = "Hello There"; // returning undefined bc variable hoisted
}
//generally speaking you don't put function calls above the declaration
console.log(greeting);
generalKenobi();

function generalKenobi() {
	let greeting = "Ahh General Kenobi"; // let down here prevents the 2 pass system from assigning a default value
	console.log(greeting);
	//let greeting = "Ahh General Kenobi"; // let prevents the 2 pass system from assigning a default value, will through a Reference Error
}
