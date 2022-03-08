import { useRef, useState } from "react";

export default function Batches() {
	const batchInput = useRef();
	const [batches, setBatches] = useState([]);
	// const batchList = ["JavaReactAzure", "PEGA"];
	const batchListItems = batches.map((b) => <li key={b}>{b}</li>);

	function addBatch() {
		const batch = batchInput.current.value;
		// batches.push(batch); // This will change the array by not affect the state of react to force a re-render
		// console.log(batches);
		const newBatches = [...batches, batch];
		setBatches(newBatches);
	}

	return (
		<>
			<br></br>
			<br></br>
			<input placeholder="Enter batch name" ref={batchInput} />
			<button onClick={addBatch}>Add Batch</button>
			{batches.length === 0 || (
				<>
					<h3>Current Batches @ Revature</h3>
					<ul>{batchListItems}</ul>
				</>
			)}
		</>
	);
}
