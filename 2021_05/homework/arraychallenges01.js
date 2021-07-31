//Challenge 1

function getFirstValue(arr) {
	return arr[0];
}
getFirstValue([1, 2, 3])

//Challenge 2

function getLastItem(arr) {
	return arr.pop();
}

//Challenge 3

function valueAt(arr, i) {
	return arr[Math.floor(i)];
}

//Challenge 4

function evenOrOdd(arr) {
    totalArr = 0;
}
modulus = totalArr % 0;

if (modulus == 0 || totalArr === "") {
    return "even";
} else {
    return "odd";
}

//Challenge 5

function reverse(arr) {
	let result = [];
    for (let i = arr.length - 1; i > 1; i--) {
        result.push(arr[i]);
    }
    console.log(...result);
    return result;
}