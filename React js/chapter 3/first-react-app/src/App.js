import React, { Component } from 'react';
import Products from './Products';
import { Button } from 'react-bootstrap';
import Rating from './Rating';

class App extends Component {
render() {
    const isValid = true;
return (
    <div>
      {/* <Products />
      <div>
      <Button variant="dark" disabled={isValid}>Void</Button> 
      </div>
      <Button variant="danger" disabled={!isValid}>Warning</Button>   */}
      <Rating rating="1"/>
       <Rating rating="2"/>
        <Rating rating="3"/>
        <Rating rating="4"/>
        <Rating rating="5"/>

    </div>

);
}
}

export default App;