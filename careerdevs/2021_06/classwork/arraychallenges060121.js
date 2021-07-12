/*
Challenge 1:
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
Challenge 2:
Create a function that accepts an array and returns the last item in the array.
Examples

getLastItem([1, 2, 3]) ➞ 3

getLastItem(["cat", "dog", "duck"]) ➞ "duck"

getLastItem([true, false, true]) ➞ true

Notes

    Don't forget to return the result.
    If you get stuck on a challenge, find help in the Resources tab.
    If you're really stuck, unlock solutions in the Solutions tab.
*/

function getLastItem(arr) {
    [1, 2, 3]
    return arr.pop();
}

/*
Challenge 3:
Write a function to reverse an array.
Examples

reverse([1, 2, 3, 4]) ➞ [4, 3, 2, 1]

reverse([9, 9, 2, 3, 4]) ➞ [4, 3, 2, 9, 9]

reverse([]) ➞ []

Notes

    Don't forget to return the result.
    If you get stuck on a challenge, find help in the Resources tab.
    If you're really stuck, unlock solutions in the Solutions tab.
*/

function reverse(arr) {
	[1, 2, 3]
    return arr.reverse();
}

/*
Challenge 4:


Return an array consisting of the largest number from each provided sub-array. For simplicity, the provided array will contain exactly 4 sub-arrays.

Remember, you can iterate through an array with a simple for loop, and access each member with array syntax arr[i].
*/

function largestOfFour(arr) {
    return arr.map(Function.apply.bind(Math.max, null));
  }
largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]);