function ExamPreparation(input){

let fails = Number(input[0]);
let tired = false;
let badScores = 0;
let scoreIndex = 2;
let nameIndex = 1;
let name = null;
let tasksNumber = 0;
let totalScore = 0;


while(!tired && name!=="Enough"){
    if(input[nameIndex]==="Enough"){
        break;
    }
tasksNumber++;
totalScore = totalScore+Number(input[scoreIndex]);
if(input[scoreIndex]<=4){
    badScores++;
    if(badScores===fails){
        tired=true;
        break;
    }
}
if(!tired && input[nameIndex]!=="Enough"){
name = input[nameIndex];
nameIndex=nameIndex+2;
scoreIndex=scoreIndex+2;
}
}
if(tired){
    console.log("You need a break, "+fails+" poor grades.");
}else{
    console.log("Average score: "+(totalScore/tasksNumber).toFixed(2));
    console.log("Number of problems: "+tasksNumber);
    console.log("Last problem: "+name);
}
}