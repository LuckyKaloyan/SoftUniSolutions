function FiguresArea(input){

let name = input[0];
if(name=="square"){
    console.log((input[1*input[1]]).toFixed(3));
}else if(name=="triangle"){
    console.log((input[1]*input[2]/2).toFixed(3))
}else if(name=="circle"){
    console.log((input[1]*Math.PI*input[1]).toFixed(3));
}else if(name=="rectangle"){
    console.log((input[1]*input[2]).toFixed(3));
}

}