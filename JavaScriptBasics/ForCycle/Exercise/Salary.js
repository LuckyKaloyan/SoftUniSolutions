function Salary(input){

    let times = Number(input[0]);
    let salary = Number(input[1]);
    for(let i=2; i<times; i++){

        let command = input[i];
        if(command=="Facebook"){
            salary=salary-150;
        }else if(command=="Instagram"){
            salary=salary-100;
        }else if(command=="Reddit"){
            salary=salary-50;
        }
        if(salary<=0){
            console.log("You have lost your salary.");
            break;
        }
    }
    if(salary>0){
        console.log(salary);
    }
}