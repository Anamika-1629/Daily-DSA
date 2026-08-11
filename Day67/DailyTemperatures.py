from typing import List

class SolutionI:
    def dailyTemperatures(self, temp: List[int]) -> List[int]:
        res = [0] * len(temp)

        for i in range(len(temp)):
            for j in range(i + 1, len(temp)):
                if temp[j] > temp[i]:
                    res[i] = j - i
                    break

        return res


# Main function
temp = list(map(int, input().split()))

obj = SolutionI()
ans = obj.dailyTemperatures(temp)

print(*ans)