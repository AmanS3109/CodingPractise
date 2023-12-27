var str = "Aman is Genius";

var savedStr = str.split(" ").map(function(word){
    return word.split("").reverse().join("");
})

console.log(savedStr.join(" "));