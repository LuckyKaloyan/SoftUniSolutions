function mathoperations(numberA, numberB, operatorSymbol){

    let a = Number(numberA);
    let b = Number(numberB);
    let c = String(operatorSymbol);


    switch(c){
        case '+' :
            console.log(a+b);
            break;
        case '-':
            console.log(a-b);
            break;
        case '*':
            console.log(a*b);
            break;
        case '/':
            console.log(a/b);
            break;
        case '%':
            console.log(a%b);
            break;
        case '**':
            console.log(a**b);
            break;
    }
}