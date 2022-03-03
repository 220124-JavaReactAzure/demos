function myFunction() {
	const doc = document.getElementById("value1");
	if (doc.checked === true) {
		document.getElementById("label1").innerHTML = "sure he did...";
	}
	const doc2 = document.getElementById("value2");
	if (doc2.checked === true) {
		document.getElementById("label2").innerHTML = "His liver readings tells me otherwise";
	}
	const doc3 = document.getElementById("value3");
	if (doc3.checked === true) {
		document.getElementById("label3").innerHTML = "Yet...here he is";
	}
}

function hahaAlert() {
	window.alert("HAH! Poor Charles. Here's a cookie!");
}
