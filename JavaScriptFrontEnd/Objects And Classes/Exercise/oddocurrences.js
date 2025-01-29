function solve(input){

let args = input.split(" ");
let result = "";
let array = [];

for(let i=0; i<args.length; i++){
    let value = args[i];
    let count = 0;
    for(let j=0; j<args.length; j++){
        if(args[j].toLowerCase()===args[i].toLowerCase()){
           count++;
        }
    }
   
    if(count%2===1 && !array.includes(value.toLowerCase())){
          array.push(value.toLowerCase());
    }
    
}
for(let i=0; i<array.length; i++){
    if(i<array.length-1){
        result=result+array[i]+" ";
    }else{
        result=result+array[i];
    }
}
console.log(result);


}