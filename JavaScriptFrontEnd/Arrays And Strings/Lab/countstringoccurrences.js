function solve(input,key){


    let sentance = String(input);
    let word = String(key);
    let count = 0;
    let splitted = sentance.split(' ');

    for(let i=0; i<splitted.length; i++){
        if(splitted[i]===word){
            count++;
        }
    }
    console.log(count);



}