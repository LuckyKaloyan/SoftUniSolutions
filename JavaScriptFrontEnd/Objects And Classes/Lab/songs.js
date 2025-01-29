class Song {
    constructor(typeList, name, time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }
}

function songs(input) {
    let songList = [];
    
   let numSongs = parseInt(input[0]);
    for (let i = 1; i <= numSongs; i++) {
        let [typeList, name, time] = input[i].split('_');
        songList.push(new Song(typeList, name, time));
    }
    
    let filterType = input[numSongs + 1];

    songList.forEach(song => {
        if (filterType === 'all' || song.typeList === filterType) {
            console.log(song.name);
        }
    });
}
