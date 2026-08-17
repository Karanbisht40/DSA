import java.util.ArrayList;

public class Generate_all_binary_strings {
    
    
    private void generate(int idx, int n, char[] curr, ArrayList<String> res) {
        
        // Base case
        if (idx == n) {
            res.add(new String(curr));
            return;
        }
        
        // Put 0
        curr[idx] = '0';
        generate(idx + 1, n, curr, res);
        
        // Put 1
        curr[idx] = '1';
        generate(idx + 1, n, curr, res);
    }
    
    public ArrayList<String> binstr(int n) {
        
        ArrayList<String> res = new ArrayList<>();
        
        char[] curr = new char[n];
        
        generate(0, n, curr, res);
        
        return res;
    }
}

