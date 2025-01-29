function solve(word,sentance){



    let key = String(word);
    let stringline = String(sentance);

    stringline=stringline.toLowerCase();
    key=key.toLowerCase();

    if(stringline.includes(key)){
        console.log(word);
    }else{
        console.log(word+" not found!")
    }


}