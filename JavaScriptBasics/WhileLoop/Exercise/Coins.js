function Coins(input){

    let coinValue = Math.round(input.shift() * 100);
    let counter = 0;

while(coinValue>0){
    counter++;
    if(coinValue>=200){
        coinValue=coinValue-200;
    }else if(coinValue>=100){
        coinValue=coinValue-100;
    }else if(coinValue>=50){
        coinValue=coinValue-50;
    }else if(coinValue>=20){
        coinValue=coinValue-20;
    }else if(coinValue>=10){
        coinValue=coinValue-10;
    }else if(coinValue>=5){
        coinValue=coinValue-5
    }else if(coinValue>=2){
        coinValue=coinValue-2;
    }else {coinValue=0}

  
}
console.log(counter);
}