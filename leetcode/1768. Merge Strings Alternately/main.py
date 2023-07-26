def mergeAlternately(word1: str, word2: str) -> str:
	exported_word = ""
	tmp_word = ""
	word2_iter = 0
	for sub_word1_iter in range(0, len(word1)):
		if sub_word1_iter == 0:
			exported_word += word1[sub_word1_iter]
		else:
			tmp_word = word1[sub_word1_iter]
			if word2_iter < len(word2):
				exported_word += word2[word2_iter]
				word2_iter += 1
			exported_word += tmp_word
			tmp_word = ""

	if(len(word1) <= len(word2)):
		exported_word += word2[word2_iter:]
	return exported_word


word1 = input("Enter word1: ")
word2 = input("Enter word2: ")

print(mergeAlternately(word1, word2))