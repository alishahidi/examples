def gcdOfStrings(str1: str, str2: str) -> str:
    if not str1.startswith(str2):
        return ""
    
    remaining_str = str1
    while (remaining_str.startswith(str2) and not remaining_str.endswith(str2)):
      remaining_str = remaining_str[len(str2):]
  
str1 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"
str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"

print(gcdOfStrings(str1, str2))