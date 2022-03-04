(<HTMLElement>document.getElementById("form")).addEventListener("submit", function (event) {
	// prevent the page from refreshing
	event.preventDefault();
	searchItems();
});

async function searchItems(searchItem: string | null = null) {
	if (!searchItem) {
		searchItem = (<HTMLInputElement>document.getElementById("searchItem")).value;
	}
	console.log(searchItem);
	let html_code = "";

	const response = await fetch(`https://xivapi.com/item/${searchItem}`);
	let item = await response.json();
	console.log(item);
	html_code += `<h1>${item.Name}</h1>`;
	html_code += `<img src="https://xivapi.com/${item.IconHD}"/>`;
	(<HTMLElement>document.getElementById("ffxiv_item")).innerHTML += html_code;
}
