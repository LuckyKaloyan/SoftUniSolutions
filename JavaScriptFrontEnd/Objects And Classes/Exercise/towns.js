function solve(input){

let args = input;
let objects = [];


for(let i=0; i<args.length; i++){

    let splitted = args[i].split(" | ");

    let town = splitted[0];
    let latitude = Number(splitted[1]).toFixed(2);
    let longitude = Number(splitted[2]).toFixed(2);

    let object = {
        town:town,
        latitude:latitude,
        longitude:longitude,
    }

    objects.push(object);
}

for(let i=0; i<objects.length; i++){
    console.log(objects[i]);
};




}