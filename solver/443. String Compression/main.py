def compress(chars):
    if not chars:
        return []

    groups = [[chars[0]]]

    for char in chars[1:]:
        if char in groups[-1][0]:
            groups[-1].append(char)
        else:
            groups.append([char])

    result = []

    for group in groups:
        group_length = len(group)
        result.append(group[0])
        if group_length > 1:
            digits = []
            while group_length > 0:
                digits.append(str(group_length % 10))
                group_length //= 10
            for digit in reversed(digits):
                result.append(digit)

    chars.clear()
    chars.extend(result)

    return len(chars)
