function solve(numericValue, stringValue) {
    let speed = Number(numericValue);
    let limitType = String(stringValue).toLowerCase();
    let status;
    let limit;
    
    switch (limitType) {
        case "city":
            limit = 50;
            break;
        case "residential":
            limit = 20;
            break;
        case "interstate":
            limit = 90;
            break;
        case "motorway":
            limit = 130;
            break;
        default:
            console.log("Invalid area type");
            return; 
    }
    
    if (speed > limit) {
        let difference = speed - limit;
        if (difference <= 20) {
            status = "speeding";
        } else if (difference <= 40) {
            status = "excessive speeding";
        } else {
            status = "reckless driving";
        }
        console.log(`The speed is ${difference} km/h faster than the allowed speed of ${limit} - ${status}`);
    } else {
        console.log(`Driving ${speed} km/h in a ${limit} zone`);
    }
}