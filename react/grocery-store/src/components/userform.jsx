import { useContext, useRef } from "react";
import { guestContext } from "../App";

export default function Userform() {
	const usernameInput = useRef();
	const emailInput = useRef();
	const [guest, setGuest] = useContext(guestContext);

	function updateInfo() {
		const newUsername = usernameInput.current.value;
		const newEmail = emailInput.current.value;
		setGuest({ ...guest, username: newUsername, email: newEmail });
	}

	return (
		<>
			<input placeholder="Enter username" ref={usernameInput} />
			<input placeholder="Enter email" ref={emailInput} />
			<button onClick={updateInfo}>Login</button>
		</>
	);
}
