function SumSeconds(input){

let first = Number(input[0]);
let second = Number(input[1]);
let third = Number(input[2]);

let total = first+second+third;

if(total>60){
    if(total%60>10){
    console.log((total/60).toFixed(0)+":"+total%60);
    }else{
        console.log((total/60).toFixed(0)+":0"+total%60);
    }
    
}else {
    if(total%60>10){console.log("00:"+total%60)}
    else{console.log("00:0"+total%60)}
}


}