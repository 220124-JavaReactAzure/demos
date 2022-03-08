// Function Component
// The function name MUST start with a capital

export default function Intro() {
	/*
	return JSX
	hybrid language, Facebook said let's just combine HTML/CSS/JS
	There already so intertwined in creating a web page you might as well meld them togeth
    */
	const location = "Reston VA, 19047";

	// You NEED a return, that return must be a SINGLE parent tag
	return (
		<>
			<h1>Hello from {location}</h1>
			<p>Welcome to the Reston Revature Office.</p>
		</>
	);
}
