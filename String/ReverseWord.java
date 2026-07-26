class Solution {
    public String reverseWords(String s) {
          // Reverse the entire string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        String ans = "";
        int n = sb.length();
        int i = 0;

        while (i < n) {

            // Skip spaces
            while (i < n && sb.charAt(i) == ' ') {
                i++;
            }

            if (i == n) break;

            StringBuilder word = new StringBuilder();

            // Collect one word
            while (i < n && sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
                i++;
            }

            // Reverse the word
            word.reverse();

            if (ans.length() == 0) {
                ans = word.toString();
            } else {
                ans += " " + word.toString();
            }
        }

        return ans;
    }
}