/*
Challenge 1:
Create a function that takes two numbers as arguments and return their sum.
Examples

addition(3, 2) ➞ 5

addition(-3, -6) ➞ -9

addition(7, 3) ➞ 10

Notes

    Don't forget to return the result.
    If you get stuck on a challenge, find help in the Resources tab.
    If you're really stuck, unlock solutions in the Solutions tab.
*/

function addition(a, b) {
    return a + b;
}


/*
Challenge 2:
Create a function that takes the age in years and returns the age in days.
Examples

calcAge(65) ➞ 23725

calcAge(0) ➞ 0

calcAge(20) ➞ 7300

Notes

    Use 365 days as the length of a year for this challenge.
    Ignore leap years and days between last birthday and now.
    Expect only positive integer inputs.
*/

function calcAge(age) {
	return age * 365;
}

/*
Challenge 3:
Create a function that takes an array containing only numbers and return the first element.
Examples

getFirstValue([1, 2, 3]) ➞ 1

getFirstValue([80, 5, 100]) ➞ 80

getFirstValue([-500, 0, 50]) ➞ -500

Notes

The first element in an array always has an index of 0.
*/

function getFirstValue(arr) {
    [1, 2, 3]
    return arr[0];
}

/*
Challenge 4:
Given an array of integers, determine whether the sum of its elements is even or odd.

The return value should be a string ("odd" or "even").

If the input array is empty, consider it as an array with a zero ([0]).
Examples

evenOrOdd([0]) ➞ "even"

evenOrOdd([1]) ➞ "odd"

evenOrOdd([]) ➞ "even"

evenOrOdd([0, 1, 5]) ➞ "even"
*/

function evenOrOdd(arr) {
	var sum = 0
	for(i = 0; i < arr.length; i++){
		sum += arr[i]
	}
	if(sum % 2 == 0){
		return 'even'
	}else{
		return 'odd'
	}
}

/*
Challenge 5:
Given an index and an array, return the value of the array with the given index.
Examples

valueAt([1, 2, 3, 4, 5, 6], 10 / 2) ➞ 6

valueAt([1, 2, 3, 4, 5, 6], 8.0 / 2) ➞ 5

valueAt([1, 2, 3, 4], 6.535355314 / 2) ➞ 4

Notes

Math.floor() can be helpful.
*/

function valueAt(arr, i) {
	return arr[Math.floor(i)]
}

/*
Challenge 6:
Create a function that takes an array of numbers or letters and returns a string.
Examples

arrayToString([1, 2, 3, 4, 5, 6]) ➞ "123456"

arrayToString(["a", "b", "c", "d", "e", "f"]) ➞ "abcdef"

arrayToString([1, 2, 3, "a", "s", "dAAAA"]) ➞ "123asdAAAA"
*/

function arrayToString(arr) {
	arrayToString = arr =>arr.join('')
}