/* function titleCase(str) {
    let newStr = str.toLowerCase()
    
    for (let i = 0; i < newStr.length; i++) {
      newStr[i] = newStr[i][0].slice(0, 1).toUpperCase() + newStr[i].slice(1) 
    }
    
    return newStr;
  }
  
  console.log(titleCase("I'm a little tea pot")); */

  /* Section 1: Split
  Split takes a string value and creates an array of strings seperated by the argument given. Split is a non-destructive method. (This means it does not alter the str data where the method is called from.)
  */

  /* Section 2: Join
  Join takes the array created by .split and brings it together. (Any sub-string created will be brought together into one string.)
  */

  function splitStr(value, arg) {
    let str = []
    
    for (let i = 0; i < value.length; i++) { //use a while loop too dum dum
        if (value.slice(i, i + arg.length) == arg) {
            str.push(value.slice(0, i)) /* pushing into empty array str and trying to find a space in the value.*/
            value = value.slice(i + arg.length) // could also put in value.length
           console.log(i, value)
           i = 0
        }
        
    }
    str.push(value) // push in whatever is left over
    console.log(str)
  }

  splitStr("I'm a little tea pot", " ")

  /* while (value.indexOf(arg) != -1) {} */