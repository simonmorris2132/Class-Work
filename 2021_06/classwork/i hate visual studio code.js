let riders = [["Arnell"], ["Carlos", "Keith", "Sergio"],["Junior", "Loubna", "Margie"], ["Travis", "Matt", "Gabriel"], ["Elvis", "Jackie", "Saimer"]]



var rows = 0;
function sixOrLess(array){
    for (var i = 0; i < array.length; i++) {
        for (var j = 0; j < array[i].length; j++) {
            for (var k = 0; k < array [j].length; k++) {
                console.log(array[i][j][k])
            }
        }
    }
}
sixOrLess(riders)