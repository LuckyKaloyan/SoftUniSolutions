function solve(input) {
    class Song {
        constructor(typeList, name, time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }

    let numberOfSongs = Number(input[0]);
    
    let songs = [];

    for (let i = 1; i <= numberOfSongs; i++) {
        let songDetails = input[i].split('_');
        let typeList = songDetails[0];
        let name = songDetails[1];
        let time = songDetails[2];
        let song = new Song(typeList, name, time);
        songs.push(song);
    }

    let requestedTypeList = input[input.length - 1];

    for (let i = 0; i < songs.length; i++) {
        if (requestedTypeList === 'all' || songs[i].typeList === requestedTypeList) {
            console.log(songs[i].name);
        }
    }
}