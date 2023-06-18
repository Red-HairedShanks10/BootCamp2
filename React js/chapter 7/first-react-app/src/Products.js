import React, { Component } from 'react';
import Product from './Product';

class Products extends Component {

    products;//pg 41-- create products property
constructor(props){
    super(props);
this.products = this.getProducts(); // pg 41--- assign returned getProducts results to products property 
}

    getProducts() { //pg 40--return list of products
        return [
       /* {
        imageUrl: "http://loremflickr.com/150/150?random=1",
        productName: "Product 1",
        releasedDate: "May 31, 2016",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Aenean porttitor, tellus laoreet venenatis facilisis, enim ex faucibus nulla, idrutrum ligula purus sit amet mauris. ",
        rating: 4,
        numOfReviews: 2
},
{
imageUrl: "http://loremflickr.com/150/150?random=2",
productName: "Product 2",
releasedDate: "October 31, 2016",
description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean porttitor, tellus laoreet venenatis facilisis, enim ex faucibus nulla, idrutrum ligula purus sit amet mauris. ",
rating: 2,
numOfReviews: 12
},
{
imageUrl: "http://loremflickr.com/150/150?random=3",
productName: "Product 3",
releasedDate: "July 30, 2016",
description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean porttitor, tellus laoreet venenatis facilisis, enim ex faucibus nulla, idrutrum ligula purus sit amet mauris. ",
rating: 5,
numOfReviews: 2
}*/
];//comment within return[...]
};

render() {
    //loop through products object
    const listProducts = this.products.map((product) =>
    <Product key={product.productName} data={product} />
    );
    /*
    return (
        <div>
        {listProducts.length > 0 && //if theres list of products
        <ul>{listProducts}</ul> //display them
        }
        {listProducts.length == 0 && //if there is no products
        <ul>No Products to display</ul>//display message
        }
        </div>
        );*/

        return (
            <div>{/**inline if else with conditional operator */}
            {listProducts.length > 0 ? ( //use tenary operator for conditional display
            <ul>{listProducts}</ul>//display when condition is true the list of products
            ) : (//else...
            <ul>No Products to display</ul>//display message if condition is false
            )}
            </div>
            );
}
}
export default Products;