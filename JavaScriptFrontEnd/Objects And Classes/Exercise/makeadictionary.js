function solve(input){

let args = input;
let objects = [];

for(let i=0; i<args.length; i++){
    let splitted = args[i].split(":");

    let object ={
              name:splitted[0],
              term:splitted[1],
    }
      let nameSplit = object.name.split('"');
      let termSplit = object.term.split('"');
    
    object.name=nameSplit[1];
    object.term=termSplit[1];

    let check = true;
    for(let i=0; i<objects.length; i++){
        if(object.name===objects[i].name){
            check = false;
            objects[i].name=nameSplit[1];
            objects[i].term=termSplit[1];
        }
    }
    if(check){
        objects.push(object);
    }
    
}

objects.sort((a,b)=> {
    if (b.name > a.name) {
        return -1;
    } else if (b.name < a.name) {
        return 1;
    } else {
        return 0;
    }
})

for(let i=0; i<objects.length; i++){
    console.log("Term: "+objects[i].name+" => Definition: "+objects[i].term)
}
}