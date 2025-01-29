function solve(input) {
    
    let phoneBook = {};
    for (let inputElement of input) {
        let personInformation = inputElement.toString().split(' ');
        phoneBook[personInformation[0]] = personInformation[1];
    }

    for (let phoneBookKey in phoneBook) {
        console.log(phoneBookKey + " -> " + phoneBook[phoneBookKey]);
    }

}
