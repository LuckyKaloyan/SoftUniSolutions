function sortNumbers(arr) {
    arr.sort((a, b) => a - b);
    let result = [];
    let left = 0;
    let right = arr.length - 1;

    for (let i = 0; i < arr.length; i++) {
        if (i % 2 === 0) {
            result.push(arr[left]);
            left++;
        } else {
          
            result.push(arr[right]);
            right--;
        }
    }

    return result;
} 


