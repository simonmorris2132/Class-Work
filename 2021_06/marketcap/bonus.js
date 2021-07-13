let marketCapData = require (`./marketcapdata`)


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
