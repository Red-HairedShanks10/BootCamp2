
import React, { Component} from 'react';
import Rating from './Rating';
import { Card } from 'react-bootstrap';
//product component to render one product
class Product extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
     //use card to render each product
    <Card style={{ width: '18rem' }}>
                
      <Card.Img variant="top" src={this.props.data.imageUrl} /> {/**assign props values to each product */}
      <Card.Body>
        <h5>{this.props.data.productName}</h5>
        { this.props.data.releasedDate }
        <Rating rating={this.props.data.rating} numOfReviews={this.props.data.numOfReviews}/>
        <p>{this.props.data.description}</p>
        </Card.Body>
        {/**props.data object will have imageUrl, productname releaseddate etc  */}
    </Card>
          
        );
    }
}

export default Product;