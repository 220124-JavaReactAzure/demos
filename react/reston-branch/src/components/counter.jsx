import { useState } from "react";

export default function Counter() {
	// Even though count is changing there is nothing to let react know to re-render
	// let count = 0;
	// function increase() {
	// 	count++;
	// 	console.log(count);
	// }

	// [read-only variable, function that re-renders the component with the updated state]
	const [count, setCount] = useState(1);

	function increase() {
		const newValue = count + 1;
		setCount(newValue);
		// setCount(count + 1); // same as above, just explicitly  showing it's creating a newValue for count
	}

	return (
		<>
			<h3>The counter is at {count}</h3>
			<button onClick={increase}>Add to Counter</button>
		</>
	);
}
