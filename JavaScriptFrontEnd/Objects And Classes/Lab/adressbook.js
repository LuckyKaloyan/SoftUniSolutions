function solve(input) {
    let args = input;
    let map = new Map();

    var pairs = [];
    for (let i = 0; i < args.length; i++) {
        let splitted = args[i].split(":");
        pairs.push(splitted);
    }
    pairs.sort(function(a, b) {
        return a[0].localeCompare(b[0]);
    });

    for (var i = 0; i < pairs.length; i++) {
        let key = pairs[i][0];
        let value = pairs[i][1];
        map.set(key, value);
    }

    map.forEach(function(value, key) {
        console.log(key + " -> " + value);
    });
}
