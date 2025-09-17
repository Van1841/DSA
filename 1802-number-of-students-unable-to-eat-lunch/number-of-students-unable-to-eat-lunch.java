class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i : students){
            q.offer(i);
        }

        int idx = 0;
        int rotate = 0;

        while(!q.isEmpty() && idx < sandwiches.length){
            if(q.peek() == sandwiches[idx]){
                q.poll();
                idx++;
                rotate = 0;
            }else{
                q.offer(q.poll());
                rotate++;
            }
            if(rotate == q.size()) break;
        }
        return q.size();
    }
}