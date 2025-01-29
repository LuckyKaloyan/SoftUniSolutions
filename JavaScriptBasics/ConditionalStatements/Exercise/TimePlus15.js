function TimePlus15(input){

    let hours = Number(input[0]);
    let minutes = Number(input[1]);

    if(minutes>=45){
        hours++;
        minutes = minutes-45;
        if(hours==24){
            hours=0; }
    }else{  minutes = minutes+15; }
    if(minutes<10){
        console.log(hours+":0"+minutes)
    }else {console.log(hours+":"+minutes)};
    
}TimePlus15()