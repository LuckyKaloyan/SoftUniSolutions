function extract(content) {

    let words = document.getElementById("content").textContent;

    let args = [];

    let startingIndex = null;
    let finishingIndex = null;

    for(let i=0; i<words.length; i++){
        if(words[i]=="("){
            startingIndex=i+1;
        }
        if(words[i]==")" && startingIndex!=null){
            finishingIndex=i;
        }
        if(finishingIndex!=null && startingIndex!=null){
          args.push(words.substring(startingIndex,finishingIndex));
          startingIndex = null;
          finishingIndex = null;
        }
    }
    
    let result = "";

    for(let i=0; i<args.length; i++){
        if(args<args.length-1){
            result=result+args[i]+"; ";
        }else{
            result=result+args[i];
        }
    }

    return result;
}