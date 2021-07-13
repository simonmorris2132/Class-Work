// Given the array find out how many students passed the quiz and how many failed. There should be just one output that reads… ___ students passed the quiz, and ___ students failed.
// let ourQuizGrades = [72, 89, 95, 90, 77, 80, 49, 56, 71, 12, 72, 88, 43, 69]
// let failCount = 0
// let passCount = 0
// for(let i = 0; i < ourQuizGrades.length; i++){
//     let number = ourQuizGrades[i];
//     if(number < 70){
//         failCount++
//         // console.log(failCount);
//     } else {
//         passCount++
//             // console.log(passCount);
//     }
// }
// console.log(`${passCount} students passed the quiz, and ${failCount} students failed.`);
// CHALLENGE #2 - Output a sentence for each student and say if they passed or not, also include the grade they got.
let ourQuizGrades = [72, 89, 95, 90, 77, 80, 49, 56, 71, 12, 72, 88, 43, 69]
let failCount = 0
let passCount = 0
let ourQuizGradesNames = ["Bob", "Jill", "Billy", "Grace", "Jen", "Tom", "Jack", "Alex", "Michelle", "Bill", "Neil", "Sam", "Henry", "Dave"]
let passingGradesArray = []
for (let i = 0; i < ourQuizGrades.length; i++) {
    if (ourQuizGrades[i] <= 69) {
        failCount++
        console.log(`${ourQuizGradesNames[i]} failed with a ${ourQuizGrades[i]}.`);
    }
    if (ourQuizGrades[i] > 69) {
        passCount++
        console.log(`${ourQuizGradesNames[i]} passed with a ${ourQuizGrades[i]}.`);
        passingGradesArray.push(ourQuizGrades[i])
        const sortGrades = (a,b) => a-b
        ourQuizGrades.sort(sortGrades)
    }
}

//thank you jackie and jeff for the help <3