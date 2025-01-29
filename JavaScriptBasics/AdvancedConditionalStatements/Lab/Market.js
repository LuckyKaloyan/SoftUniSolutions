function Market(input){

    let product = input[0];
    let day = input[1];
    let quantity = Number(input[2]);
    let isWorking = true;
    if(day=="Sunday" || day=="Saturday"){
        isWorking=false;
    }

   if(day=="Monday" || day=="Tuesday" || day=="Wendnesday" || day=="Thursday" || day=="Friday" || day=="Sunday" || day=="Saturday")
   {
    switch(product){
        case "banana":
            if(isWorking){console.log((quantity*2.50).toFixed(2));}
            else{
                console.log((quantity*2.70).toFixed(2));
            }break;
        case "apple":
            if(isWorking){console.log((quantity*1.20).toFixed(2));}
            else{
                console.log((quantity*1.25).toFixed(2));
            }break;
         case "orange":
                if(isWorking){console.log((quantity*0.85).toFixed(2));}
                else{
                    console.log((quantity*0.90).toFixed(2));
                }break;
        case "grapefruit":
                    if(isWorking){console.log((quantity*1.45).toFixed(2));}
                    else{
                        console.log((quantity*1.60).toFixed(2));
                    }break;
         case "kiwi":
                        if(isWorking){console.log((quantity*2.70).toFixed(2));}
                        else{
                            console.log((quantity*3.00).toFixed(2));
                        }break;
         case "pineapple":
                            if(isWorking){console.log((quantity*5.50).toFixed(2));}
                            else{
                                console.log((quantity*5.60).toFixed(2));
                            }break;
         case "grapes":
                                if(isWorking){console.log((quantity*3.85).toFixed(2));}
                                else{
                                    console.log((quantity*4.20).toFixed(2));
                                }break;

                                default : console.log("error");

    }
   }else{
    console.log("error");
   }
}