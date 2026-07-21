class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mymap = {}

        for i in range(0, len(nums)):
            num = nums[i]
            complement = target - num

            if complement in mymap:
                return [mymap[complement], i]
            
            mymap[num] = i
        
        return [-1, -1]
''' 
| Java HashMap     | Python dict              |
| ---------------- | ------------------------ |
| `put(k, v)`      | `d[k] = v`               |
| `get(k)`         | `d.get(k)` or `d[k]`     |
| `containsKey(k)` | `k in d`                 |
| `remove(k)`      | `del d[k]` or `d.pop(k)` |
| `size()`         | `len(d)`                 |
| `clear()`        | `d.clear()`              |
| `keySet()`       | `d.keys()`               |
| `values()`       | `d.values()`             |
| `entrySet()`     | `d.items()`              |
 '''