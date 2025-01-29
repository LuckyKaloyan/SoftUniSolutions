function ExamTime(input){

let hourarrive = Number(input[2]);
let minutearrive = Number(input[3]);
let examhour = Number(input[0]);
let examminute = Number(input[1]);
let output = "";
let totalexam = (examhour*60)+examminute;
let totalarrive = (hourarrive*60)+minutearrive;

if((totalarrive-totalexam)>0){
    console.log("Late");
}else if(totalexam-totalarrive<=30)
{console.log("On time");
}else{
    console.log("Early");
}
if(Math.abs(totalarrive-totalexam)<60){
    output = output + (Math.abs(totalarrive-totalexam)+" minutes");
}else{
    output = output + (Math.floor(Math.abs(totalarrive-totalexam)/60)+":"+Math.abs(totalarrive-totalexam)%60+" hours")
}

if(totalarrive>totalexam){
    output = output + (" after the start");
}else{
    output = output + (" before the start");
}
console.log(output);
}