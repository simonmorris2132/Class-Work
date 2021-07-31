let fileSystem = require('fs')
const {splice} = require("./marketcapdata")

let rawData = fileSystem.readFileSync("./userdatacopy.txt", 'utf-8')

let parseData = rawData.split('\n');

let newData = [];
for (let i = 0; i < parseData.length; i++) {
   if (parseData[i][0] == "[" && isNaN(parseInt(parseData[i][2])) == false) { //checks first character is a [ and next is a number after space
    
    let subArray = parseData[i].replace('[', '').replace(']', '').trim().split(',')

    //console.log(subArray);
    
    newData.push(subArray)
    
   
    //keep and convert to subarray
   } 
    
    /* parseData.splice(i, 1)
    i-- */
    //remove the element
}
//Challenge 1:

function decToInt (arr) {

    for (let i =0; i < arr.length; i++) {
        let funds = arr[i][6]
        if (funds[funds.length - 1] == "B" && funds != "n/a") {
            funds = funds.replace("$", "").replace("B", "")
            funds = parseFloat(funds)*1000000000
            newData[i][6] = "$ " + funds.toLocaleString() + " Billion"
            console.log(`$${funds.toLocaleString()} Billion`)
        } else if (funds[funds.length - 1] == "M" && funds != "n/a") {
            funds = funds.replace("$", "").replace("B", "")
            funds = parseFloat(funds)*1000000
            newData[i][6] = "$" + funds.toLocaleString() + "Million"
            console.log(`$${funds.toLocaleString()} Million`)
        }
    }
}
decToInt(newData)

console.log(newData[0][6])

//Challenge 2:

for (let i = 0; i < newData.length; i++) {
    if (newData[i][5] == "Dollar" && newData[i][6] != "n/a") {
        console.log(`${newData[i][1]} ${newData[i][2]} is ${newData[i][4]} and has ${newData[i][6]} in stocks.`)
    }
    
}

//Challenge 3:

let dollarTotal = 0
for (let i = 0; i < newData.length; i++) {
    if (newData[i][5] == "Dollar" && newData[i][6] != "n/a") {
        dollarTotal = dollarTotal + newData[i][6]
    }
}
console.log(dollarTotal)
