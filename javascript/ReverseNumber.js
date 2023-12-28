function DoReverse(num){
    return Number(num.toString().split("").reverse().join(""));
}
console.log(DoReverse(12345))