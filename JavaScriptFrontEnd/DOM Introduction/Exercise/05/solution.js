function solve() {
   document.querySelector('#searchBtn').addEventListener('click', onClick);

   function onClick() {

      let args = document.querySelectorAll("tbody tr");
 
      for(let i=0; i<args.length; i++){

         args[i].classList.remove("select");
         
         if(args[i].textContent.includes(document.getElementById("searchField").value)){
            args[i].classList.add("select");
         }
      }

      
   }
}