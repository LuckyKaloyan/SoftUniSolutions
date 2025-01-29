const readline = require('readline');

function yardGreening() {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  rl.question('Enter the land area: ', (input) => {
    const land = parseFloat(input);
    const priceland = land * 7.61;
    const result = priceland * 0.82;
    const discount = priceland * 0.18;

    console.log(`The final price is: ${result.toFixed(2)} lv.`);
    console.log(`The discount is: ${discount.toFixed(2)} lv.`);

    rl.close();
  });
}

// Call the function to start the process
yardGreening(5);