function solve(numberA,numberB,numberC){

if(numberA>numberB){
    if(numberB>numberC){
        console.log(numberC);
    }else{
        console.log(numberB);
    }
}else{
    if(numberC>numberA){
        console.log(numberA);
    }else {console.log(numberC);}
}


}