function WorldRecordSwimming(input){

    let record = parseFloat(input[0]);
    let length = parseInt(input[1]);
    let speed = parseFloat(input[2]);

   
    let newrecord = length*speed;
    let delay = parseInt(length/15);
     newrecord= newrecord+delay*12.5;



    if(newrecord<record){
        console.log(" Yes, he succeeded! The new world record is "+newrecord.toFixed(2) +" seconds.");
    }else{
        console.log(
            "No, he failed! He was "+ (newrecord-record).toFixed(2) + " seconds slower."
        )
    }
}