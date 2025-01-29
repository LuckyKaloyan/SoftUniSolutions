function solve() {
  let features = JSON.parse(document.getElementsByTagName('textarea')[0].value);


  let row = document.createElement('tr');

  let tedeOne = document.createElement('td');
  let image = document.createElement('img');
  image.setAttribute('src', features.img);
  tedeOne.appendChild(image);
  row.appendChild(tedeOne);

  let tedeTwo = document.createElement('td');
  tedeTwo.textContent = features.name;
  row.appendChild(tedeTwo);

  let tedeThree = document.createElement('td');
  tedeThree.textContent = features.price;
  row.appendChild(tedeThree);

  let tedeFour = document.createElement('td');
  tedeFour.textContent = features.decFactor;
  row.appendChild(tedeFour);

  let tedeFive = document.createElement('td');
  let checkbox = document.createElement('input');
  checkbox.setAttribute('type', 'checkbox');
  tedeFive.appendChild(checkbox);
  row.appendChild(tedeFive);

  document.querySelector('tbody').appendChild(row);
}

document.getElementsByTagName('button')[0].addEventListener('click', solve);
function buy() {
  let boughtFurniture = [];
  let totalPrice = 0;
  let totalDecFactor = 0;
  let count = 0;

  let rows = document.querySelectorAll('tbody tr');

  rows.forEach(row => {
  let checkbox = row.querySelector('input[type="checkbox"]');

      if (checkbox.checked) {
        let name = row.cells[1].textContent;
        let price = Number(row.cells[2].textContent);
        let decFactor = Number(row.cells[3].textContent);

         boughtFurniture.push(name);
        totalPrice += price;
        totalDecFactor += decFactor;
       count++;
      }
  });
  let averageDecFactor = totalDecFactor / count;
  let output = `Bought furniture: ${boughtFurniture.join(', ')}\n`;
  output += `Total price: ${totalPrice.toFixed(2)}\n`;
  output += `Average decoration factor: ${averageDecFactor.toFixed(2)}`;
  document.getElementsByTagName('textarea')[1].value = output;
}
document.getElementsByTagName('button')[1].addEventListener('click', buy);