function solve(input){

let password = String(input);

let check = Boolean;
check = true;
let digits = 0;
let valid = Boolean;
valid = true;


if(input.length>=6 && input.length<=10){
}else{
    console.log("Password must be between 6 and 10 characters");
    valid=false;
}

for(let i=0; i<password.length; i++){
    if(password.charCodeAt(i)<48){
       check=false;
    };
    if(password.charCodeAt(i)>57 && password.charCodeAt(i)<65){
        check=false;
    }
    if(password.charCodeAt(i)>90 && password.charCodeAt(i)<97){
        check=false;
    }
    if(password.charCodeAt(i)>122){
        check=false;
    }

    if(!isNaN(Number(password.charAt(i)))){
       digits++;};

}

if(!check){
    console.log("Password must consist only of letters and digits");
    valid=false;
}
if(digits<2){
    console.log("Password must have at least 2 digits");
    valid=false;
}

if(valid){
    console.log("Password is valid")
}
}