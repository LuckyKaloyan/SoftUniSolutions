function sumCharacters(input) {

    let inputString = String(input);
    let sum = 0;

    for (let i = 0; i < inputString.length; i++) {
        let char = String(inputString.charAt(i));
            sum =sum+ Number(char);
        
    }

    console.log(sum);
}
