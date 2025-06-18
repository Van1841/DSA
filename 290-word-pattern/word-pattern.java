class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> vb = new HashMap<>();
        String[] arr = s.split("\\s+");

        if (pattern.length() != arr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];

            if (vb.containsKey(ch)) {
                if (!vb.get(ch).equals(word)) {
                    return false; // mismatch in existing mapping
                }
            } else {
                if (vb.containsValue(word)) {
                    return false; // word already mapped to another key
                }
                vb.put(ch, word);
            }
        }

        return true;
    }
}
