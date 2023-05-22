  

  function areArraysSame (array1,array2){
             

             if( array1.length !== array2.length){
                return false; 
            }

                    for ( i = 0; i < array1.length; i++){
                          if (array1[i] != array2[i]){
                                return false;
                          } 
                    } return true;
             
  };

  console.log(areArraysSame([1,2,3],[1,2,4]));
  console.log(areArraysSame([1,2,3],[1,2,3]));
  console.log(areArraysSame([1,2,3],[1,2,3,5]));
