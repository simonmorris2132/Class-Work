
console.log("I worked with Elvis and Taylor.\n")

/*
Challenge 1a:
Create a variable that stores the number of miles a car has on is odometer

Output if that car has been driven over 100,000 miles or not. 

The variable should store less than 100,000 and the output should be “Your car has been driven less than  100,000 miles, you are available for the better insurance package”

Change the variable so the output reads
“Your car has been driven more than or equal  to 100,000 miles, you are not available for the better insurance package”
*/
//this was written by taylor
var miles = 100001

if (miles <= 100000) {
    console.log("Your car has been driven less than 100,000 miles, you are available for the better insurance package.")
} else {
    console.log("Your car has been driven more than or equal to 100,000 miles, you are not available for the better insurance package.\n")
}

/*
Challenge 1b:
Create a variable that stores the cost of a hotel room

Output if the hotel room is a luxury room (cost more than $500). 

If the hotel room is considered luxury output 
“You have selected a luxury hotel suite”

Otherwise output

“You have selected a standard hotel suite”

Get your program to output both 
*/
//this was written by elvis
let hotelArr = [" Luxury ", " Standard "]
let prices = [1000, 250]

for (let i = 0; i < hotelArr.length; i++) {
    if (prices[i] >= 500) {
        console.log("You have selected a standard hotel suite.\n")
    } else {
        console.log("You have selected a luxury hotel suite.\n")
    }
    
}

/*
Challenge 2a:
 Given the array

let carNames = [‘Honda Accord’, ‘Toyota Corolla’, ‘Tesla Model Y’, ‘Chevy Camaro’]

Output each car name on a new line
*/
console.log("this code was written by simon")
let carNames = ['Honda Accord', 'Toyota Corolla', 'Tesla Model Y', 'Chevy Camaro']
for (let i = 0; i < carNames.length; i++) { 
    /* This basically means that if i (which is zero rn) is less than the length of carNames, it will keep going until the end of the array's length. */
    console.log(carNames[i]) 
    /* This will log the names of the cars from the array in a list format. the for loop is listing each element of the array until there is no more to list. */
}


/*
Challenge 2b:
Given the string

let hotelName = “CareerDevs Resorts”

Output each character in the string on a new line
*/

console.log("this was also written by simon")
let hotelName = "CareerDevs Resorts\n"
for (let i = 0; i < hotelName.length; i++) {
    console.log(hotelName[i])
}

/*
Challenge 3a:
Given the array
let carGas = [.15, .75, .27, .23, .80, . 50, .10, 30]

Output a line for each element in the array that states the car’s gas take percentage and if they need a fill up soon or not (below 25% they need a fillup)

Example outputs

The car’s gas tank is at 15%, the car needs a fill up soon.
The car’s gas tank is at 75%, the car does not need a fill up very soon.
*/
//This was written by me
let carGas = [.15, .75, .27, .23, .80, .50, .10, 30]
for (let i = 0; i < carGas.length; i++) {
    if (carGas[i] <= .25) {
        console.log(`The car’s gas tank is at ${carGas[i]}, the car needs a fill up soon.\n`)
    } else {
        console.log(`The car’s gas tank is at ${carGas[i]}, the car does not need a fill up very soon.\n`)
    }
}

/*
Challenge 3b:
Given the array
let hotelPrices = [550, 300, 100, 700, 250, 450, 600, 200]

For each number in the array, output a sentence that states if the price considers a luxury hotel room or not.

Example outputs

The hotel room with the price $550 is a luxury room.
The hotel room with the price $300 is not a  luxury room.
*/
//This was written by me
let hotelPrices = [550, 300, 100, 700, 250, 450, 600, 200]

for (let i = 0; i < hotelPrices.length; i++) {
    if (hotelPrices[i] >= 550) {
        console.log("The hotel room with the price $550 is a luxury room.\n")
    } else {
        console.log("The hotel room with the price $300 is not a luxury room.\n")
    }
}

/*
Challenge 4:
Start with an empty array called numbers

let numbers = []



Populate the array with numbers from 14-100 using the .push() array method and a for loop.

Using another for-loop, iterate through the numbers array, multiply each number by 3, then store the result in a new variable within the for-loop.

Then in the same for-loop make an output if the number variable is even or odd. 



Example

numbers = [14, 15 …]

14 * 3 = 42

42 is even


15 * 3 = 45

45 is odd


So the output should be 


42 is even
45 is odd
...
And so on until 100.
*/
//this was written by taylor
let numbers = []
let testArr = []

for (let i = 14; i < 101; i++) {
    numbers.push(i)
}
for (let j = 0; j < numbers.length; j++) {
    testArr.push(numbers[j] * 3)
    if (testArr[j]%2 === 0) {
        console.log(`${testArr[j]} is Even`)
    } else {
        console.log(`${testArr[j]} is Odd`)
    }
}


console.log(numbers)
console.log(testArr)