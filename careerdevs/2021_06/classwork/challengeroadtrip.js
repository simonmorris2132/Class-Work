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
function rowOfRiders(array){
    for (var i = 0; i < array.length; i++) {
        for (var j = 0; j < array[i].length; j++) {
            console.log(array[i][j])
        }
    }
}
rowOfRiders(riders)
/* if (riders[i] > rows) {
    rows = array[i]
} */

//what the hell is wrong with you blame()