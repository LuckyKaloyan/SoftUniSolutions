function solve() {

let text = document.getElementById("text").value;
let naming = document.getElementById("naming-convention").value;

let splitted = text.split(" ");
let result = "";
if(naming=="Camel Case"){
result = splitted[0];
result=result.toLowerCase();

for(let i=1; i<splitted.length; i++){
  let add = splitted[i][0].toUpperCase();
  add = add+splitted[i].substring(1).toLowerCase();
  result=result+add;
}

}else{

for(let i=0; i<splitted.length; i++){
  let add = splitted[i][0].toUpperCase();
  add = add+splitted[i].substring(1).toLowerCase();
  result=result+add;
}

}

document.getElementById("result").textContent = result;

}