function solve(inputNumber){


    let input = String(inputNumber);

    let odd = 0;
    let even = 0;


    for(let i=0; i<input.length; i++){

        let number = Number(input.charAt(i));

         if(number%2==1){
            odd=odd+number;
         }else{
            even=even+number;
         }
    }

    console.log("Odd sum = "+odd+", Even sum = "+even);



}