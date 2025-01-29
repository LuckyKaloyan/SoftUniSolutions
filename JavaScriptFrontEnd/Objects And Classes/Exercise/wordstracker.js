function wordstracker(input){

let args = input;

let words = input[0];
let splitted = words.split(" ");

let objects = [];

for(let i=0; i<splitted.length; i++){
    let object = {
        name:splitted[i],
        count:0,
    }

    objects.push(object);
}
for(let i=0; i<objects.length; i++){
    for(let j=1; j<args.length; j++){
          if(args[j]===objects[i].name){
            objects[i].count++;
          }

    }
}

objects.sort((a, b) => b.count - a.count);
for(let i=0; i<objects.length; i++){
    console.log(objects[i].name+" - "+objects[i].count);
}

}