function deposit(input){

let depositedsum = parseFloat(input[0]);
let time = parseFloat(input[1]);
let percent = parseFloat(input[2]);
let sum = (depositedsum+time*(depositedsum*percent/100)/12);
console.log(sum);
}deposit(["200 ","3 ","5.7 "])