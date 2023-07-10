def gcdOfStrings(str1: str, str2: str) -> str:
    str1 = str1.upper()
    str2 = str2.upper()
    if len(str2) > len(str1):
        str1, str2 = str2, str1
    if not str1.startswith(str2):
        return ""
    exported_string = ""
    for i in str2:
        exported_string += i
        checked_string = ""
        while len(checked_string) < len(str1):
            checked_string += exported_string
        if checked_string == str1:
            from math import gcd
            return str1[:gcd(len(str1), len(str2))]

    return ""
  
str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX"
str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"

"""
ABCABC
ABC
ABCABCABC

ABABAB
ABABABAB



"""

print(gcdOfStrings(str1, str2))