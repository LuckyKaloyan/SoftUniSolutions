function solve() {

    let index = "depot";

    let currentStopName;

    function depart() {
    fetch('http://localhost:3030/jsonstore/bus/schedule/'+index).then(function(data){
        return data.json()
    }).then(function(result){
        currentStopName = result.name;
        document.getElementsByClassName('info')[0].textContent = "Next stop " + currentStopName;
        document.getElementById('depart').setAttribute("disabled", "true");
        document.getElementById('arrive').removeAttribute("disabled");
        let nextStopId = result.next;
    }).catch(document.getElementsByClassName('info')[0].textContent = "Error");
    }

   function arrive() {
    document.getElementById('arrive').setAttribute("disabled", "true");
    document.getElementById('depart').removeAttribute("disabled");
    document.getElementsByClassName('info')[0].textContent = "Arriving at " + currentStopName;
    

    fetch('http://localhost:3030/jsonstore/bus/schedule/').then(function(data){
        return data.json().then(
            function (data){

                 let array = data;

                 const dataArray = Object.entries(data);
                 let truty = false;
                 dataArray.forEach(element => { 
                    
                        if(element[0]==index){
                             index = element[1].next;
                            truty = true;
                        }})
                 if(!truty){
                    document.getElementById('arrive').removeAttribute("disabled");
                    document.getElementById('depart').removeAttribute("disabled");
                    document.getElementsByClassName('info')[0].textContent = "Error";
                 }





    })
})}

    

    return {
        depart,
        arrive
    };
}

let result = solve();