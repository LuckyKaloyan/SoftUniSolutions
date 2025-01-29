function largestnumber(numberA,numberB,numberC){

    let a = Number(numberA);
    let b = Number(numberB);
    let c = Number(numberC);

     a = Math.max(a,b);
     c = Math.max(a,c);
     console.log('The largest number is '+c+'.');



}