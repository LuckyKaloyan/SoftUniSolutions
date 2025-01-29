function Cake(input){

let length = Number(input[0]);
let width = Number(input[1]);

let size = length*width;
let index = 2;
let command = input[index]
while(command!=="STOP" && index<input.length){
   
    size=size-Number(command);
    index++;
    command = input[index];
  
}
if(size>=0){
    console.log(size+" pieces are left.")
}else{
    console.log("No more cake left! You need "+Math.abs(size)+" pieces more.")
}
}