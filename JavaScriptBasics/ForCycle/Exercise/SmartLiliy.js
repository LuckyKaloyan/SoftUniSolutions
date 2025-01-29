function SmartLily(input){
    
let age = Number(input[0]);
let laundryPrice = Number(input[1]);
let toysprice = Number(input[2]);

let totalsum = 0;

for(let i=1; i<=age; i++){
if(i%2==0){
    totalsum=totalsum+(i*5)-1;
}else{
    totalsum=totalsum+toysprice;
}}

if(laundryPrice<=totalsum){
    console.log("Yes! "+(totalsum-laundryPrice).toFixed(2));
}else{
    console.log("No! "+(laundryPrice-totalsum).toFixed(2));
}


}