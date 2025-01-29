function Balance(input){

let amount = 0;   
let index = 0;


while(input[index]!==`NoMoreMoney`){

    if(input[index]>0){
    amount = amount+Number(input[index]);
    console.log(`Increase: `+input[index]);

}else{
    console.log(`Invalid Operation!`);
    break;
}
index++;
}

console.log(`Total: `+amount);

}