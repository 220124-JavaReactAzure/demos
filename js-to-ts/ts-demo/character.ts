const formUser: HTMLElement | null = document.getElementById("form_user");

if (formUser != null) {
	formUser.addEventListener("submit", function (event) {
		event.preventDefault();
		searchUser();
	});
} else {
	console.log("This ID doesn't exist!");
}
// To grab lodestone ID and retrieve all gear equipped
async function searchUser() {
	let searchUser: string | null = (<HTMLInputElement>document.getElementById("searchUser")).value;
	let searchServer = (<HTMLInputElement>document.getElementById("searchServer")).value;

	let html_code = "";

	const response = await fetch(`https://xivapi.com/character/search?name=${searchUser}&server=${searchServer}`);
	const character = await response.json();
	console.log(character);

	const response_lodestone = await fetch(`https://xivapi.com/character/${character.Results[0].ID}`);
	const lodestone = await response_lodestone.json();

	html_code += `<h1>${lodestone.Character.Name}</h1>`;
	html_code += `<img src="${lodestone.Character.Portrait}" style="max-width: 30%; max-height: 30%;"/>`;

	let gearset = await gearSet(lodestone.Character.GearSet.Gear);
	html_code += `<table>
                    <thead>
                        <tr>
                            <th>Slot</th><th>Icon</th>
                        </tr>
                    </thead>
                    <tbody>
                        ${gearset}
                    </tbody>
                </table>`;

	(<HTMLElement>document.getElementById("ffxiv_user")).innerHTML += html_code;
}

// To grab all gear from lodestone
async function gearSet(Gear: Array<Object>) {
	let gearSlots: Array<string> = Object.keys(Gear);
	console.log(gearSlots);

	const array: Array<string> = await Promise.all(
		gearSlots.map(async (slot: any) => {
			let item: { [key: string]: any } = Gear[slot];
			const gearResponse = await fetch(`https://xivapi.com/item/${item.ID}`);
			let gear = await gearResponse.json();
			return gear.IconHD;
		})
	);

	return array.map((img, i) => `<tr><td>${gearSlots[i]}</td><td><img src="https://xivapi.com/${img}"/></td></tr>`);
}
