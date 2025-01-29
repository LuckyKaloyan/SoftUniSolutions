function solve(input, times) {
    let args = input;
    let rotations = times;

    for (let i = 0; i < rotations; i++) {
        let temporary = args[0];
        
        for (let k = 0; k < args.length - 1; k++) {
            args[k] = args[k + 1];
        }
        
        args[args.length - 1] = temporary;
    }

    let result = "";

    for(let i=0; i<args.length; i++){
        if(i!=args.length-1){
            result=result+args[i]+" ";
        }else{
            result=result+args[i];
        }
    }
    console.log(result);
}solve([51, 47, 32, 61, 21], 2)