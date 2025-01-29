function vacation(countNumber, strType, strDay){

    let count = Number(countNumber);
    let type = String(strType);
    let day = String(strDay);

    let total = 0;

    switch(day){
        case 'Friday' :
            switch(type){
                case 'Students' :
                   total=8.45*count;
                   if(count>=30){
                    total=total*0.85;
                   }
                    break;
                case 'Business' :
                    total=10.90*count;
                    if(count>=100){
                        total=total-109;
                    }
                    break;
                case 'Regular' :
                    total=15*count;
                    if(count>=10 && count<=20){
                        total=total*0.95;
                    }
                    break;
            }break;
        
        case 'Saturday' :
            switch(type){
                case 'Students' :
                    total=9.80*count;
                    if(count>=30){
                        total=total*0.85;
                       }
                    break;
                case 'Business' :
                    total=15.60*count;
                    if(count>=100){
                        total=total-156;
                    }
                    break;
                case 'Regular' :
                    total=20*count;
                    if(count>=10 && count<=20){
                        total=total*0.95;
                    }
                    break;
            }break;

        case 'Sunday' :
            switch(type){
                case 'Students' :
                    total=10.46*count;
                    if(count>=30){
                        total=total*0.85;
                       }
                    break;
                case 'Business' :
                    total=16*count;
                    if(count>=100){
                        total=total-160;
                    }
                    break;
                case 'Regular' :
                    total=22.50*count;
                    if(count>=10 && count<=20){
                        total=total*0.95;
                    }
                    break;
            }break;
    }
    console.log('Total price: '+total.toFixed(2))
}