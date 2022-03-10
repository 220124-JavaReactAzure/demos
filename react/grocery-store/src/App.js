import { createContext, useState } from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Provider } from "react-redux";
import { store } from "./store";
import UserBar from "./components/user-bar";
import Userform from "./components/userform";
import NavBar from "./components/navbar";
import Budget from "./components/budget";
import GroceryList from "./components/grocery-list";

export const guestContext = createContext();

function App() {
	const [guest, setGuest] = useState({ username: "Guest", email: "No email" });

	return (
		<>
			{/* <guestContext.Provider value={[guest, setGuest]}>
				<UserBar />
				<Userform />
			</guestContext.Provider> */}

			<BrowserRouter>
				<Provider store={store}>
					<NavBar />
					<Routes>
						<Route path="budget" element={<Budget />}></Route>
						<Route path="list" element={<GroceryList />}></Route>
						<Route path="form" element={<GroceryForm />}></Route>
						<Route exact path="" element={<h1>Welcome to my Grocery</h1>}></Route>
					</Routes>
				</Provider>
			</BrowserRouter>
		</>
	);
}

export default App;
