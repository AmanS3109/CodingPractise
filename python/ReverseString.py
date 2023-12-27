str = "Aman is Genius"
print(str[::-1])
 
#another method

def reverse(str):
    s = ""
    for ch in str:
        s = ch + s
    return s
print(reverse("Aman is Genius"))