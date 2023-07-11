from math import prod

def productExceptSelf(nums):
  n = len(nums)
  prefix_product = [1] * n
  suffix_product = [1] * n
  result = [1] * n

  # Calculate prefix product
  for i in range(1, n):
      prefix_product[i] = prefix_product[i - 1] * nums[i - 1]

  # Calculate suffix product
  for i in range(n - 2, -1, -1):
      suffix_product[i] = suffix_product[i + 1] * nums[i + 1]

  # Multiply prefix and suffix products
  for i in range(n):
      result[i] = prefix_product[i] * suffix_product[i]

  return result


print(productExceptSelf([1, 4, 5, 1, 3, 6, 8, 9]))