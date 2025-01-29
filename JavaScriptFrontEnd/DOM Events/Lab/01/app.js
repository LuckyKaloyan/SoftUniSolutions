function addItem() {
 
let newElement = document.createElement("li");
newElement.textContent = document.getElementById("newItemText").value;
document.getElementById("items").appendChild(newElement);


}