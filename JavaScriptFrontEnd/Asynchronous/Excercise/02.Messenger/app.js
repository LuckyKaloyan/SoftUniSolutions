function attachEvents() {

    document.getElementById('submit').addEventListener('click', submit);
    document.getElementById('refresh').addEventListener('click', refresh);



}

function submit(){
    let author = document.getElementById('controls').children[0].children[1].value;
    let content = document.getElementById('controls').children[1].children[1].value;

    fetch('http://localhost:3030/jsonstore/messenger',
    {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ author, content })
    }
    )
     
    document.getElementById('controls').children[0].children[1].value = '';
    document.getElementById('controls').children[1].children[1].value = '';
}

function refresh(){
fetch('http://localhost:3030/jsonstore/messenger').then(function(data){
    return data.json();
}).then(function(data){


    let array = Object.values(data);

  for(let i=0; i<array.length; i++){
          if(i>0){
            document.getElementById('messages').textContent = document.getElementById('messages').textContent + '\n' + array[i].author+': '+array[i].content;
          }else{
            document.getElementById('messages').textContent = array[i].author+': '+array[i].content;
          }
        
    };
})
}

attachEvents();