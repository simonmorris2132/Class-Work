/*
1. Array that stores three types of fruit; apples, oranges and grapes
2. Each fruit type should have three different types
3. Every fruit should have a unique price (please use normal prices)
4. There should be an array called salesQuantity that stores the total number of sales for each fruit
5. finally you should output a sales total summary for each fruit type.
*/


var fruitNames = ["Apples", " Oranges", " Grapes"]
var fruitTypes = [
    ["Gala", " Fuji", " Honeycrisp"],
    [" Navel", " Cara Cara", " Blood"],
    [" Moon Drops", " Concord", " Cotton Candy"]
]

var price = [2, 3, 2]
var salesQuantity = [20, 32, 27]
var countPrice = 0
var countAmt = 0
function myFunction () {
    for (var i = 0; i < price.length; i++) {
    countAmt += salesQuantity[i]
        countPrice += price[i]*salesQuantity[i]
            console.log("Felicia sold "  + salesQuantity[i] + " " + fruitNames[i] + " at the price of $" + price[i] + " each, for a total of $" + (price[i]*salesQuantity[i]) + ".")
 }
 console.log("Felicia sold a total of " + countAmt + " fruits the whole day, for a total daily sales amount of $" + countPrice + ".")
 console.log("Felicia had " + fruitTypes + ".")
}
myFunction();
