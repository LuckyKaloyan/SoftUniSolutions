function search() {
 
   let args = document.getElementById("towns").getElementsByTagName("li");

   for(let i=0; i<args.length; i++){
     
      args[i].style.textDecoration = "none";
 
}

let count = 0;

   for(let i=0; i<args.length; i++){
      if(args[i].textContent.includes(document.getElementById("searchText").value)){
         args[i].style.textDecoration = "underline";
         args[i].style.fontWeight = "bold";

         count++;
      };
   }

   document.getElementById("result").textContent = count + " matches found";



}