def moveZeroes(nums):
  non_zeros_count = 0
  for num in nums:
      if num != 0:
          nums[non_zeros_count] = num
          non_zeros_count += 1

  while non_zeros_count < len(nums):
      nums[non_zeros_count] = 0
      non_zeros_count += 1