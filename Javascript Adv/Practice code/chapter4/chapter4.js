// ternary operator 
let id_valid = true;
id_valid = false ? console.log('allowed') : console.log('denied');

function check_valid_id (user_id)
{
    if (user_id.length === 5)
    {
        return true;
    }
    return false;
    
};

let valid_id = check_valid_id(prompt("what is you ID number"));

valid_id ? alert('allowed') : alert('denied');