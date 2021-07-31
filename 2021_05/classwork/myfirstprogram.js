var names = [`simon`, `Manny`, `Djimmy`, `Brett`, `elvis`, `freddy`, `jacques`, `jeff`, `john`, `lujein`, `mike`, `rich`, `taylor`,]

var lastNames = [`morris`, `lee`, `edmond`, `mitsou`, `aibangbee`, `marcotte`, `suliman`, `canido`, `fernandez`, `luong`, `ferrara`, `gillard`, `fils`,]
var
for (var i = 0; i < names.length; i++){
var nameLength = names[i].length + lastNames[i].length;
console.log(names[i] + " " + lastNames[i] + " contains " + nameLength + " letters");
}