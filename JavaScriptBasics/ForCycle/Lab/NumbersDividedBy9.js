function NumbersDividedBy9(input){

let first = Number(input[0]);
let second = Number(input[1]);

let sum = 0;

for(let i=first; i<second; i++){
    if(i%9==0){
        sum=sum+i;
    }
}
console.log("The sum: "+sum);

for(let i=first; i<second; i++){
    if(i%9==0){
        console.log(i);
    }
}

}NumbersDividedBy9(["100", "200"])