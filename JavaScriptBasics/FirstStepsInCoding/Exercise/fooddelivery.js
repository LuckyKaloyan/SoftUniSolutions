function food(input){

    let chicken = parseFloat(input[0])*10.35;
    let fish = parseFloat(input[1])*12.40;
    let vegans = parseFloat(input[2])*8.15;
    let total = (chicken+fish+vegans)*0.2+chicken+fish+vegans+2.50;
   console.log(total)

}