function generateReport() {
    let inputElements = Array.from(document.querySelectorAll('thead input[type="checkbox"]'));
    let resultArr = [];
    let tableRows = Array.from(document.querySelectorAll('tbody tr'));
    let checkedCols = [];
    
    let headerRow = document.querySelector('thead tr');
    for (let y = 0; y < headerRow.children.length; y++) {
        let checkbox = headerRow.children[y].querySelector('input');
        if (checkbox && checkbox.checked) {
            checkedCols.push(y);
        }
    }
    
    tableRows.forEach(function(row) {
        let obj = {};
        
        for (let index = 0; index < row.children.length; index++) {
            let cell = row.children[index];
            if (checkedCols.includes(index)) {
                let propertyName = inputElements[index].name;
                obj[propertyName] = cell.textContent.trim();
            }
        }
        
        resultArr.push(obj);
    });
    
    document.getElementById('output').value = JSON.stringify(resultArr, null, 2);
}