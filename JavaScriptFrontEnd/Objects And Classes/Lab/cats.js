function catsCreate(input){
    class cats{
        constructor(name,age){
            this.name = name;
            this.age = age;
        }
    
        meow(){
            console.log(this.name+", age "+this.age+" says Meow");
        }
    }


    let args = input;
    for(let i=0; i<args.length; i++){
        let kebab = args[i].split(" ");
        let cat = new cats(kebab[0],kebab[1]);
        cat.meow();
    }

}