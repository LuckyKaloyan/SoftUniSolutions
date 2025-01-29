function solve(input){

    let args = [];
    let kebab = input;

    for(let i = 0; i < kebab.length; i++){
        let number = Number(kebab[i].length);
        args.push({
            Name: kebab[i],
            PersonalNumber: number,
        });
    }

    args.forEach(element => {
        console.log("Name: " + element.Name + " -- Personal Number: " + element.PersonalNumber);
    });

}