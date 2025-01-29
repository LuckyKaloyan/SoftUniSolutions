function subtract() {
    
let firstNumber = Number(document.getElementById("firstNumber").getAttribute("value"));
let secondNumber = Number(document.getElementById("secondNumber").getAttribute("value"));
let result = firstNumber-secondNumber;

document.getElementById("result").textContent = result;

}