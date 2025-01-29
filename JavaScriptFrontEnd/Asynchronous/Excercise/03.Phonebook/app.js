function attachEvents() {

    document.getElementById('btnLoad').addEventListener('click', load);
    document.getElementById('btnCreate').addEventListener('click', create);

}



function load(){
    fetch('http://localhost:3030/jsonstore/phonebook').then(function(data){
        return data.json();
    }).then(function(data){
 
        let directory = document.getElementById('phonebook');
        directory.innerHTML = '';

        let array = Object.values(data);
         
        array.forEach(element => {
            let newLi = document.createElement('li');
            newLi.textContent = element.person+": "+element.phone;

            let newLiButton = document.createElement('button');
            newLiButton.textContent = "Delete";
            newLiButton.addEventListener('click', () => deleted(element._id));
            newLi.appendChild(newLiButton);
            directory.appendChild(newLi);

        });
    });

    

}


function create(){
    let person = document.getElementById('person').value;
    let phone = document.getElementById('phone').value;

 

        fetch('http://localhost:3030/jsonstore/phonebook',
        {
            method: 'POST',
            headers: {   'Content-Type':'application/json'
            },
            body: JSON.stringify({  person, phone })
        }
        )

      document.getElementById('person').value = '';
      document.getElementById('phone').value = '';
}

function deleted(deletedUrl){
         fetch('http://localhost:3030/jsonstore/phonebook/'+deletedUrl,{
            method: 'DELETE',
            headers:{
                'Content-Type':'application/json'
            }
         }) 
             
}

attachEvents();