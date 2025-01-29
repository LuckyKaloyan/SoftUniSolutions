function SmallestNumber(input){
    
        let SmallestNumber = Number(input[0]);
        let index = 1;
        
        while(input[index]!=="Stop"){
        
            if(input[index]<SmallestNumber){
                SmallestNumber=input[index];
            }
            index++;
        }
        console.log(SmallestNumber);
        
        }