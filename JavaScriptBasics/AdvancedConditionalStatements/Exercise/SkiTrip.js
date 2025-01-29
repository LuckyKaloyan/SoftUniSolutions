function SkiTrip(input){

let days = Number(input[0])-1;
let place = input[1];
let review = input[2];
let total;

switch(place){
    case "apartment" :
       if(days<10){
        total=days*25*0.7;
       }else if(days>=10 && days<=15){
        total = days*25*0.65;
       }else{
        total = days*25*0.5;
       };break;
    case "president apartment" :
        if(days<10){
            total=days*35*0.9;
           }else if(days>=10 && days<=15){
            total = days*35*0.85;
           }else{
            total = days*35*0.8;
           };break;
    default : total=days*18; break;
}
if(review=="positive"){
    console.log((total*1.25).toFixed(2));
}else{
    console.log((total*0.9).toFixed(2));
}

}SkiTrip(["2", "apartment", "positive"])