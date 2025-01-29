function solve() {
    let bought = [];
    let bill = 0;

    const collection = document.getElementsByClassName("add-product");
    const textArea = document.getElementsByTagName('textarea')[0];
    let productPrices = {
        "Tomatoes": 0.99,
        "Milk": 1.09,
        "Bread": 0.80
    };

    Array.from(collection).forEach(element => {
        element.addEventListener('click', function(e) {
            const price = parseFloat(e.currentTarget.closest('div').nextElementSibling.textContent);
            bill =bill+ price;

            let product = e.currentTarget.closest('.product').querySelector('.product-title').textContent;
            let formattedPrice = productPrices[product].toFixed(2);

            textArea.value =textArea.value+ `\n`+`Added `+product+` for `+formattedPrice+` to the cart.`;

            if (!bought.includes(product)) {
                bought.push(product);
            }

            bill = parseFloat(bill.toFixed(2));
        });
    });

    document.getElementsByClassName('checkout')[0].addEventListener('click', function() {
        const textAreaItems = bought.join(', ');
        const textareaString = `\n`+`You bought `+textAreaItems+` for a total of `+bill.toFixed(2)+`.`;
        textArea.value =textArea.value + textareaString;

        Array.from(document.getElementsByClassName('add-product')).forEach(button => {
            button.disabled = true;
        });

        document.getElementsByClassName('checkout')[0].disabled = true;
    });
}
