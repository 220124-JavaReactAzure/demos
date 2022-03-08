import { useDispatch, useSelector } from "react-redux";

export default function Budget() {
	const budget = useSelector((state) => state.budget);
	const dispatch = useDispatch();

	function increase() {
		const action = { type: "grocery/increaseBudget" };
		dispatch(action);
	}

	function decrease() {
		const action = { type: "grocery/decreaseBudget" };
		dispatch(action);
	}

	return (
		<>
			<h3>Budget {budget}</h3>
			<button onClick={increase}>Increase</button>
			<button onClick={decrease}>Decrease</button>
		</>
	);
}
