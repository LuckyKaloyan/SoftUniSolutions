function OddOrEven(input){

    let start = Number(input[0]);
    let finish = Number(input[1]);
    let result = '';

    for(let s = start; s<=finish; s++){
        let odd = 0;
        let even = 0;
        for(let l = 0; l<String(s).length; l++){
            if((l + 1) % 2 === 0){
                even=even+Number(String(s).charAt(l));
            }else{
                odd=odd+Number(String(s).charAt(l));
            }

        }
        if(odd===even){
            result=result+s+' ';
        }

    }
    console.log(result)
   

}
