function attachEvents() {
  window.addEventListener('load', loadIt);
  document.getElementById('submit').addEventListener('click',submit);

}

function loadIt(){
  fetch('http://localhost:3030/jsonstore/collections/students').then(function(data){return data.json()}).then(function(data){
    
    let array = Object.values(data);

    array.forEach(element => {
     let newRow = document.createElement('tr');
     let FirstName = document.createElement('td');
     FirstName.textContent = element.firstName;
     let LastName = document.createElement('td');
     LastName.textContent = element.lastName;
     let facultyNumber = document.createElement('td');
     facultyNumber.textContent = element.facultyNumber;
     let grade = document.createElement('td');
     grade.textContent = element.grade;

     newRow.appendChild(FirstName);
     newRow.appendChild(LastName);
     newRow.appendChild(facultyNumber);
     newRow.appendChild(grade);

     document.getElementsByTagName('tbody')[0].appendChild(newRow);
    });
}
  )
}

function submit(){

    let firstNameInput = document.getElementsByClassName('inputs')[0].children[0].value;
    let lastNameInput = document.getElementsByClassName('inputs')[0].children[1].value;
    let facultyNumberInput = document.getElementsByClassName('inputs')[0].children[2].value;
    let gradeInput = document.getElementsByClassName('inputs')[0].children[3].value;
    
    if(!firstNameInput=='' && !lastNameInput=='' && !facultyNumberInput=='' && !gradeInput==''){

      fetch('http://localhost:3030/jsonstore/collections/students',
      {
        method: 'POST',
        headers: {'Content-Type': 'application/JSON'} ,
        body: JSON.stringify({

          firstName: firstNameInput,
                lastName: lastNameInput,
                facultyNumber: facultyNumberInput,
                grade: gradeInput

        })
      }
   
     

      
      )
      document.getElementsByTagName('tbody')[0].innerHTML = '';
      loadIt();
    }

}




attachEvents();