n, k = map(int, input().split())
numbers = list(map(int, input().split()))

b = []

for i in range(0, n):
    print(i * k)
    b.append(numbers[i] - i * k)

print(b)
b.sort()

median = None
if n % 2 != 0:
    median = b[(n + 1) // 2 - 1]
else:
    median = b[n //  2 - 1]

ans = 0
for i in range(0, n):
    ans += abs(b[i] - median)
    
print(median, ans)