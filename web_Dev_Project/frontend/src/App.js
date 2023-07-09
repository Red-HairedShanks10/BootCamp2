import logo from './logo.svg';
import React from 'react'
import './App.css';
import { Switch, Route, Link } from "react-router-dom"
import Nav from 'react-bootstrap/Nav'
import Navbar from 'react-bootstrap/Navbar'
import "bootstrap/dist/css/bootstrap.min.css"
import AddReview from "./components/add-review"
import MoviesList from "./components/movies-list"
import Movie from "./components/movie"
import Login from "./components/login"




function App() {

  //use React.useState() hook to add local state to functional components
  const [user, setUser] = React.useState(null)//set null as initial value for user

  //login function will be called from the login component
  async function login(user = null) {// set default user to null
    setUser(user)
  }

  async function logout() {
    setUser(null)
  }

  return (
    <div className="App">
      <Navbar bg="light" expand="lg">
        <Navbar.Brand href="#home">Movie Reviews</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="mr-auto">
            <Nav.Link>
              <Link to={"/movies"}>Movies</Link>
            </Nav.Link>
            <Nav.Link>
              {/**if user is logged in.. display option to log out//if user is not logged in display login option  */}
              {user ? (<a onClick={logout}>Logout User</a>) : (<Link to={"/login"}>Login</Link>)}
            </Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Navbar>
     
     {/**using switch to navigate through different routes*/}
      <Switch>
        {/**if route the path  is root path or movies path --show content of Movieslist component */}
        <Route exact path={["/", "/movies"]} component={MoviesList}>
        </Route>
        <Route path="/movies/:id/review" render={(props) =>
          <AddReview {...props} user={user} />
        }>
        </Route>
        <Route path="/movies/:id/" render={(props) =>
          <Movie {...props} user={user} />
        }>
        </Route>
        <Route path="/login" render={(props) =>
          <Login {...props} login={login} />
        }>
        </Route>
      </Switch>
    </div>
  );
}

export default App;
