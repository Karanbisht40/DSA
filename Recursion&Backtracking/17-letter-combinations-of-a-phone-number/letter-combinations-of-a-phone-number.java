class Solution {
      String[] options = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
      public void printKeypad(int idx, String output,String digits, List<String> ans) {
        // Base case
        if (idx == digits.length()) {
            ans.add(output);
            return;
        }
           // Get current digit
        int num = digits.charAt(idx) - '0';
        // Get corresponding letters
        String s1 = options[num];
        // Try every letter
        for (int i = 0; i < s1.length(); i++) {
            // Recursive call
            printKeypad(idx + 1,output + s1.charAt(i),digits,ans);
        }

     }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        // Empty input
        if (digits.length() == 0) {
            return ans;
        }

        printKeypad(0, "", digits, ans);
        return ans;
    }

}