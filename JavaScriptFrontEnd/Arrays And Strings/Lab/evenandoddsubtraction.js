function solve(input) {
    let total = 0;

    let args = input;
    for(let i=1; i<=args.length; i++){

        if(args[i-1]%2!=0){
            total=total-args[i-1];
        }else{
            total=total+args[i-1];
        }
    }
    console.log(total);
}