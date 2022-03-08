import React from "react";

// We want to render based on provided information
// done using props!
export default function Employee(props) {
	const { empName, title, estSalary } = props;

	return (
		<>
			<h3>Name: {empName}</h3>
			<h4>Title: {title}</h4>
			<h5>Est Salary: {estSalary}</h5>
		</>
	);
}
