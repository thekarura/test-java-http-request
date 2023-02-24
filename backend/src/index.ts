import express, { Request, Response } from "express";
import dotenv from "dotenv";

dotenv.config();

const main = () => {
  const app = express();
  const port = process.env.PORT || 3000;

  app.get('/', (req: Request, res: Response) => {
    res.send('Hello World!');
  });

  app.post('/test', (req: Request, res: Response) => {
    console.log(`Request body: ${req.body}`);
    res.send('Hello World! you are using POST method');
  });
  app.listen(port, () => {
    console.log(`Server running on port ${port}`);
  });
};

main();
