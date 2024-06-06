function isPalindrome(number) {
    if (number < 0) {
        number = Math.abs(number);
    }
    const originalNumber = number;
    let reverseNumber = 0;

    while (number > 0) {
        const digit = number % 10;
        reverseNumber = (reverseNumber * 10) + digit;
        number = Math.floor(number / 10);
    }

    return originalNumber === reverseNumber;
}

// Example usage:
console.log(isPalindrome(-121)); 
console.log(isPalindrome(-123)); 