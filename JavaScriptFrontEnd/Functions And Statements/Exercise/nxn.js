function solve(input){

for(let i=0; i<input; i++){
let pop = String("");
    for(let k=0; k<input; k++){
        if(k==input+1){
            pop=pop+input;
        }else{
            pop=pop+input+" ";
        }
    }
    console.log(pop);
}



}