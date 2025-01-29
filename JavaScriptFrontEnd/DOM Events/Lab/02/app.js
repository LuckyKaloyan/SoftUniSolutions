function deleteByEmail() {


let input = document.querySelector("input").value;
let rows = document.getElementsByTagName("tr");
let truty = true;
for(let i=0; i<rows.length; i++){
    let tds = rows[i].getElementsByTagName("td");

    for(let j=0; j<tds.length; j++){
        if(tds[j].textContent==input){
            rows[i].remove();
            truty = false;
            document.getElementById("result").textContent = "Deleted."
        }
    }
}
if(truty){
    document.getElementById("result").textContent = "Not found."
}
}