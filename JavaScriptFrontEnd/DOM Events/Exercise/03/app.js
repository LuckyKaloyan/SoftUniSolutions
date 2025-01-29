function lockedProfile() {
    const arrei = Array.from(document.getElementsByTagName('button'));




    for(let i=0; i<arrei.length; i++){
        arrei[i].addEventListener('click', function(e){
            if(arrei[i].textContent == "Hide it"){
                e.currentTarget.previousElementSibling.setAttribute('style', 'display: none');
                e.currentTarget.textContent = "Show more";
        }else{
            e.currentTarget.previousElementSibling.setAttribute('style', 'display: block');
            e.currentTarget.textContent = "Hide it";
        }
        });
    }

    const profileDivs = Array.from(document.getElementsByClassName('profile'));
    const inputs = Array.from(document.getElementsByTagName('input'));

    for(let i=0; i<profileDivs.length; i++){
        profileDivs[i].getElementsByTagName('button')[0].disabled = true;
    }

    for(let i=0; i<inputs.length; i++){
        if(inputs[i].value=="lock"){


            inputs[i].addEventListener('change', function(e){
                if(inputs[i].checked){
                    inputs[i].parentElement.getElementsByTagName('button')[0].disabled = true;
                }else{
                    inputs[i].parentElement.getElementsByTagName('button')[0].disabled = false;
                }
                
            })
        }else{
            inputs[i].addEventListener('change', function(e){
                if(inputs[i].checked){
                    inputs[i].parentElement.getElementsByTagName('button')[0].disabled = false;
                }else{
                    inputs[i].parentElement.getElementsByTagName('button')[0].disabled = true;
                }
                
            })
        }
    }


}