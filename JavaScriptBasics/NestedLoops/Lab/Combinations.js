function Combinations(input){


    let value = Number(input[0]);
    let combinations = 0;

    for(let i =0; i<26; i++){
        for(let j=0; j<26; j++){
            for(let k=0; k<26; k++){
                 if(i+k+j==value){
                    combinations++;
                 }
            }
        }
    }
    console.log(combinations);
}