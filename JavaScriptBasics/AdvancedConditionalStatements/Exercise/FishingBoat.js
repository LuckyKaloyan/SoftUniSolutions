function FishingBoat(input){

    let budget = Number(input[0]);
    let season = input[1];
    let count = Number(input[2]);
    let tax;
    switch(season){
         case "Spring" :
            tax = 3000;break;
            case "Summer" :
                case "Autumn" :
                    tax = 4200;break;
                    case "Winter" :
                        tax = 2600;break;
    }
    if(count<7){
        tax=tax*0.90;
    }else if(count<12 && count>6){
          tax=tax*0.85;
    }else{
        tax=tax*0.75;
    }

    if(count%2==0 && season!="Autumn"){
        tax=tax*0.95;
    }

    if(tax<budget){
        console.log("Yes! You have "+(budget-tax).toFixed(2) +" leva left.");
    }else{
        console.log("Not enough money! You need " + (tax-budget).toFixed(2)+" leva.");
    }

}