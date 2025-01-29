function solve(input) {
    let args = input;
    let objects = [];

    for (let i = 0; i < args.length; i++) {
        let splitted = args[i].split(" / ");
        let object = {
            name: splitted[0],
            level: Number(splitted[1]),
            items: splitted[2],
        };
        objects.push(object);
    }
    objects.sort((a, b) => a.level - b.level);

    for(let i=0; i<objects.length; i++){

        console.log("Hero: "+objects[i].name);
        console.log("level => "+objects[i].level);
        console.log("items => "+objects[i].items);

    }


}