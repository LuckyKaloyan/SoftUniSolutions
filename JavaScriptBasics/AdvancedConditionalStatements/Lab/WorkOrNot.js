function WorkOrNot(input){


let day = input[0];

switch(day){
    case "Sunday" : console.log("Weekend");break;
    case "Saturday" :console.log("Weekend");break;
    case "Monday" : console.log("Working day");break;
    case "Tuesday" : console.log("Working day");break;
    case "Wednesday" : console.log("Working day");break;
    case "Thursday" : console.log("Working day");break;
    case "Friday" : console.log("Working day");break;
    default: console.log("Error"); break;
}

}