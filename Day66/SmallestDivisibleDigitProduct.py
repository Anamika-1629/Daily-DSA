class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        while True:
            p = 1
            nm = n

            while nm > 0:
                p *= nm % 10
                nm //= 10

            if p % t == 0:
                return n

            n += 1


# Main function
n, t = map(int, input().split())

obj = Solution()
print(obj.smallestNumber(n, t))