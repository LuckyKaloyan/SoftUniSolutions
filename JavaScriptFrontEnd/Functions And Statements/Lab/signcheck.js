function solve(numberOne,numberTwo,numberThree){

    let counter = 0;
    if(numberOne>0){counter++;}
    if(numberTwo>0){counter++;}
    if(numberThree>0){counter++;}

    if(counter%2==0){console.log("Negative");
    }
    else{console.log("Positive");
    }

}