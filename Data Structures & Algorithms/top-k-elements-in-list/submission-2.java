class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        // Loop through nums, add integer to count map
        // Key:Value = Number:Frequency
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Use heap to return K frequent
        // Heap will store [freq, number]
        // change to min heap for better time complex
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        //Loop through the entry set of count and put values in heap
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            // keep heap size to only hold the k largest elements
            if(heap.size() > k){
                heap.poll();
            }
        }

        // return the k largest freqs in heap
        int[] res = new int[k];
        for(int i=0; i < k; i++){
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
