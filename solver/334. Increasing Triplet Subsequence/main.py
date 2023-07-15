def increasingTriplet(nums) -> bool:
    length = len(nums)
    if length < 3:
        return False

    first = second = 1

    for num in nums:
        if num <= first:
            first = num
        elif num <= second:
            second = num
        else:
            return True

    return False    

print(increasingTriplet([5,4,3,2,1]))

first = 1
second = 5

