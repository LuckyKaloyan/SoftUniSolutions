function solve(input){

let times = Number(input/10);

let output = String(input+"%");

if(input<100){
    output=output+" [";

    for(let i=0; i<times; i++){
     output=output+"%";
    }
    for(let i=0; i<10-times; i++){
        output=output+".";
    }
    output=output+"]";
}

if(input==100){
    console.log("100% Complete!")
    console.log("[%%%%%%%%%%]")
}
else{
    console.log(output);
    console.log("Still loading...");
}


}