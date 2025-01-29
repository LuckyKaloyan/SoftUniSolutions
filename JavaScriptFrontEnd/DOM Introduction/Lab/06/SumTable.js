function sumTable() {


    let table = document.getElementsByTagName('tbody')[0];
    let rows = table.getElementsByTagName('tr');

    let total = 0;

    for(let i=1; i<rows.length-1; i++){

        total = total+Number(rows[i].getElementsByTagName('td')[1].textContent);

    }

    
    
    document.getElementById('sum').textContent=total;

}