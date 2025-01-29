function solve(input){

    let total = 0;
for(let i=0; i<input; i++){
    if(input%i==0){
        total=total+i;
    }
}
if(total==input){
    console.log("We have a perfect number!");
}else{
    console.log("It's not so perfect.")
}



}