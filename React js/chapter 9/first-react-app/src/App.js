import React, { Component } from 'react';
import Products from './Products';
import Rating from './Rating';
import JumboTronComponent from './JumboTronComponent';
import UserForm from './UserForm';
import GitHub from './GitHub';
import GitHubUser from './GitHubUser'; //first import the GitHubUser component
import {BrowserRouter,Routes, Route} from 'react-router-dom';
import { Nav, Navbar } from 'react-bootstrap';



function App() {
    return (
       <div>
        {/**Render Header */}
        <Header />
       </div>

        );
        }

        export default App;

        //classes/components can be defined within the same script/file
        class Header extends Component {
        render(){
        return (
        <BrowserRouter>{/**BrowserRouter has router components and navbar component */} 
        <div>
        <Navbar bg="light" expand="lg">
        <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="mr-auto">
            
        <Nav.Link href="/">Home</Nav.Link>
        <Nav.Link href="/github">GitHub</Nav.Link>
        <Nav.Link href="/About">About</Nav.Link>
        </Nav>
        </Navbar.Collapse>
        </Navbar>

        <Routes>
        <Route exact path="/github/user/:login/:id" element={<GitHubUser />} />
        <Route path="/github" element={<GitHub />} />
        <Route exact path="/" element={<Home />} />
        <Route path="/About" element={<About />} />
        <Route path="/*" element={<NotFound />} />
        </Routes>
        </div>
        </BrowserRouter>

        )
        }
        }

class Home extends Component {
    render(){
        return (
            <div>
            Home
            </div>
        )
    }
}


class NotFound extends Component {
render(){
    return <div>Not Found</div>
 }
}

class About extends Component {
    render(){
        return (
            <div>
            <Rating />
            </div>
            )
    }
}
