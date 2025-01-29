function solve(input) {
    let sentence = String(input);

    let words = sentence.split(' ');

    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let isOnlyLetters = true;

        for (let j = 1; j < word.length; j++) {
            let char = word.charAt(j);
            if (!(/[a-zA-Z]/.test(char))) {
                isOnlyLetters = false;
                break;
            }
        }

        if (isOnlyLetters && word.charAt(0) === '#' && word.length > 1) {
            console.log(word.substring(1));
        }
    }
}