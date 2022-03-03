console.log(document.getElementById("body"));
document.getElementsByClassName("bodyChild")[0].innerHTML = "Hi I'm the new header from the JS file";
document.getElementById("firstHeader").innerHTML = "This header has been changed";

const bodyChild = document.getElementsByClassName("bodyChild");

Array.from(bodyChild).map((i) => (i.innerHTML = "The map has changed me"));

// Query selector utilizes html syntax for ID, classes and elements
document.querySelector("h1").innerHTML = "Query  changed me";

let body = document.getElementById("body");

let children = body.childNodes;

console.log(children.parentNode);

let firstHeader = document.getElementById("firstHeader");

let newParagraph = document.createElement("p");

let paraText = document.createTextNode("This was created by JS, not written in HTML");

newParagraph.appendChild(paraText);

let bodyP = firstHeader.parentNode;

bodyP.insertBefore(newParagraph, firstHeader);

firstHeader.appendChild(newParagraph);

function myToggle() {
	body.classList.toggle("pretty");
}

function myAlert() {
	window.alert("Charles is a dingleberry");
}

window.setTimeout(myAlert, 5000);
