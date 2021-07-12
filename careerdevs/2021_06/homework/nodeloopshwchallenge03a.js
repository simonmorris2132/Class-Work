var inputNumber = 7;
var total = 1;

for (i = 0; i < inputNumber; i++){
    total = total * (inputNumber - i);
}

console.log(inputNumber + ' = ' + total);