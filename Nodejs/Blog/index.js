"use strict"
//require modules
const express = require('express'),
      app = new express();
const homeController = require('./controllers/home');
const storePostController = require('./controllers/storePost');
const getPostController = require('./controllers/getPost');
const newUserController = require('./controllers/newUser')
//ch5
const mongoose = require('mongoose');

mongoose.connect('mongodb+srv://userA:WMsW8H2ZFvAlxufR@cluster0.fqsfsmc.mongodb.net/my_database', 
{useNewUrlParser: true});

const loginController = require('./controllers/login')
const fileUpload = require('express-fileupload')//ch7
const newPostController = require('./controllers/newPost')//ch9
const validateMiddleware = require("./middleware/validateMiddleware");
const storeUserController = require('./controllers/storeUser')
const loginUserController = require('./controllers/loginUser')
const expressSession = require('express-session');
const authMiddleware = require('./middleware/authMiddleware');
const redirectIfAuthenticatedMiddleware = require('./middleware/redirectIfAuthenticatedMiddleware');
const logoutController = require('./controllers/logout')
global.loggedIn = null;
const flash = require('connect-flash');
//////

///use middleware
app.use(express.static('public'))
app.use(express.json())
app.use(express.urlencoded())
app.use(fileUpload())
app.use(flash());
app.use('/posts/store', validateMiddleware)//use middleware for only post/store requests
app.use(expressSession({ secret: 'keyboard cat'}))
app.use("*", (req, res, next) => {
    loggedIn = req.session.userId;
    next()
    });


//****ch4********///
const ejs = require('ejs')
app.set('view engine', 'ejs')
///////

///use homecontroller
app.get('/',homeController)


///use getPosterController for this request
app.get('/post/:id',getPostController)


app.get('/posts/new', authMiddleware, newPostController);//ch9 use newPostController function to render form for post/new request
app.post('/posts/store', authMiddleware, storePostController)//use storePostController
app.get('/auth/register', redirectIfAuthenticatedMiddleware, newUserController)//use newUserController for /auth/register request
app.post('/users/register', redirectIfAuthenticatedMiddleware, storeUserController)
app.get('/auth/login', redirectIfAuthenticatedMiddleware, loginController);
app.post('/users/login', redirectIfAuthenticatedMiddleware, loginUserController)
app.get('/auth/logout', logoutController)
app.use((req, res) => res.render('notfound'));


//listen at port 4000
app.listen(4000, () => {
    console.log('App listening on port 4000')
})



