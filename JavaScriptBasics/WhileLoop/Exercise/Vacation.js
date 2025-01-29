function Vacation(input) {
    let neededMoney = Number(input[0]);
    let startingBudget = Number(input[1]);
    let commandIndex = 2;
    let amountIndex = 3;
    let daysCounter = 0;
    let consecutiveSpending = 0;

    while (startingBudget < neededMoney && consecutiveSpending < 5) {
        let command = input[commandIndex];
        let amount = Number(input[amountIndex]);

        if (command === "spend") {
            startingBudget =startingBudget- amount;
            consecutiveSpending++;
        } else if (command === "save") {
            startingBudget =startingBudget+ amount;
            consecutiveSpending = 0;
        }

        daysCounter++;
        commandIndex = commandIndex+ 2;
        amountIndex = amountIndex+ 2;
    }

    if (consecutiveSpending === 5) {
        console.log("You can't save the money.");
        console.log(daysCounter);
    } else {
        console.log(`You saved the money for ${daysCounter} days.`);
    }
}