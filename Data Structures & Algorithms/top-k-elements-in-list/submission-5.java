class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }

        int untilk = 0;
        List<Integer> list = new ArrayList<>();

        int max = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue(); 
            int key = entry.getKey();

            pq.offer(new int[]{key, value});
        } 

        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = pq.poll()[0];
        }

        return res;
    }
}
