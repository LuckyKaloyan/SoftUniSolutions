function frommton(numberA,numberB){

let a = Number(numberA);
let b = Number(numberB);

if(a>b){
    for(let i=a; i>=b; i--){
        console.log(i);
    }
}else{
    for(let i=a; i<=b; i++){
        console.log(i);
    }
}

}