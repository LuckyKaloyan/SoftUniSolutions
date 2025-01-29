function Oscars(input){

let name = input[0];
let academypoints = Number(input[1]);
let juryNumber = Number(input[2]);

for(let i = 3; i<(juryNumber*2)+3; i=i+2){
    let juryMemberName = input[i];
    let juryMemberPoints = Number(input[i+1]);
    academypoints=academypoints+((juryMemberPoints*juryMemberName.length)/2);
    if(academypoints>=1250.5){
        console.log(
            "Congratulations, "+name+" got a nominee for leading role with "+ academypoints+"!"
        );break;
    }
}
if(academypoints<1250.5){
    console.log("Sorry, "+name+" you need "+(1250.5-academypoints)+" more!");
}


}