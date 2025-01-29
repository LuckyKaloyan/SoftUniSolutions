function SumOfNumbers(input){

    let target = Number(input[0]);
    let currentSum = 0;
    let done = false;
    let index = 1;
    
    while(!done){
        currentSum = currentSum+(Number(input[index]));
        if(currentSum>=target){
            done = true;
            console.log(currentSum);
        }
        index++;
    }

}