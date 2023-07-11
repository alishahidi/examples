def reverseWords(s: str) -> str:  
  founded_word = []
  while s:
    s = s.strip()
    word = s.split(None, 1)[0]
    founded_word.append(word)
    s = s[len(word):]
    
  return " ".join(founded_word[::-1])
