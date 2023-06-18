import React, { Component } from 'react';
import { Button, Nav, Navbar } from 'react-bootstrap';
import { useParams, Link } from "react-router-dom";

class GitHubUser extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        const { id, login } = this.props.params;
        return (
            <div>
                <h1>User Login: {login}</h1>
                <h2>User Id: {id}</h2>
                <Nav.Link href="/github">
                    <Button variant="primary" type="button">
                        Go back to GitHub users.
                    </Button>
                </Nav.Link>
            </div>
        );
    }
}

export default (props) => (
    < GitHubUser
        {...props}
        params={useParams()}
    />
);