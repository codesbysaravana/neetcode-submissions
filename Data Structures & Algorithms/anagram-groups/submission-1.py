class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for i in range(len(strs)):
            s = strs[i]
            sortedofs = "".join(sorted(s))

            if sortedofs not in hashmap:
                hashmap[sortedofs] = []
            
            hashmap.get(sortedofs).append(s)
        
        res = []
        for value in hashmap.values():
            res.append(value)
        
        return res;
