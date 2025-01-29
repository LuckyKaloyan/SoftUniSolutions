function solve(input){

let number = String(input);
let total = Number(number[0]);
let check = true;
for(let i=1; i<number.length; i++){

if(number[i]!==number[i-1]){
     check=false;
}

total=total+Number(number[i]);

}

console.log(check);
console.log(total);


}