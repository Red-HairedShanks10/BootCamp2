
var input = "Javascript is awesome";
var output = " ";
/*
    for(var i = 0; i < input.length; ++i){
            
         
          if (input[i] = "a"){
              output[i] += "4";
          } 
          else if (input[i] = "i"){
            output[i] += "1";
          }
          else if (input[i] = "o"){
            output[i] += "0";
          }
          else if (input[i] = "e"){
            output[i] += "3";
          }
          else {
            output[i] += input[i]
          }
          output = input;

      
          
    };
*/

 
for (let i = 0; i < input.length; i++) {
  var char = input[i];
  if (char.toUpperCase() === 'A') {
    output += 4;
  } else if (char.toUpperCase() === 'E') {
    output += 3;
  } else if (char.toUpperCase() === 'O') {
    output += 0;
  } else if (char.toUpperCase() === 'I') {
    output += 1;
  } else {
    output += char;
  }
}
console.log(output);
    

    