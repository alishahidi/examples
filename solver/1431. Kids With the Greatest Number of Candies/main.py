def kidsWithCandies(candies: List[int], extraCandies: int) -> List[bool]:
    max_candies = max(candies)
    result = [(candy + extraCandies) >= max_candies for candy in candies]
    return result
