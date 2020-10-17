package Crispen_Gari.com;
import java.util.Random;
class Coin{
    private boolean coinFace;
    Random random = new Random();
   Coin(){
      this.coinFace = random.nextBoolean();
   }
   void flip(){
       this.coinFace = random.nextBoolean();
   }
   public String coinFace(){
        return this.coinFace? "Tail".toString() : "Head".toString();
   }
}
public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        int max = 10_000 ; // same as saying 10000 [10_000]
        int countHead =0, countTail=0;
        for (int i = 0; i < max; i++) {
            // flip the coin first
            coin.flip();
            // check if head or tail and count accordingly
            if(coin.coinFace() == "Tail"){
                countTail ++;
            }else {
                countHead++;
            }
        }
        // Print the number of tails and heads accordingly
        System.out.printf("%d: tail(s) \n%d: head(s)", countTail, countHead);
    }
}
