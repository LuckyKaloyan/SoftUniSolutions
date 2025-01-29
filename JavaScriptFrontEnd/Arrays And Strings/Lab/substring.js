function solve(stringInput, indexBegin, indexEnd){

    let word = String(stringInput);
    let start = Number(indexBegin);
    let end = start+Number(indexEnd);


       word = word.substring(start,end);
       console.log(word);

}