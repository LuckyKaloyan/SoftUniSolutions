function attachGradientEvents() {
   let resultElement = document.getElementById('result');
   let gradientElement = document.getElementById('gradient');

   gradientElement.addEventListener('mousemove',function(e){
     resultElement.textContent = String(Math.floor(Number(e.offsetX/e.currentTarget.clientWidth)*100)+"%");
   }
   
   
   
   )
}