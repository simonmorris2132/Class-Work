/* 
Output the sum of all dollar values
Example output: 
The total market cap of all Dollars is 12,424,000,000,000.
*/

/*
Index,
0: ID
1: First name
2: Last name
3: E-Mail
4: Gender
5: Currency
6: Stock Market Capital
*/

let marketCapData = require (`./marketcapdata`)
let totalMarketCap = 0;
for (let i = 0; i < marketCapData.length; i++) {
    let marketCap = parseInt(marketCapData[i][6] * (10**9))
    if (marketCapData[i][5] == "Dollar" && marketCapData[i][6] != "n/a") {
        totalMarketCap += marketCap
    }
}
console.log(`the total market cap of all Dollars is ${totalMarketCap}`)