function schoolMaterials(input){

    let pens = parseFloat(input[0])*5.80;
    let markers = parseFloat(input[1])*7.20;
    let detergen = parseFloat(input[2])*1.20;
    let discount = parseFloat(input[3])/100;

    let result = (pens+markers+detergen)-((pens+markers+detergen)*discount);
   console.log(result);

}