import express from "express";
import dotenv from "dotenv";
dotenv.config({
	path: "C:\\Users\\CharlesJester\\Desktop\\Revature\\trainerFiles\\batches\\java-react-azure\\demos\\js-to-ts\\js-to-web\\app.env"
});
const app = express();
app.use(express.json());

app.get("/hello/:id", (req, res) => {
	const id = Number(req.params.id);

	res.send(`Hello from JS express deployment! Hello ID: ${id}  Name: ${process.env.APPUSERNAME}`);
	res.status(200);
});

app.get("/error", (req, res) => {
	try {
		throw new Error("basic error");
	} catch (error) {
		if (error instanceof Error) {
			res.status(404);
			res.send(error.message);
		}
	}
});

app.listen(3000, () => console.log("Application has started"));
