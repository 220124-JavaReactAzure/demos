import React from "react";
import ReactDOM from "react-dom";
import { Associates } from "./components/associates";
import Batches from "./components/batches";
import ContactUs from "./components/contact-us";
import Counter from "./components/counter";
import Employee from "./components/employee";
import Intro from "./components/intro";
import TechTrainings from "./components/tech-trainings";

const kevin = { empName: "Kevin Tran Huu", title: "Sr Trainer", estSalary: 150000 };

ReactDOM.render(
	<React.StrictMode>
		<Intro />
		<Employee empName={"Charles Jester"} title="Trainer" estSalary={10000} />
		<Employee empName={"Harvey Hill"} title="Tech Manager" estSalary={1000000000} />
		<Employee {...kevin} />
		<TechTrainings />
		<ContactUs />
		<Counter />
		<Batches />
		<Associates />
	</React.StrictMode>,
	document.getElementById("root")
);
