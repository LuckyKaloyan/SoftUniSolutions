function create(words) {
   

   let inputs = words;

   for(let i=0; i<inputs.length; i++){
     let div = document.createElement('div');
     let p = document.createElement('p');
     p.textContent = inputs[i];
     p.setAttribute('style', 'display: none;');
     div.appendChild(p);
     div.addEventListener('click',function(e){
      e.currentTarget.querySelector('p').setAttribute('style', 'display: block');
     });

     
    
     document.getElementById('content').appendChild(div);
   }

}