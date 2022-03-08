export default function TechTrainings() {
	const techs = ["Java", "JavaScript", "Python", "ETL", "Node Developer"];
	const techListItems = techs.map((t) => <li key={t}>{t}</li>);

	return <ul>{techListItems}</ul>;
}
