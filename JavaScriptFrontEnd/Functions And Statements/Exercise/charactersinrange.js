function solve(charA, charB) {
    let result = "";
    if (charA.charCodeAt(0) > charB.charCodeAt(0)) {
        for (let i = charB.charCodeAt(0)+1; i<charA.charCodeAt(0); i++) {
            result += String.fromCharCode(i) + " ";
        }
    }else{
        for(let i=charA.charCodeAt(0)+1; i<charB.charCodeAt(0);i++){
            result += String.fromCharCode(i) + " ";
        }
    }
    console.log(result);
}