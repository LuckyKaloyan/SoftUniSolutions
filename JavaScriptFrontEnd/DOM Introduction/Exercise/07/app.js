function solve() {
   document.querySelector('#btnSend').addEventListener('click', onClick);

   function onClick () {
 let rawData = document.getElementsByTagName("textarea")[0].value;
 let inputs = JSON.parse(rawData);
 let restaurants = [];

 for(let i=0; i<inputs.length; i++){
   let nameSplitter = inputs[i].split(" - ");
   let name = nameSplitter[0];
   let workers = nameSplitter[1].split(", ");
   let workersMap = new Map();
   let countWorkers = workers.length;
   let averageSalary = 0;
   let topSalary = 0;

   for(let j=0; j<workers.length; j++){
      let workerInfo = workers[j].split(" ");
      workersMap.set(workerInfo[0], parseFloat(workerInfo[1]));
      averageSalary = Number(averageSalary)+Number(workerInfo[1]);
   }

   averageSalary = (averageSalary/(countWorkers)).toFixed(2);
checkit = true;
 for(let k=0; k<restaurants.length; k++){
   if(restaurants[k].name===name){
         checkit = false;
        

      for(let p=0; p<workers.length; p++){
         let workersInfos = workers[p].split(" ");
         restaurants[k].workersMap.set(workersInfos[0], parseFloat(workersInfos[1]));
      }

      let totalSalary = 0;
       for(let p = 0; p < workers.length; p++) {
         let workersInfos = workers[p].split(" ");
         totalSalary += parseFloat(workersInfos[1]);
   }
      
      let countWorks = restaurants[k].workersMap.size;
      let averageSalaries = (totalSalary/countWorks).toFixed(2);
      
      restaurants[k].countWorkers = countWorks;
      restaurants[k].averageSalary = averageSalaries;
      

   
   }
 }
 if(checkit){
   let restaurant = {
      name:name,
      workersMap:workersMap,
      averageSalary:averageSalary,
      countWorkers:countWorkers
   }
   restaurants.push(restaurant);
 }
  
}


let theBestRestaurant;
let topSalaryAverage = 0;


for(let i=0; i<restaurants.length; i++){
if(restaurants[i].averageSalary>topSalaryAverage){
   theBestRestaurant=restaurants[i];
}

let topSalaryPerson = -Infinity; 
let workersPrint = "";


theBestRestaurant.workersMap.forEach((value, key) => {
  if (value > topSalaryPerson) {
    topSalaryPerson = value.toFixed(2);
  }
  
  workersPrint += `Name: ${key} With Salary: ${value} `;
});

document.querySelector('#bestRestaurant > p').textContent=("Name: " + theBestRestaurant.name + " Average Salary: " + theBestRestaurant.averageSalary + " Best Salary: " + topSalaryPerson);
document.querySelector("#workers > p").textContent=workersPrint;


  }
 }
}