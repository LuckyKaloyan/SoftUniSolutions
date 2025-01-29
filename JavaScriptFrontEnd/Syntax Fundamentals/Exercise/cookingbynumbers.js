function solve(){

   
    let args= Array.from(arguments);
    let initial = Number(args[0]);
    
    for(let i=1; i<6; i++){
        switch(args[i]){
            case 'chop' :
                initial = initial/2;
                console.log(initial);
                break;
            case 'dice' :
                initial = Math.sqrt(initial);
                console.log(initial);
                break;
            case 'spice':
                initial = initial+1;
                console.log(initial);
                break;
            case 'bake':
                initial=initial*3;
                console.log(initial);
                break;
            case 'fillet':
                initial=initial*0.8;
                console.log(Math.round(initial * 10) / 10);
                break;
        }
    }

}