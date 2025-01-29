function Cinema(input){

    let word = input[0];
    let rows = Number(input[1]);
    let collums = Number(input[2]);

    switch(word){
        case "Premiere" :
            console.log((rows*collums*12).toFixed(2)+" leva");break;
            case "Normal" :
            console.log((rows*collums*7.5).toFixed(2)+" leva");break;
            case "Discount" :
            console.log((rows*collums*5).toFixed(2)+" leva");break;
    }




}Cinema(["Normal", "21", "13"])