function literature(input){

    let pages = parseFloat(input[0]);
    let pagesPerHour = parseFloat(input[1]);
    let days = parseFloat(input[2]);
    let result =  pages/pagesPerHour/days;
    console.log(result);
    
}