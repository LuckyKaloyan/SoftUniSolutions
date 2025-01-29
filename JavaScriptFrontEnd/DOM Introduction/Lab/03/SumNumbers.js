function calc() {
    

   let firstvalue=  document.getElementById('num1').value;
   let secondvalue= document.getElementById('num2').value;
   let total = Number(firstvalue)+Number(secondvalue);
   document.getElementById('sum').value = total;

}
