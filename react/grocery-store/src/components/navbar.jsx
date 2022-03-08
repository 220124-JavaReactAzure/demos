import { Link } from "react-router-dom";

export default function NavBar() {
	return (
		<nav>
			<Link to="/form">Form</Link>
			<span> </span>
			<Link to="/list">Grocery List</Link>
			<span> </span>
			<Link to="/budget">Budget</Link>
			<span> </span>
			<Link to="/">Home</Link>
			<span> </span>
		</nav>
	);
}
