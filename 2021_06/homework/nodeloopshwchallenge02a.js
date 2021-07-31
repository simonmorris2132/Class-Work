let numbers = [838,505,490,16,221,985,933,856,142,694,997,137,295,95,121,249,350,763,616,55,8,54,875,968,805,274,98,38,779,130,472,169,920,530,694,380,988,426,382,505,514,72,545,327,329,953,539,727,896,318,201,518,284,196,342,145,595,547,938,2,77,593,976,961,927,661,595,983,97,34,245,271,767,541,169,620,338,974,650,218,180,153,664,31,104,706,78,646,712,523,748,817,89,128,850,738,607,18,665,859]

//I wanna find the greatest number in the array.
var largest = 0;
function largestNumber(array) {
    for (let i = 0; i < array.length; i++) {
        if (numbers[i] > largest) { /*This basically looks thru the array and looks at each element before to see if its larger than the current one.*/
            largest = array[i]
        }
    }
    console.log("The largest number is " + largest + ".")
}

largestNumber(numbers)



//why am i so bad at coding lol
