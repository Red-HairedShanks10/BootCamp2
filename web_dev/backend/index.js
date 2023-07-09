import app from './server.js'
import mongodb from "mongodb"
import dotenv from "dotenv"
import MoviesDAO from './dao/moviesDAO.js'
import ReviewsDAO from './dao/reviewsDAO.js'

//asynchronous function to connect to the Mongodb cluster
async function main() {//call functions to access to the database
    //config to load envirnoment variable
    dotenv.config()
    const client = new mongodb.MongoClient( //creating an instance MongoClient to hold our database URI
        process.env.MOVIEREVIEWS_DB_URI
    )
    const port = process.env.PORT || 8000
    try {
        // Connect to the MongoDB cluster
        await client.connect()
        await MoviesDAO.injectDB(client)
        await ReviewsDAO.injectDB(client)
        app.listen(port, () => {
            console.log('server is running on port:' + port);
        })
    } catch (e) {
        console.error(e);
        process.exit(1)
    }
}
main().catch(console.error);