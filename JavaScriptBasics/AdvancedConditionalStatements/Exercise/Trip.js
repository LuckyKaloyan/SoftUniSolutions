function Trip(input) {
    let budget = Number(input[0]);
    let season = input[1];
    let destination;
    let place;

    if (budget <= 100) {
        destination = "Somewhere in Bulgaria";
        if (season === "summer") {
            place = "Camp";
            budget *= 0.3;
        } else {
            place = "Hotel";
            budget *= 0.7;
        }
    } else if (budget <= 1000 && budget > 100) {
        destination = "Somewhere in Balkans";
        if (season === "summer") {
            place = "Camp";
            budget *= 0.4;
        } else {
            place = "Hotel";
            budget *= 0.8;
        }
    } else if (budget >= 1000) {
        destination = "Somewhere in Europe";
        budget *= 0.9;
        place = "Hotel";
        
    }
    console.log(destination);
    console.log(place + " - " + budget.toFixed(2));
}