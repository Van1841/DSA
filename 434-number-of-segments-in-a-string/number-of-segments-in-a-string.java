class Solution {
    public int countSegments(String s) {
        String sep[] = s.split("\\s+");
        int count = 0;
        for(int i = 0; i <sep.length ; i++){
            if(!sep[i].isEmpty()){
                count++;
            }
        }
        return count;


        // return sep.length;

    }
}