function attachEventsListeners() {


    document.getElementById('daysBtn').addEventListener('click', function(e){
        let daysCount = document.getElementById('days').value;
        document.getElementById('hours').value = daysCount * 24;
        document.getElementById('minutes').value = daysCount * 1440;
        document.getElementById('seconds').value = daysCount * 86400;
    });
    
    document.getElementById('hoursBtn').addEventListener('click', function(e){
        let hoursCount = document.getElementById('hours').value;
        document.getElementById('days').value = hoursCount / 24;
        document.getElementById('minutes').value = hoursCount * 60;
        document.getElementById('seconds').value = hoursCount * 3600;
    });
    
    document.getElementById('minutesBtn').addEventListener('click', function(e){
        let minutesCount = document.getElementById('minutes').value;
        document.getElementById('days').value = minutesCount / 1440;
        document.getElementById('hours').value = minutesCount / 60;
        document.getElementById('seconds').value = minutesCount * 60;
    });
    
    document.getElementById('secondsBtn').addEventListener('click', function(e){
        let secondsCount = document.getElementById('seconds').value;
        document.getElementById('days').value = secondsCount / 86400;
        document.getElementById('hours').value = secondsCount / 3600;
        document.getElementById('minutes').value = secondsCount / 60;
    });
    


}