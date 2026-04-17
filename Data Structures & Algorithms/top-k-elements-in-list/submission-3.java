class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            heap.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = heap.poll()[0];
        }
        return res;
    }
}
