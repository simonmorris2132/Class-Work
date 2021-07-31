var count = 0;
// card == 10 || [`J`, `Q`, `K`, `A`].includes(card)
function cc(card) {
  // Only change code below this line
if ( card > 2 && card <= 6 ){
    count++ 
} else if ( card == 10 || typeof card == "string") {
    count--
}
if (count >0){
    return count + " bet " + card
}
  return count + " hold " + card
  // Only change code above this line
}

console.log(cc(2));
console.log(cc(3));
console.log(cc(7));
console.log(cc('K'));
console.log(cc('A'));
