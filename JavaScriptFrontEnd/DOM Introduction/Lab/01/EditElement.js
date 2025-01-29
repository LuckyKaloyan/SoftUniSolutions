function editElement(referance, match, replacer) {
 while(referance.textContent.includes(match)){
    referance.textContent = referance.textContent.replace(match, replacer);
 }
}