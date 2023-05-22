
//--4)
//a)
let url = "people.json";
//b)
fetch(url)
    //c)
    .then(resp => resp.json())
    //
    .then(data => {
        //5)
        console.log(data);
        //6)
        data.forEach(person => {
            console.log(`${person.first} ${person.last} - ${person.topic}`);
        });
    });

