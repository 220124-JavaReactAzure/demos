import { useSelector } from "react-redux";

export default function GroceryList() {
	const items = useSelector((state) => state.items);
	const groceryList = items.map((i) => <li key={i}>{i}</li>);

	return (
		<>
			<h3>Groceries to Buy</h3>
			<ul>{groceryList}</ul>
		</>
	);
}
