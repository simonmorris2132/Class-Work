function titleCase(str) {
    let newStr = str.toLowerCase().split(" ")
    
    for (let i = 0; i < newStr.length; i++) {
      newStr[i] = newStr[i][0].slice(0, 1).toUpperCase() + newStr[i].slice(1)
    }
    
    return newStr.join(" ");
  }
  
  console.log(titleCase("I'm a little tea pot"));