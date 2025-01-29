function SumDigits(input){

let sum = 0;
let number = input[0];

for(let i=0; i<number.length; i++){

    let digit = Number(number[i]);
    sum = sum+digit;
  
}
console.log("The sum of the digits is:"+sum);

}