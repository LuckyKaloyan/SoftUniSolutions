function solve(input) {
    let sentence = String(input);
    let args = [];
    let start = 0;

    for (let i = 1; i < sentence.length; i++) {
        if (sentence[i].toUpperCase() === sentence[i] && 
            sentence[i - 1].toLowerCase() === sentence[i - 1]) {  
            args.push(sentence.substring(start, i));
            start = i;  
        }
    }

    args.push(sentence.substring(start));

    let output = '';
   for(let i=0; i<args.length; i++){
    if(i!=args.length-1){
       output=output+args[i]+", ";
    }else{
        output=output+args[i];
    }
    
   }
   console.log(output);
}


