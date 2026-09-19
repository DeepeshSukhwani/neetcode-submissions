class Solution {
    public boolean checkInclusion(String s1, String s2) {

         if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1map = new HashMap<>();
        HashMap<Character, Integer> s2map = new HashMap<>();

        // Build frequency map for s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s1map.put(ch, s1map.getOrDefault(ch, 0) + 1);
        }

        // Build first window of s2
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            s2map.put(ch, s2map.getOrDefault(ch, 0) + 1);
        }

        // Check first window
        if (s1map.equals(s2map)) {
            return true;
        }

        int left = 0;

        // Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character from right
            char rightChar = s2.charAt(right);
            s2map.put(
                rightChar,
                s2map.getOrDefault(rightChar, 0) + 1
            );

            // Remove character from left
            char leftChar = s2.charAt(left);
            s2map.put(leftChar, s2map.get(leftChar) - 1);

            // Remove key if frequency becomes 0
            if (s2map.get(leftChar) == 0) {
                s2map.remove(leftChar);
            }

            left++;

            // Check current window
            if (s1map.equals(s2map)) {
                return true;
            }
        }

        return false;

    }

}
