function repaint(input){

    let nailon = (parseFloat(input[0])+2)*1.50;
    let paint = (parseFloat(input[1])*1.1)*14.50;
    let thinner = parseFloat(input[2])*5;
    let workSalaries = parseFloat(input[3])*0.3*(nailon+paint+thinner+0.40);
    let result = nailon+paint+thinner+workSalaries+0.40;
    console.log(result);
}