/* 
Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

Examples:
getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13

getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31

getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0

Notes:
You can expect only positive integers for vote counts. 
*/

function getVoteCount(votes) {
	
}

/*  */


function whatIsInAName(collection, source) {
    var arr = [];
    // Only change code below this line
  
    collection.forEach( testObj => {
        console.log(testObj)
    } )

   /*  for (let i = 0; i < collection.length; i++) {
        const testObj = collection[i]
        
        console.log(testObj) //this also works
    }
 */
    // Only change code above this line
    return arr;
  }
  
  whatIsInAName([{ first: "Romeo", last: "Montague" }, { first: "Mercutio", last: null }, { first: "Tybalt", last: "Capulet" }], { last: "Capulet" });