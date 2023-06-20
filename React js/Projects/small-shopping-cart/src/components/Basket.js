import React from 'react';

//Basket component deals with the products added in the cart 
export default function Basket(props) {
  //include cartItems,onAdd(), onRemove() from props in order to implememnt them
  const { cartItems, onAdd, onRemove } = props;
  //**We have different prices to account for in our final cost summary */
  const itemsPrice = cartItems.reduce((a, c) => a + c.qty * c.price, 0);//using reduce()helps with calculating subTotal price
  const taxPrice = itemsPrice * 0.14;//calculate taxPrice
  const shippingPrice = itemsPrice > 2000 ? 0 : 20;//decide shipping fee based on if price of items exceeds 2000
  const totalPrice = itemsPrice + taxPrice + shippingPrice;//total price of everything
  return (
    <aside className="block col-1">
      <h2>Cart Items</h2>
      <div>

        {cartItems.length === 0 && <div>Cart is empty</div>}
        {cartItems.map((item) => (
          <div key={item.id} className="row">
            <div className="col-2">{item.name}</div>
            <div className="col-2">

              {/**buttons will act like event handlers when clicked on to either remove or add items into cart/basket */}
              <button onClick={() => onRemove(item)} className="remove">
                -
              </button>{' '}
              <button onClick={() => onAdd(item)} className="add">
                +
              </button>
            </div>

            <div className="col-2 text-right">
              {item.qty} x ${item.price.toFixed(2)}
            </div>
          </div>
        ))}

        {cartItems.length !== 0 && (
          <>
          {/**listing the different cost for the final cost summary */}
            <hr></hr>
            <div className="row">
              <div className="col-2">Items Price</div>
              <div className="col-1 text-right">${itemsPrice.toFixed(2)}</div>
            </div>
            <div className="row">
              <div className="col-2">Tax Price</div>
              <div className="col-1 text-right">${taxPrice.toFixed(2)}</div>
            </div>
            <div className="row">
              <div className="col-2">Shipping Price</div>
              <div className="col-1 text-right">
                ${shippingPrice.toFixed(2)}
              </div>
            </div>

            <div className="row">
              <div className="col-2">
                <strong>Total Price</strong>
              </div>
              <div className="col-1 text-right">
                <strong>${totalPrice.toFixed(2)}</strong>
              </div>
            </div>
            <hr />
            <div className="row">
              <button onClick={() => alert('Implement Checkout!')}>
                Checkout
              </button>
            </div>
          </>
        )}
      </div>
    </aside>
  );
}
