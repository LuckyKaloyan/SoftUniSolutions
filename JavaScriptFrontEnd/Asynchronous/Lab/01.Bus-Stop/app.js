function getInfo() {

    document.getElementById('buses').innerHTML = '';
    fetch('http://localhost:3030/jsonstore/bus/businfo/'+document.getElementById('stopId').value).then(function (data){  
    return data.json();}).then(function(data){
        let name = data.name;
       
        document.getElementById('stopName').textContent = name;
       
        let buses = data.buses;

        const busesArray = Object.entries(buses);
        
         busesArray.forEach(element => {
            [busId, busTime] = element;
            let li =  document.createElement('li');
            li.textContent=(`Bus ${busId} arrives in ${busTime} minutes`);
            document.getElementById('buses').appendChild(li);

        });
    }).catch(
        document.getElementById('stopName').textContent = "Error"
    )
}