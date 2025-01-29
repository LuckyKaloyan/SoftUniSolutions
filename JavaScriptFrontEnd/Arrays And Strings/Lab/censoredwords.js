function solve(text, word) {

    let regex = new RegExp(`${word}`, 'gi'); 
    let result = text.replace(regex, match => '*'.repeat(match.length));
    console.log(result);
}