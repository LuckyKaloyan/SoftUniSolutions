function NewHome(input){

let flower = input[0];
let count = Number(input[1]);
let budget = Number(input[2]);
let total;

switch(flower){
    case "Roses" :
       total = count*5;
       if(count>80){ total=total*0.9;}break;
    case "Dahlias" :
        total = count*3.80;
        if(count>90){
            total=total*0.85;}break;
    case "Tulips" : 
              total = count*2.80;
        if(count>80){
            total=total*0.85;
        }break;
    case "Narcissus" :
        total = count*3;
        if(count<120){
            total=total*1.15;
        }break;
    case "Gladiolus" :
        total = count*2.50;
        if(count<80){
            total=total*1.20;
        }break;
}

if(budget>total){
    console.log("Hey, you have a great garden with " + count+" "+ flower+" and "+(budget-total).toFixed(2) +" leva left.");
}else{
    console.log("Not enough money, you need " +(total-budget).toFixed(2) +" leva more.");
}

}