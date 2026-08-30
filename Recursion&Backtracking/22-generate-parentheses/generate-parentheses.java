class Solution {

    public static void helper(ArrayList<String> ls, int n, int oc, int cc, String s){
    // When we haveequal no of oc and cc
        // the string is complete and valid → store it
        if(oc == n &&  cc==n){
              ls.add(s);
              return;
        }

        if(oc< n){
            helper( ls,n, oc+1, cc, s+"(");
        }
        if(cc< oc){
            helper(ls, n, oc, cc+1, s+")");
        }

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ls = new ArrayList<>();

        int oc =0;
        int cc=0;
        helper(ls,n,oc,cc,"");
        return ls;
    }
}