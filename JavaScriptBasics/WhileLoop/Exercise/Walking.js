function Walking(input){

    let target = 10000;
    let index = -1;
    while(target>0){
        index++;
        let command = input[index];
       

        if(command==="Going home"){

            target = target-parseInt(input[index+1]);
            break;
        

        }else{
            target = target-parseInt(input[index]);
        }
    }
    if(target<=0){
        console.log("Goal reached! Good job!");
        console.log(Math.abs(target)+" steps over the goal!")
    }else{
        console.log(target+" more steps to reach goal.")
    }


}

