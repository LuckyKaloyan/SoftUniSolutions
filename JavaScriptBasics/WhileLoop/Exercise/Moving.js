function Moving(input) {
    let width = Number(input.shift());
    let length = Number(input.shift());
    let height = Number(input.shift());
    let volume = width * length * height;

    let movedCartons = 0;
    let numCartons = input.shift();
    
    while (numCartons !== "Done") {
        movedCartons += parseInt(numCartons);
        if (movedCartons >= volume || input.length === 0) {
            break;
        }
        numCartons = input.shift();
    }

    if (movedCartons >= volume) {
        console.log(`No more free space! You need ${Math.abs(movedCartons - volume)} Cubic meters more.`);
    } else {
        console.log(`${Math.abs(movedCartons - volume)} Cubic meters left.`);
    }
}