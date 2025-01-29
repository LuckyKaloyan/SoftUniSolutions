function SpecialNumbers(input){

    let value = Number(input[0]);
    let result = ''

    for(let start = 1111; start<=9999; start++){
        let first = String(start).charAt(0);
        let second = String(start).charAt(1);
        let third = String(start).charAt(2);
        let fourth = String(start).charAt(3);



        if(first%start===0 && second%start===0 && third%start===0 && fourth%start===0){
            result=result+' '
        }
    }
    console.log(result)
}