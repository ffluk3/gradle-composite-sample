import { Request, Response, Express } from "express";
import express from 'express'

const app: Express = express();
const PORT: Number = 3000;

app.get("/", (req: Request, res: Response) => {
    res.send("hello world");
})

app.get("/data", (req: Request, res: Response) => {
    res.json({
        data: 'success',
        Type: true,
    });
})


let Server = app.listen(PORT, () => {
    console.log("port is running on the " + PORT);
});

module.exports = { app, Server }
