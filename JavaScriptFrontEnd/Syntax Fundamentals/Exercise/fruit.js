function fruit(name,amount,price){


    let fruitname = String(name);
    let kilograms = Number(amount);
    let priceperkilogram = Number(price);



    console.log("I need $"+((kilograms*priceperkilogram)/1000).toFixed(2)+" to buy "+(kilograms/1000).toFixed(2)+" kilograms "+fruitname+".");

}