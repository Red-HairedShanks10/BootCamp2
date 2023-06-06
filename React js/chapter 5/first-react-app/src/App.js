import React, { Component } from 'react';
import Products from './Products';
import Rating from './Rating';
import JumboTronComponent from './JumboTronComponent';



function App() {
    return (
       <div>
        <JumboTronComponent>
This is a long sentence, and I want to insert content into the
jumbotron component from the outside.
</JumboTronComponent>
       </div>

        );
        }

export default App;