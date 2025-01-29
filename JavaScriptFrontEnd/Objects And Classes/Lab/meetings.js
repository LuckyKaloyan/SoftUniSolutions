function solve(input){
    let sentence = input;
    let map = new Map();

    for(let i = 0; i < sentence.length; i++){
        let kebab = sentence[i].split(" ");

        if(map.has(kebab[0])){
            console.log("Conflict on " + kebab[0]+"!");
        } else {
            console.log("Scheduled for " + kebab[0]);
            map.set(kebab[0], kebab[1]);
        }
    }

    map.forEach((value, key) => {
        console.log(key + " -> " + value);
    });
}
