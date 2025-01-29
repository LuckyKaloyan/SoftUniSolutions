function OperationsNumbers(input){


let a  = Number(input[0]);
let b = Number(input[1]);
let symbol = input[2];
let result;


switch(symbol){

case "+" : if((a+b)%2==0){
    console.log(a+" + "+b+" = "+(a+b)+" - even");
}else{console.log(a+" + "+b+" = "+(a+b)+" - odd");}
break;
case "-" : if((a-b)%2==0){
    console.log(a+" - "+b+" = "+(a-b)+" - even");
}else{console.log(a+" - "+b+" = "+(a-b)+" - odd");}
break;
case "*" : if((a*b)%2==0){
    console.log(a+" * "+b+" = "+(a*b)+" - even");
}else{console.log(a+" * "+b+" = "+(a*b)+" - odd");}
break;

case "/" :
    if(b==0){
        console.log("Cannot divide "+ a +" by zero")
    }else{
        console.log(a+" / "+b+" = " +(a/b).toFixed(2));
    }
    break;
case "%" :
    if(b==0){
        console.log("Cannot divide "+ a +" by zero")
    }else{
        console.log(a+" % "+b+" = " +a%b);
    }
    break;
}
}