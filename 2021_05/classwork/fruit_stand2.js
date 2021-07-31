var fruitNames = ["Apples", " Oranges", " Grapes"]
var fruitTypes = [
    ["Gala", " Fuji", " Honeycrisp"],
    [" Navel", " Cara Cara", " Blood"],
    [" Moon Drops", " Concord", " Cotton Candy"]
]

var price = [
    [1, 1, 1],
    [1, 2, 2],
    [2, 3, 2]
]

var salesQuantity = [
    [20, 32, 27],
    [15, 17, 14],
    [15, 25, 12]
]
var countPrice = 0
var countAmt = 0
function myFunction() {
    for (var i = 0; i < price.length; i++) {
        for (var j = 0; j < price[i].length; j++) {
            countAmt += salesQuantity[i][j]
            countPrice += price[i][j] * salesQuantity[i][j]
            console.log("Felicia sold " + salesQuantity[i][j] + " " + fruitTypes[i][j] + " " + fruitNames[i] + " at the price of $" + price[i][j] + " each, for a total of $" + (price[i][j] * salesQuantity[i][j]) + ".")
        }
    }
    console.log("Felicia sold a total of " + countAmt + " fruits the whole day, for a total daily sales amount of $" + countPrice + ".")
}
myFunction();
