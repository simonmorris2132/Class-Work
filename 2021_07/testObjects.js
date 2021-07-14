const fruitNames = ['Apple', 'Kiwi', 'Coconut']
const fruitPrices = [1, .5, 3]
const fruitSales = [10, 20, 5]

const fruits = []

for (let i = 0; i < fruitNames.length; i++) {
    
    const fruitObj = {Name: fruitNames[i], Price: fruitPrices[i], Sales: fruitSales[i]}

    fruits.push(fruitObj)

}

console.log(fruits)

fruits.forEach((fruit, i) => {
    
    fruits[i] = {...fruit, Profit: fruit.Price * fruit.Sales}

})

console.log(fruits)