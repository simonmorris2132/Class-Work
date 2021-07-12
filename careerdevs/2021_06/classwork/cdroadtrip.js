/*
Challenge 1:
Given the array

let riders = [["Arnell"], ["Carlos", "Keith", "Sergio"],["Junior", "Loubna", "Margie"], ["Travis", "Matt", "Gabriel"], ["Elvis", "Jackie", "Saimer"]]




Console log: Gabriel, Arnell, and Margie…in that order

You can use a maximum of 3 console.logs, you can do this in just one.

Expected output

$ node cdroadtrip.js
Gabriel
Arnell
Margie
*/

let riders = [["Arnell"], ["Carlos", "Keith", "Sergio"],["Junior", "Loubna", "Margie"], ["Travis", "Matt", "Gabriel"], ["Elvis", "Jackie", "Saimer"]]

console.log(riders[0][0])
console.log(riders[3][2])
console.log(riders[2][2])

/*
Challenge 2:
Given the array

let riders = [["Arnell"], ["Carlos", "Keith", "Sergio"],["Junior", "Loubna", "Margie"], ["Travis", "Matt", "Gabriel"], ["Elvis", "Jackie", "Saimer"]]




Output each rider’s name on a new line, and what row of the bus they are in. (Arnell is in row 1)

Expected Output


$ node cdroadtrip.js
Arnell
Carlos
Keith
Sergio
Junior
Loubna
Margie
Travis
Matt
Gabriel
Elvis
Jackie
Saimer
*/

let riders = [["Arnell"], ["Carlos", "Keith", "Sergio"],["Junior", "Loubna", "Margie"], ["Travis", "Matt", "Gabriel"], ["Elvis", "Jackie", "Saimer"]]

var rows = 0;
function rowOfRiders(array) {
    for (var i = 0; i < array.length; i++) {
        for (var j = 0; j < array[i].length; j++) {
            console.log(array[i][j])
        }
    }
}
rowOfRiders(riders)
//what the hell is wrong with you blame()

/*
Challenge bonus:

Print every character of an individual's name, if they have less than 6 characters in their name.

Expected Result:


$ node cdroadtrip.js
K
e
i
t
h
M
a
t
t
E
l
v
i
s
*/
var rows = 0;
function sixOrLess(array){
    for (var i = 0; i < array.length; i++) {
        for (var j = 0; j < array[i].length; j++) {
            for (var k = 0; k < array [j].length; k++) {
                console.log(array[i][j][k])
            }
        }
    }
}
sixOrLess(riders)