function LunchBreak(input){

let name = input[0];
let episodelength = Number(input[1]);
let breaklength = Number(input[2]);

breaklength = breaklength-(0.375*breaklength);

if(breaklength>episodelength){
    console.log("You don't have enough time to watch "+name +" , you need "+Math.ceil(episodelength-breaklength)+" more minutes.")
}else{
    console.log("You have enough time to watch "+name +" and left with "+Math.ceil(episodelength-breaklength)+" free time.")  
}
}