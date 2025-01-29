function movies(input){

let args = input;
let objects = [];


for(let i=0; i<args.length; i++){
    
    if(args[i].includes("addMovie")){

        let object = {
            name:args[i].substring(9)
        }

        objects.push(object);
    }else{
          
        if(args[i].includes("directedBy")){
            let splitted = args[i].split(" directedBy ");

            for(let j=0; j<objects.length; j++){
                if(objects[j].name===splitted[0]){
                    objects[j].director=splitted[1];
                }
            }

        }else{

            let splitter = args[i].split(" onDate ");

            for(let k=0; k<objects.length; k++){
                if(objects[k].name===splitter[0]){
                    objects[k].date=splitter[1];
                }
            }
        }
    }
}



for(let i=0; i<objects.length; i++){
    if(objects[i].name && objects[i].date && objects[i].director){
        let json = JSON.stringify(objects[i]);
        console.log(json);
    }
    }
 



}
