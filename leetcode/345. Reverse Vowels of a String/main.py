def reverseVowels(s: str) -> str:
    vowels = ["a", "e", "i", "o", "u"]
    founded_vowel = []
    for c in s:
        if c in vowels:
            founded_vowel.append(c)
    print(founded_vowel)
    result = []
    for c in s:
        if c in vowels:
            result.append(founded_vowel.pop())
        else:
            result.append(c)
    return "".join(result)

print(reverseVowels(input("Please enter str: ")))
