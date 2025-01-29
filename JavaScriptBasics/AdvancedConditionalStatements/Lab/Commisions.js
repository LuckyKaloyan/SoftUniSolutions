function Commisions(input){

    let city = input[0];
    let sale = Number(input[1]);


    switch(city){
                     case "Sofia":
                        if(sale>=0 && sale<=500){
                            console.log((0.05*sale).toFixed(2));
                        }else if(sale>500 && sale<=1000){
                            console.log((0.07*sale).toFixed(2));
                        }else if(sale>1000 && sale<=10000){
                            console.log((0.08*sale).toFixed(2));
                        }else if(s>10000){
                            console.log((sale*0.12).toFixed(2));
                        }else{
                            console.log("error");
                        }
                        break;

                        case "Varna":
                            if(sale>=0 && sale<=500){
                                console.log((0.045*sale).toFixed(2));
                            }else if(sale>500 && sale<=1000){
                                console.log((0.075*sale).toFixed(2));
                            }else if(sale>1000 && sale<=10000){
                                console.log((0.10*sale).toFixed(2));
                            }else if(s>10000){
                                console.log((sale*0.13).toFixed(2));
                            }else{
                                console.log("error");
                            }
                            break;
                            case "Plovdiv":
                                if(sale>=0 && sale<=500){
                                    console.log((0.055*sale).toFixed(2));
                                }else if(sale>500 && sale<=1000){
                                    console.log((0.08*sale).toFixed(2));
                                }else if(sale>1000 && sale<=10000){
                                    console.log((0.12*sale).toFixed(2));
                                }else if(s>10000){
                                    console.log((sale*0.145).toFixed(2));
                                }else{
                                    console.log("error");
                                }
                                break;
                 default : console.log("error");

    }

}