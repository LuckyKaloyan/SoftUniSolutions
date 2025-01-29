function Shopping(input){
    let budget = Number(input[0])
    let videocards = Number(input[1]);
    let processors = Number(input[2]);
    let ram = Number(input[3]);

    let total = (videocards*250)+(processors*0.35*videocards*250)+(ram*0.1*250*videocards);

    if(processors>videocards){
       if(budget>total){
        console.log("You have "+(budget-total).toFixed(2)+ " leva left!");
       }else{
        console.log("Not enough money! You need "+(total-budget).toFixed(2)+ " leva more!");
       }
    }else{
        if(budget>total){
            console.log("You have "+((budget-total*0.85)).toFixed(2)+ " leva left!");
           }else{
            console.log("Not enough money! You need "+((total-budget)*0.85).toFixed(2)+ " leva more!");
           }
    }
}