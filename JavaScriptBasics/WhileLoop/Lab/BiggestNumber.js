function BiggestNumber(input){

let BiggestNumber = Number(input[0]);
let index = 1;

while(input[index]!=="Stop"){

    if(input[index]>BiggestNumber){
        BiggestNumber=input[index];
    }
    index++;
}
console.log(BiggestNumber);

}	