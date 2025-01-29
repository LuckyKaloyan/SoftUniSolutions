function addItem() {
 
function deletion(element){
        element.remove();
}


    let newElement = document.createElement("li");
    let newElementTwo = document.createElement("a");
    newElementTwo.textContent = "[Delete]";
    newElementTwo.setAttribute("href", "#");
    newElementTwo.onclick = function(){deletion(newElement)};

    newElement.textContent = document.getElementById("newItemText").value;
    document.getElementById("items").appendChild(newElement).appendChild(newElementTwo);


    }

