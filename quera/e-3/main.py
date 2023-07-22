n, k = map(int, input().split())
numbers = list(map(int, input().split()))

ans = float("inf")
min_val = min(numbers)
max_val = max(numbers)

for i in range(min_val - (n - 1) * k, max_val):
    cost = 0
    for j in range(0, n):
        cost += abs(j + (j - 1) * k - numbers[j])
        
    if cost < ans:
        ans = cost

print(ans)