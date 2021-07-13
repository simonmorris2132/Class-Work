let carNames = ["Jeep Wrangler", "Toyota Camry", "Hyundai Elantra"] 
let carPrice = [20000, 15000, 22000]
let carMiles = [1000, 5000, 100]

//must create a for loop to go through the array

for (let i = 0; i < carNames.length; i++) {
    //console.log(carNames[i], carPrice[i], carMiles[i])
}

let carData = [ 
    ["Jeep Wrangler", 20000, 1000], 
    ["Toyota Camry", 15000, 5000], 
    ["Hyundai Elantra", 22000, 100], 
    ["Ford", 100, 45000]
]

for (let i = 0; i < carData.length; i++) {
    console.log("Name:", carData[i][0], "Price:", carData[i][1], "Mileage:", carData[i][2])
}