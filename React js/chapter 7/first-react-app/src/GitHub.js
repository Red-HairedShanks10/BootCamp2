
import React, { Component } from 'react';
import axios from 'axios'; // npm install axios
import ReactLoading from 'react-loading';
import { Card } from 'react-bootstrap';
import { Media, Form, Button } from 'react-bootstrap';

class GitHub extends Component {
constructor(){//constructor will do basic initilisation
super();
//make a state object
this.state = {
    data: [],//array to store all users data
    searchTerm:'',//used for storing the search term value
    isLoading : false//isloading will be false as since there is no call to Github yet//it will be true when handleSubmit() is called
    };

 //set bindings for hanldeChange and handleSubmit  of the form
this.handleChange = this.handleChange.bind(this);
this.handleSubmit = this.handleSubmit.bind(this);
}

//hanldeSubmit will deal with retrieving search results matching the searchTerm value
handleSubmit(e) {
    e.preventDefault();
    this.setState({
    isLoading : true//set to true as retrieval of data is in process
    })
    this.getGitHubData(this.state.searchTerm);
    }
    //handlechange send actual input values as they are inserted by user
    handleChange(e) {
        this.setState({ searchTerm: e.target.value });
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
    //display all GitHub users (using Card)
    const listUsers = this.state.data.map((user) =>
        <Card key={user.id}>
        <a href={user.html_url}>
        <img width={64} height={64} className="mr-3" src={user.avatar_url} alt="Generic placeholder"/>
        </a>
        <Card.Body>
        <h5>Login: {user.login}</h5>
        <p>Id: { user.id }</p>
        </Card.Body>
        </Card>
        );
    return (
        <div> 
               {/**form  with a single input for the search bar*/}
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
        <ReactLoading type="bars" color="#0948" />//to show loading in process: display bars loadin icon
        }
        {listUsers}{/**list users */}
        </div>
        );
}
}
export default GitHub;