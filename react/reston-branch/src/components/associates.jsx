import { useEffect, useState } from "react";

export function Associates() {
	// const assosciates = [
	// 	{ id: 101, name: "Phillip", points: 1000 },
	// 	{ id: 202, name: "Hannah", points: 99999999999 },
	// 	{ id: 303, name: "Mike", points: 100000 }
	// ];

	const [associates, setAssociates] = useState([]);
	const associateTable = associates.map((a) => (
		<tr key={a.id}>
			<td>{a.name}</td>
			<td>{a.points}</td>
		</tr>
	));

	async function fetchAssociates() {
		const response = await fetch("http://localhost:3000/associates");
		const fetchedAssociates = await response.json();
		setAssociates(fetchedAssociates);
	}

	// Hooks for impure functions interacting with information outside of react, API calls are common side effects
	useEffect(() => {
		fetchAssociates();
	}, []);
	// Second argument is the dependcies which are when useEffect hook will be called
	// none => every re-render
	// [] => once the component is first render

	return (
		<>
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Points</th>
					</tr>
				</thead>
				<tbody>{associateTable}</tbody>
			</table>
		</>
	);
}
