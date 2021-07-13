 let ourQuizGrades = [
     ['Bob', 72], ['Jill', 89],
     ['Billy', 95], ['Grace', 90],
     ['Jen', 77], ['Tom', 80],
     ['Jack', 49], ['Alex', 56],
     ['Michelle', 71], ['Bill', 12],
     ['Neil', 72], ['Sam', 88],
     ['Henry', 43], ['Dave', 69]
 ]
 let failCount = 0
 let passCount = 0
 let passingGradesArray = []
 for (let i = 0; i < ourQuizGrades.length; i++) {
     for (let j = 0; j < ourQuizGrades[i].length; j++) {
         let grade = ourQuizGrades[i][j]
         let studentNames = ourQuizGrades[i][0]
         const sortGrades = (a , b) => a[1]-b[1]
         ourQuizGrades.sort(sortGrades)
 console.log(`${studentNames} failed with a ${grade}.`);
 console.log(`${studentNames} passed with a ${grade}.`);
          if (grade < 70) {
             failCount++
             console.log(`${studentNames} failed with a ${grade}.`);
         }
         if (grade >= 70) {
             passCount++
             console.log(`${studentNames} passed with a ${grade}.`);
             passingGradesArray.push(ourQuizGrades)
         }
        }
    }
