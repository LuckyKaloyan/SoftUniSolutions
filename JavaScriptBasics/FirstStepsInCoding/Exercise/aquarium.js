function aquarium(input){

    let capacity = parseFloat(input[0])*parseFloat(input[1])*parseFloat(input[2])*0.001;
    let result = capacity*(1-(parseFloat(input[3])/100));

    console.log(result);
}