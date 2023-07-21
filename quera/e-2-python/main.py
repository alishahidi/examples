numbers = []
cases = []
n, q = map(int, input().split())
numbers = list(map(int, input().split()))
for _ in range(q):
    cases.append(int(input()))

max_num = max(numbers)

cnt = [0] * (max_num + 1)
ps = [0] * (max_num + 1)

for i in range(0, n):
    cnt[numbers[i]] += 1
    
for i in range(0, max_num):
    ps[i] = ps[i - 1] + cnt[i]
    
for case in cases:
    if case > max_num:
        print(n)
        continue;
        
    print(ps[case - 1])
