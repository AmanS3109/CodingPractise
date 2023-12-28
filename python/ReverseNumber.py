def reverse_number(num):
    """Reverses the digits of an integer."""

    reversed_num = 0
    while num > 0:
        digit = num % 10  # Extract the last digit
        reversed_num = reversed_num * 10 + digit  # Build the reversed number
        num //= 10  # Remove the last digit from the original number
    return reversed_num

if __name__ == "__main__":
    reversed_result = reverse_number(12345)
    print(reversed_result)
