function password(input){

    let name = String(input[0]);
    let password = String(input[1]);
    let isdone = false;
    let index = 2;
    while(!isdone){
      
        let passwordTry = String(input[index]);
        if(password===passwordTry){
            isdone = true;
            console.log(`Welcome ${name}!`);
        }
        index++;
    }

}
