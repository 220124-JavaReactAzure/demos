// completely valid array no issues
const array = ["HI", 1, true, null, undefined];

// Array Destructuring
const [word, value, isTrue, isNull, undef] = array;

console.log(word);
console.log(value);
console.log(isTrue);

// Array like below
const [uname, first, trueAge] = ["PhilipW", "Philip", 21];

console.log(`Username: ${uname}\nFirst Name: ${first}\nAge: ${trueAge}`);

// Object Destructuring
// is to match up the objects keys when destructuring
//const user = { username: "JesterCharles", fname: "Charles", age: 28 };
const { username, fname, age } = { username: "JesterCharles", fname: "Charles", age: 28 };

// console.log(user.username);

console.log(`Username: ${username}`);
console.log(`First Name: ${fname}`);
console.log(`Age: ${age}`);
