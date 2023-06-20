import React from 'react';
import Product from './Product';//importing Product component


//Main component contains the list of products
export default function Main(props) {

  const { products, onAdd } = props;
  return (
    <main className="block col-2">
      <h2>Products</h2>
      <div className="row">
        {products.map((product) => (//loop through array of products//with product as an argument
        //get the id of each product//then pass product argument to the Product component//do the same with onAdd 
          <Product key={product.id} product={product} onAdd={onAdd}></Product>
        ))}
      </div>
    </main>
  );
}
