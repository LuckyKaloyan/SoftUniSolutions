function solve(input) {
    let args = input.map(String);
    for (let i = 0; i < args.length; i++) {
        let isTrue = true;
        for (let j = 0; j < args[i].length / 2; j++) {
           
            if (args[i].charAt(j) != args[i].charAt(args[i].length - j - 1)) {
                isTrue = false;
                break;
            }
        }
        console.log(isTrue);
    }
}