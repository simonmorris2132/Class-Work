/* Challenge 1: 
The elements in the 6th index of each subarray are string data types. If there value is N/A keep the value the same. If not, change the value to its number equivalent.
*/

 let marketCapData = require (`./marketcapdata`)

for (let i = 0; i < marketCapData.length; i++) {
    if (marketCapData[i][6] != "n/a") {
        parseFloat(marketCapData[i][6])
        console.log(marketCapData[i][6])
    }
} 

/* Challenge 2:
Output each Person’s information only if their salary is in Dollars.
Example output: 
Luz Glencrash is Genderfluid and has $301,600,000,000 in stocks.
*/

for (let i = 0; i < marketCapData.length; i++) {
    if (marketCapData[i][5] == "Dollar") {
       let marketCapStat = parseFloat(marketCapData[i][6])
        console.log(marketCapData[i][1] + " " + marketCapData[i][2] + " is " + marketCapData[i][4] + " and has " + marketCapStat * 10000000000 + " in stocks.")
    }
}

/* Challenge 3:
Output the sum of all dollar values
Example output: 
The total market cap of all Dollars is 12,424,000,000,000.
*/

let marketCapData = require (`./marketcapdata`)
let totalMarketCap = 0;
for (let i = 0; i < marketCapData.length; i++) {
    let marketCap = parseFloat(marketCapData[i][6] * (10**9))
    if (marketCapData[i][5] == "Dollar" && marketCapData[i][6] != "n/a") {
        totalMarketCap += marketCap
    }
}
console.log(`the total market cap of all Dollars is ${totalMarketCap}`)

/* Bonus:
Example output: 
The total market cap of all Dollars is 12,424,000,000,000.
The total market cap of all Euro is 7,128,000,000,000.
The total market cap of all Yen is 872,972,000,000,000.
*/

let arr = []
for (let i = 0; i < marketCapData.length; i++) {
    if ( arr.indexOf(marketCapData[i][5]) == -1) {
        arr.push(marketCapData[i][5])
    }
}
arr.sort()
console.log(arr)
for (let i = 1; i < arr.length; i++) {
    let totalMarketCap = 0
    for (let j = 0; j < marketCapData.length; j++) {
    if (marketCapData[j][6] != "n/a" && marketCapData[j][5] == arr[i]) {
        totalMarketCap += parseFloat(marketCapData[j][6]*(10**9))
    }
    }
    console.log(`the total market cap of all ${arr[i]} is ${totalMarketCap}`)
}


//i love my classmates