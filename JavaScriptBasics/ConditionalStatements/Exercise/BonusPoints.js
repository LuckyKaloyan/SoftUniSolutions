function BonusPoints(input){
let number = Number(input[0]);
let points = 0;

    if(number<=100){
        points+=5;
    }else if(number>100 && number<=1000){
        points = number*0.2;
    }else if(number>1000){
        points = number*0.1;
    }

    if(number%5==0 && number%10!=0){
        points+=2;
    }
    if(number%2==0){
        points++;
    }
    console.log(points+"\n"+number);


}