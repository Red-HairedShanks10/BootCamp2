import React, { Component } from 'react';
import { IoIosStar, IoIosStarOutline } from 'react-icons/io'
class Rating extends Component {
    //pg33
    constructor(props){
        super(props);
        this.state = {rating: this.props.rating};//initialise state variables once super() is invoked//now state has the rating attribute 
        }
        handleClick(ratingValue){
            this.setState({rating:ratingValue});
            }

        render() {
            return (
            <div>
            <h1>Rating: {this.state.rating}</h1>
            {this.state.rating >= 1 ? (//if  state.rating is 1 or greater.... 
            <IoIosStar onClick={this.handleClick.bind(this,1)}/>//render a filed up star//each star has handleClick function as an event Handler
                                                                //and will assign a value based on how many stars the user clicks on
            ) : (
            <IoIosStarOutline onClick={this.handleClick.bind(this,1)}/>//otherwise render empty star
            )}
            
            {this.state.rating >= 2 ? (
            <IoIosStar onClick={this.handleClick.bind(this,2)}/>
            ) : (
            <IoIosStarOutline onClick={this.handleClick.bind(this,2)}/>)}

            {this.state.rating >= 3 ? (
            <IoIosStar onClick={this.handleClick.bind(this,3)}/>
            ) : (
            <IoIosStarOutline onClick={this.handleClick.bind(this,3)}/>
            )}

            {this.state.rating >= 4 ? (
            <IoIosStar onClick={this.handleClick.bind(this,4)}/>
            ) : (
            <IoIosStarOutline onClick={this.handleClick.bind(this,4)}/>
            )}

            {this.state.rating >= 5 ? (
            <IoIosStar onClick={this.handleClick.bind(this,5)}/>
            ) : (
            <IoIosStarOutline onClick={this.handleClick.bind(this,5)}/>
            )}

            </div>
            );
            }}

    export default Rating;