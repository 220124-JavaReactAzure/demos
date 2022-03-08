// ... spreads out all the number parameters given and turns them into an array
function add(...nums) {
	return nums.reduce((a, b) => a + b);
}

console.log(add(1, 2, 3, 4));

const nums = [10, 20, 30, 40, 50];
const clonedNums = [...nums, 60];

console.log(clonedNums);

const user = { id: 101, username: "JesterCharles", role: "Trainer" };
const clonedUser = { ...user, desiredSalary: 100_000 };
console.log(clonedUser);
console.log(user);
