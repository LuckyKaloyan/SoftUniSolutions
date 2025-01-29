function attachEvents() {
    document.getElementById("btnLoadPosts").addEventListener('click',loadPosts);
    document.getElementById("btnViewPost").addEventListener('click', viewPost);
    document.getElementById("posts").addEventListener('change', selectOption);
}

function loadPosts(){
    fetch('http://localhost:3030/jsonstore/blog/posts').then(function(data){
        return data.json();
    }).then(function(data){
        console.log(data);
        Object.values(data).forEach(element => {
        let newOption =  document.createElement('option');
        newOption.textContent = element.title;
        newOption.setAttribute('id',element.id);
        document.getElementById('posts').appendChild(newOption);
        document.getElementById('post-comments').innerHTML = '';
        document.getElementById('post-body').setAttribute('style', 'display:none');
  
        
        });
    })
}

function viewPost(){
    fetch('http://localhost:3030/jsonstore/blog/comments').then(function(data){
        return data.json();
    }).then(function(data){
        document.getElementById('post-body').setAttribute('style', 'display:block');

        document.getElementById('post-comments').innerHTML = '';

        Object.values(data).forEach(element => {
            let selectedOptionId = document.querySelector('#posts option:checked').id;
            if(element.postId==selectedOptionId){
             let newLi =    document.createElement('li');
             newLi.textContent = element.text;
             newLi.setAttribute('id', element.id);
             document.getElementById('post-comments').appendChild(newLi);
            }
        })


    })
    fetch('http://localhost:3030/jsonstore/blog/posts').then(function(data){
        return data.json();
    }).then(function(data){
        Object.values(data).forEach(element =>{
            if(element.id==document.querySelector('#posts option:checked').id){
                document.getElementById('post-body').textContent = element.body;

            }
        })
    })

}

function selectOption(){


}


attachEvents();