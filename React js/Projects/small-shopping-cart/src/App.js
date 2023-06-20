import Header from './components/Header';
import Main from './components/Main';
import Basket from './components/Basket';
import data from './data';
import { useState } from 'react';

function App() {

  //extract products from data//products will then be rendered in the "Main" component
  const { products } = data;
  //implement a state to manage cart items with useState()hook for functional components
  const [cartItems, setCartItems] = useState([]);

  //onAdd function adds items to cart
  const onAdd = (product) => {//argument is product being added to the cart
    const exist = cartItems.find((x) => x.id === product.id);
    if (exist) {//if it exists in cart already//we increase quantity of it
      setCartItems(
        cartItems.map((x) =>
          x.id === product.id ? { ...exist, qty: exist.qty + 1 } : x
        )
      );
    } else {//if it doesnt exist in cart set the quantity of that product to 1
      setCartItems([...cartItems, { ...product, qty: 1 }]);
    }
  };

  //function to remove products from the cart 
  const onRemove = (product) => {
    const exist = cartItems.find((x) => x.id === product.id);
    if (exist.qty === 1) {//if product exist 
      setCartItems(cartItems.filter((x) => x.id !== product.id));
    } else {
      setCartItems(
        cartItems.map((x) =>
          x.id === product.id ? { ...exist, qty: exist.qty - 1 } : x
        )
      );
    }
  };
  return (
    //render content from different components
    <div className="App">
      <Header countCartItems={cartItems.length}></Header>
      <div className="row">
        <Main products={products} onAdd={onAdd}></Main>
        <Basket
          cartItems={cartItems}
          onAdd={onAdd}
          onRemove={onRemove}
        ></Basket>
      </div>
    </div>
  );
}

export default App;
