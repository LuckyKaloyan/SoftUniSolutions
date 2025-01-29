function OldBooks(input){

    let book = input[0];

    let index = 1;

    let check = input[index];

    let found = false;

    while(book!==check || check=="No More Books"){
index++;
check=input[index];
if(check==="No More Books"){break;}
if(book===check){
    found=true;
}
    }
if(found){
    console.log("You checked "+(index-1)+" books and found it.");
}else{
    console.log("The book you search is not here!");
    console.log("You checked "+(index-1)+" books.");
}
}