//Home Work assignments:


//Homework #1
//1. Your program should count and output the count number before each students first and last name
//Example: 
//1. Arnell Milhouse  
//2. Joel Fernandez

//Homework #2
//Count the total number of students, however, only output the total number after outputting all of the students names.
//Example:
//Arnell Milhouse
//Lujein Suliman
//Total Students: 2

//Homework #3
//Have console log output the following:
//Example:
//Forest Gump, contains 10 letters
//Arnell Milhouse, contains 14 letters


var firstNames = ["Arnell", "Mike", "John", "Jeff", "Taylor", "Riches", "Joel", "Freddy", "Elvis", "Brett", "Lujein", "Gabriel", "Simon", "Manny", "Pierre"]

var lastNames = ["Milhouse", "Ferrara", "Gillard", "Mitsou", "Blais", "Loung", "Fernandez", "Canido", "Aibangbee", "Marcotte", "Suliman", "Sherman", "Morris", "Lee", "Edouard Fils"]

var num = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

for (i=0; i < firstNames.length; i++){

  var names = firstNames[i] + " " + lastNames[i];

  var let = ", contains " + names.length + " letters";

  var total = names
  
  console.log(`${i + 1}${". "}${names}${let}`)
}

console.log(`${"Total class members: "}${total.length}`)

//slapping a cigarette into a salad to ruin a vegans day
//jimmy say something oh god
//chasing squirrels because that's what god would want
//c++ is better
//where is my son