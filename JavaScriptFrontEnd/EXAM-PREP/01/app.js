document.addEventListener('DOMContentLoaded', () => {
    const apiUrl = '-	http://localhost:3030/jsonstore/records/'; 
  
    const addRecordBtn = document.getElementById('add-record');
    const editRecordBtn = document.getElementById('edit-record');
    const loadRecordsBtn = document.getElementById('load-records');
    const listElement = document.getElementById('list');
  
    const nameInput = document.getElementById('p-name');
    const stepsInput = document.getElementById('steps');
    const caloriesInput = document.getElementById('calories');
  
    let editingRecordId = null;
  

    function createRecordElement(record) {
      const li = document.createElement('li');
      li.className = 'record';
  
      const infoDiv = document.createElement('div');
      infoDiv.className = 'info';
  
      const nameP = document.createElement('p');
      nameP.textContent = record.name;
      const stepsP = document.createElement('p');
      stepsP.textContent = record.steps;
      const caloriesP = document.createElement('p');
      caloriesP.textContent = record.calories;
  
      infoDiv.append(nameP, stepsP, caloriesP);
  
      const btnWrapper = document.createElement('div');
      btnWrapper.className = 'btn-wrapper';
  
      const changeBtn = document.createElement('button');
      changeBtn.className = 'change-btn';
      changeBtn.textContent = 'Change';
      changeBtn.addEventListener('click', () => populateFormForEdit(record));
  
      const deleteBtn = document.createElement('button');
      deleteBtn.className = 'delete-btn';
      deleteBtn.textContent = 'Delete';
      deleteBtn.addEventListener('click', () => deleteRecord(record.id));
  
      btnWrapper.append(changeBtn, deleteBtn);
  
      li.append(infoDiv, btnWrapper);
      return li;
    }
  
    function fetchRecords() {
      fetch(apiUrl)
        .then(response => response.json())
        .then(records => {
          listElement.innerHTML = ''; 
          records.forEach(record => {
            listElement.appendChild(createRecordElement(record));
          });
        })
        .catch(error => console.error('Error fetching records:', error));
    }
  
    function addRecord() {
      const newRecord = {
        name: nameInput.value,
        steps: parseInt(stepsInput.value),
        calories: parseInt(caloriesInput.value)
      };
  
      fetch(apiUrl, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(newRecord)
      })
        .then(response => response.json())
        .then(() => {
          fetchRecords();
          clearForm();
        })
        .catch(error => console.error('Error adding record:', error));
    }
  
    function populateFormForEdit(record) {
      nameInput.value = record.name;
      stepsInput.value = record.steps;
      caloriesInput.value = record.calories;
      editingRecordId = record.id;
      toggleEditState(true);
    }
  
    function editRecord() {
      const updatedRecord = {
        name: nameInput.value,
        steps: parseInt(stepsInput.value),
        calories: parseInt(caloriesInput.value)
      };
  
      fetch(`${apiUrl}/${editingRecordId}`, {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(updatedRecord)
      })
        .then(response => response.json())
        .then(() => {
          fetchRecords();
          clearForm();
          toggleEditState(false);
        })
        .catch(error => console.error('Error updating record:', error));
    }
  

    function deleteRecord(id) {
      fetch(`${apiUrl}/${id}`, {
        method: 'DELETE'
      })
        .then(() => {
          fetchRecords();
        })
        .catch(error => console.error('Error deleting record:', error));
    }

    function clearForm() {
      nameInput.value = '';
      stepsInput.value = '';
      caloriesInput.value = '';
    }

    function toggleEditState(isEditing) {
      editRecordBtn.disabled = !isEditing;
      addRecordBtn.disabled = isEditing;
    }
  

    addRecordBtn.addEventListener('click', addRecord);
    editRecordBtn.addEventListener('click', editRecord);
    loadRecordsBtn.addEventListener('click', fetchRecords);
  });
  