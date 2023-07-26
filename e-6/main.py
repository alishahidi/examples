def pow2(x):
    if x == 0:
        return 1
    t = pow2(x // 2)
    if x % 2 == 0:
        return t * t
    return t * t * 2

print(pow2(3))
