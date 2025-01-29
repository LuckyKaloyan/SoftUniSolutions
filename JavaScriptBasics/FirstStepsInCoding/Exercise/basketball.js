function basketball(input){

    let yeartax = parseFloat(input);
    let shoes = yeartax*0.6;
    let shirt = 0.8*shoes;
    let ball = shirt*0.25;
    let accessories = ball*0.2;
    console.log(yeartax+shoes+shirt+ball+accessories);
    
}