function TwoKPlusOne(input){

    let target = Number(input[0]);
    let done = false;
    let number = 1;
    
    while(!done){

        
        if(number<=target){
            console.log(number);
        }else{
            done = true;
            break;
        }
        number = (number*2) + 1;
    }


}TwoKPlusOne(["17"])