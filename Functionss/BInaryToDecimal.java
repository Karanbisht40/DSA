

public class BInaryToDecimal {

    public static void Convt(int BinNum){
        int num = BinNum;
        int pow=0;
        int dec=0;

        while (BinNum>0) {
            int lasdtDigit = BinNum% 10;

            dec = dec +(lasdtDigit * (int)Math.pow(2, pow));

            pow++;
            BinNum = BinNum/10; // number ko chota krte rhgege
        }
        System.out.println("decimal of"+ num+" ="+ dec );

    }
    public static void main(String[] args) {
        Convt(111);
    }
}
