function solve(inputFirst,inputSecond){

    let first = inputFirst;
    let second = inputSecond;


for(let i=inputFirst-1; i>0; i--){
    first=first*i;
}
for(let i=inputSecond-1; i>0; i--){
    second=second*i
}

console.log((first/second).toFixed(2));
}