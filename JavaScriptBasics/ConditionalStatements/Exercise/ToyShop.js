function ToyShop(input){

    let tripPrice = parseFloat(input[0]);
    let puzzles = parseFloat(input[1])*2.60;
    let talkingdolls =  parseFloat(input[2])*3;
    let teddies =  parseFloat(input[3])*4.10;
    let minions =  parseFloat(input[4])*8.20;
    let trucks =  parseFloat(input[5])*2;
    let number = parseFloat(input[1])+parseFloat(input[2])+parseFloat(input[3])+parseFloat(input[4])+parseFloat(input[5]);
    let total = puzzles+talkingdolls+teddies+minions+trucks;
    if(number>49){
        total = total*0.75;}
    total = total*0.90;
    if(total>tripPrice){
        console.log("Yes "+(total-tripPrice).toFixed(2)+" lv left.")
    }else{
        console.log("Not enough money! "+(tripPrice-total).toFixed(2)+" lv needed.")
    }
}