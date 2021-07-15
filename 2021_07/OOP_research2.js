/* 
Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

Examples:
getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13

getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31

getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0

Notes:
You can expect only positive integers for vote counts. 
*/

/* function getVoteCount(votes) {
    const vote = {upvotes: 12, downvotes: 0 } 
	return  upvotes - downvotes                        /*I hate you gabe for cursing me on this day*/

//}
//console.log(vote);
/* 
Make a function that looks through an array of objects (first argument) and returns an array of all objects that have matching name and value pairs (second argument). Each name and value pair of the source object has to be present in the object from the collection if it is to be included in the returned array.

For example, if the first argument is [{ first: "Romeo", last: "Montague" }, { first: "Mercutio", last: null }, { first: "Tybalt", last: "Capulet" }], and the second argument is { last: "Capulet" }, then you must return the third object from the array (the first argument), because it contains the name and its value, that was passed on as the second argument.
*/

whatIsInAName([{ first: "Romeo", last: "Montague" }, { first: "Mercutio", last: null }, { first: "Tybalt", last: "Capulet" }], { last: "Capulet" });

function whatIsInAName(collection, source) {
    var arr = [];
    
  /* 
    collection.forEach( testObj => {
        console.log(testObj)
        let passedTest = true
        if (passedTest == true) { //this also works
            arr.push(testObj)
        }

    } ) */



    for (let i = 0; i < collection.length; i++) {
        const testObj = collection[i];
        let passedTest = true;
        console.log(source, 'test:',testObj)
        for (const key in source) {
            
            if (source[key] != testObj [key]) {
                passedTest = false;
            }

        }
        
        if (passedTest == true) {
            arr.push(testObj)
        }

    }
    console.log(arr);
    return arr;
  }
  
/*
The 50-30-20 strategy is a simple way to budget, which involves spending 50% of after-tax income on needs, 30% after tax income on wants, and 20% after-tax income on savings or paying off debt.

Given the after-tax income as ati, what you are supposed to do is to make a function that will return an object that shows how much a person needs to spend on needs, wants, and savings.

Examples:

fiftyThirtyTwenty(10000) ➞ { "Needs": 5000, "Wants": 3000, "Savings": 2000 }

fiftyThirtyTwenty(50000) ➞ { "Needs": 25000, "Wants": 15000, "Savings": 10000 }

fiftyThirtyTwenty(13450) ➞ { "Needs": 6725, "Wants": 4035, "Savings": 2690 } 
*/

function fiftyThirtyTwenty(ati) {
	
    let ten = ati / 10
    let needs = ten * 5
    let wants = ten * 3
    let savings = ten * 2

    const tai = {
        'Needs' : needs,
        'Wants' : wants,
        'Savings' : savings
    }
    return (tai)
}


