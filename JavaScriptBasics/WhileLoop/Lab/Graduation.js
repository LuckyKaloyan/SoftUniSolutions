function Graduation(input){

let index = 1;
let timesFailed = 0;
let total = 0;

let name = String(input[0]);


while(timesFailed<2){

if(Number(input[index])<4.00){
    timesFailed++;
    total = total+Number(input[index]);
}else{
    total = total+Number(input[index]);
}
index++;
if(index===13){break;}

}

if(timesFailed===2){
    console.log(name+` has been excluded at `+index+` grade`);
}else{
    console.log(name+` graduated. Average grade: `+(total/12).toFixed(2));
}



}