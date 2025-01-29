function printandsum(numberA,numberB){

let a = Number(numberA);
let b = Number(numberB);
let total = 0;
let numbersLine = String('');

for(let c=a; c<=b; c++){
    total=total+c;
    numbersLine=numbersLine+c+' ';
}
console.log(numbersLine);
console.log('Sum: '+total);

}