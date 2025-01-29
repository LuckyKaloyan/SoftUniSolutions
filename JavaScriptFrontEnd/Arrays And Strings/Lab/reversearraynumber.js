function solve(numbers, input) {
    let times = Number(numbers);
    let args = input; 

    let output = String('');
    for (let i = times-1; i >= 0; i--) {  
        if(times!==0){
            output=output+args[i]+' ';
        }else{
            output=output+args[i];
        }
    }
    console.log(output);
}

