class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // left shift
        if((n &(1<<k)) !=0){
            return true;
        }
        return false;
    }
}