
import React, { Component } from 'react';
import axios from 'axios'; // npm install axios
import ReactLoading from 'react-loading';
import { Card } from 'react-bootstrap';
import { Form, Button } from 'react-bootstrap';
import { Nav, Navbar } from 'react-bootstrap';
class GitHub extends Component {
constructor(){//constructor will do basic initilisation
super();
this.state = {
    data: [],//array to store all users data
    searchTerm:'',
    isLoading : false//isloading will be true as retrieval of data is still ongoing 
    };
this.handleChange = this.handleChange.bind(this);
this.handleSubmit = this.handleSubmit.bind(this);
}

handleSubmit(e) {
    e.preventDefault();
    this.setState({
    isLoading : true
    })
    this.getGitHubData(this.state.searchTerm);
    }

    handleChange(e) {
        this.setState({ searchTerm: e.target.value });
        }

componentDidMount(){//is called after constructor activity //and will call the GitHub server
   // this.getGitHubData('greg');//get gitHub data with the argument 'greg'
    }

getGitHubData(_searchTerm){//returns Github data//from an API endpoint
axios.get("https://api.github.com/search/users?q="+_searchTerm)//call API end point through axios get()method
.then(res => {//also returns a promise we get to subscribe to
    this.setState({
        isLoading : false,//once loading is finished set it to false//bcoz we get data from server at this point  
        data: res.data.items
        })
console.log(res.data.items);
});
}
render() {
    //display all users with 'greg'
    const listUsers = this.state.data.map((user) =>
<Card key={user.id}>
    {/**add nav link to the each users image */}
        <Nav.Link href={`/github/user/${user.login}/${user.id}`}>
        <img width={64} height={64} className="mr-3" src={user.avatar_url} alt="Generic placeholder"/>
        </Nav.Link>
        <Card.Body>
        <h5>Login: {user.login}</h5>
        <p>Id: { user.id }</p>
</Card.Body>
</Card>
);
    return (
        <div>
               <Form inline onSubmit={this.handleSubmit}>
                <Form.Group controlId="formInlineName">
                <Form.Control
                type="text"
                value={this.state.searchTerm}
                placeholder="Enter Search Term"
                onChange={this.handleChange}
                />
                </Form.Group>
                {' '}
                <Button type="submit">
                Search
                </Button>
                </Form>
            <h3>GitHub Users Results</h3>
        { this.state.isLoading &&
        <ReactLoading type="bars" color="#0948" />
        }
        {listUsers}
        </div>
        );
}
}

export default GitHub;