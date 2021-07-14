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


/* const members = ['j', 'm', 't', 'g', 's', 'h', 'y']

const team1 = []
const team2 = []

for (let i = 0; i < members.length; i++) {
    if (Math.random() > 5) {
        team1.push(members[i])
    } else {
        team2.push(members[i])
    }
    
}

while (team1.length > 4) {
    team2.push(team1.pop())
}

while (team2.length > 4) {
    team1.push(team2.pop())
}

console.log(team1, team2) */