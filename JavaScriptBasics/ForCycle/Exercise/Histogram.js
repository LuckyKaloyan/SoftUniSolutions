function Histogram(input){

    let below200 = 0;
    let between200and399 = 0;
    let between400and599 = 0;
    let between600and799 = 0;
    let morethan800 = 0;

    let times = Number(input[0]);

    for(let i=1; i<=times; i++){

        let number = Number(input[i]);
        if(number<200){
            below200++;
        }else if(number>=200 && number<=399){
            between200and399++;
        }else if(number>=400 && number<=599){
            between400and599++;
        }else if(number>=600 && number<=799){
            between600and799++;
        }else{
            morethan800++;
        }

    }

    console.log(((below200/times)*100).toFixed(2)+"%");
    console.log(((between200and399/times)*100).toFixed(2)+"%");
    console.log(((between400and599/times)*100).toFixed(2)+"%");
    console.log(((between600and799/times)*100).toFixed(2)+"%");
    console.log(((morethan800/times)*100).toFixed(2)+"%");

}