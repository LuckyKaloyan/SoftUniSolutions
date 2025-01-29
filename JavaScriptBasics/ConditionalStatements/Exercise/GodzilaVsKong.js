function GodzilaVsKong(input){

let budget = parseFloat(input[0]);
let statists = parseFloat(input[1]);
let priceClothes = parseFloat(input[2]);
let decor = budget*0.10;
if(statists>149){
    statists=statists*0.9;
}
priceClothes = priceClothes*statists;
if(priceClothes+decor>budget){
    console.log("Not enough money!\nWingard needs "+((priceClothes+decor)-budget).toFixed(2)+" leva more.");
}else{
    console.log("Action!\nWingard starts filimg with "+(budget-(priceClothes+decor)).toFixed(2)+" leva left.");
}
}