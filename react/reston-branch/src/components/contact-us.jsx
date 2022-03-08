import { useRef } from "react";

export default function ContactUs() {
	// Hooks are special functions, they ALL start with "use" that "supercharges" your functional components
	const emailInput = useRef(); // constant mutable reference to a node on the dom

	function sendEmail() {
		alert("An email has been sent to " + emailInput.current.value);
	}

	return (
		<>
			<h3>Request an email to contact us</h3>
			<input placeholder="Enter email address" ref={emailInput} />
			<button onClick={sendEmail}>Email Me</button>
		</>
	);
}
