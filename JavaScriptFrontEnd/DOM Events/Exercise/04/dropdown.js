function addItem() {
  
    let inputText = document.getElementById('newItemText').value;
    let inputValue = document.getElementById('newItemValue').value;

    let optionInput = document.createElement('option');
    optionInput.textContent = inputText;
    optionInput.value = inputValue;

    document.getElementById('menu').appendChild(optionInput);


    document.getElementById('newItemText').value = '';
    document.getElementById('newItemValue').value = '';
}