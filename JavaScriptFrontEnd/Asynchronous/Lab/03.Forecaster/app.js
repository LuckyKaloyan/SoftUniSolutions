document.getElementById('submit').addEventListener('click',attachEvents);




function attachEvents() {

    document.getElementById('forecast').setAttribute('style','display:visible');
    let codeFound = '';
    let searchingName = document.getElementById('location').value;
    let foundit = false;

    fetch('http://localhost:3030/jsonstore/forecaster/locations').then(function(data){
        return data.json();}).then(function(data){

                       data.forEach(element => {
                    
                        let {code, name} = element;
                           if(name==searchingName){
                            codeFound = code;
                            foundit = true;
                           }
                      });

                      if(!foundit){
                        document.getElementsByClassName('label')[0].textContent = "Error";
                        document.getElementsByClassName('label')[1].textContent = "Error";


                        let parent = document.getElementsByClassName('label')[0].parentNode;
                        parent.removeChild(document.getElementsByClassName('label')[0].nextElementSibling);
                        let parent2 = document.getElementsByClassName('label')[1].parentNode;
                        parent2.removeChild(document.getElementsByClassName('label')[1].nextElementSibling);

                        document.getElementById('current').children[1].remove;
                        document.getElementById('upcoming').children[1].remove;
                      }else{
                        document.getElementsByClassName('label')[0].textContent = 'Current conditions';
                        document.getElementsByClassName('label')[1].textContent = 'Three-day forecast';

                        fetch('http://localhost:3030/jsonstore/forecaster/today/'+codeFound).then(function(data){
                            return data.json();
                        }).then(function(dataReturn){
                            let {forecast, name} = dataReturn;
                            let {condition, high, low} = forecast;

                           let newbornDiv = document.createElement('div');
                          let currentDiv =  document.getElementById('current');

                          newbornDiv.setAttribute('class', 'forecasts');
                          currentDiv.appendChild(newbornDiv);

                          if(currentDiv.children.length>2){
                            document.getElementById('current').removeChild(document.getElementById('current').children[1]);
                          }

                          let symbolSpan = document.createElement('span');
                          symbolSpan.setAttribute('class', 'condition symbol');

                          if(condition=='Sunny'){
                            symbolSpan.textContent = '☀';
                          }else if(condition=='Partly sunny'){
                            symbolSpan.textContent = '⛅';
                          }else if(condition=='Overcast'){
                            symbolSpan.textContent = '☁';
                          }else if(condition=='Rain'){
                            symbolSpan.textContent = '☂';
                          };
                            
                          newbornDiv.appendChild(symbolSpan);
                          let conditions = document.createElement('span');

                          let cityData = document.createElement('span');
                          cityData.setAttribute('class', 'forecast-data');
                          cityData.setAttribute('style', 'text-align: start');
                          cityData.textContent = name;

                          let lowHighData = document.createElement('span');
                          lowHighData.setAttribute('class', 'forecast-data');
                          lowHighData.setAttribute('style', 'text-align: start');
                          lowHighData.textContent = low+"°"+"/"+high+"°";

                          let weatherType = document.createElement('span');
                          weatherType.setAttribute('class', 'forecast-data');
                          weatherType.setAttribute('style', 'text-align: start');
                          weatherType.textContent = condition;

                          conditions.appendChild(cityData);
                          conditions.appendChild(lowHighData);
                          conditions.appendChild(weatherType);

                          conditions.setAttribute('style','margin: auto');

                          newbornDiv.appendChild(conditions);

                          newbornDiv.setAttribute('style', 'display: flex; margin: auto; margin-top: 10px');
                          }
                          
                      )

                      fetch('http://localhost:3030/jsonstore/forecaster/upcoming/'+codeFound).then(function(data){
                        return data.json();
                    }).then(function(data){
        
                        
                        let {forecast, name} = data;

                        if(document.getElementById('upcoming').children.length>1){
                            document.getElementById('upcoming').removeChild(document.getElementById('upcoming').children[1]);
                        }

                       let forecastInfoDiv = document.createElement('div');
                       forecastInfoDiv.setAttribute('class','forecast-info');


                       for(let i=0; i<3; i++){

                        let spancheUpcoming = document.createElement('span');
                          spancheUpcoming.setAttribute('class','upcoming');

                        let spanSymbol = document.createElement('span');
                        spanSymbol.setAttribute('class','symbol');

                        if(forecast[i].condition=="Sunny"){
                            spanSymbol.textContent = '☀';
                        }else if(forecast[i].condition=='Partly sunny'){
                            spanSymbol.textContent = '⛅';
                        }else if(forecast[i].condition=='Overcast'){
                            spanSymbol.textContent = '☁';
                        }else{
                            spanSymbol.textContent = '☂';
                        };
                        let lowAndHighSpan = document.createElement('span');
                        lowAndHighSpan.setAttribute('class', 'forecast-data');
                        lowAndHighSpan.textContent = forecast[i].low+"°/"+forecast[i].high+"°";

                        let conditionSpan = document.createElement('span');
                        conditionSpan.setAttribute('class', 'forecast-data');
                        conditionSpan.textContent = forecast[i].condition;

                        spancheUpcoming.appendChild(spanSymbol);
                        spancheUpcoming.appendChild(lowAndHighSpan);
                        spancheUpcoming.appendChild(conditionSpan);

                        forecastInfoDiv.appendChild(spancheUpcoming);
                        document.getElementById('upcoming').appendChild(forecastInfoDiv);
                             
              

                       }
                        

                    })

        }
    }
        )}