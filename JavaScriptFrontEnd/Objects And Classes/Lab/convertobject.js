function convertobject(input){

      let text = JSON.parse(input);


      for(let key in text){
        console.log(key+": "+text[key]);
      }
}