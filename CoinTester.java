//creates instances of the Coin class and tests their attirbutes and behaviors
public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    System.out.println("My coin = "+myCoin);
    Coin yourCoin = new Coin();
    System.out.println("Your coin = "+yourCoin);
    int headCount = 0;
    final int NUM_FLIPS = 10;
    System.out.println("Flipping a coin "+NUM_FLIPS+" times...");
    for (int i=1; i<=NUM_FLIPS; i++){
      Coin countCoin = new Coin();
      System.out.println("Flip #"+i+" = "+countCoin);
      if (countCoin.toString().equals("Heads")){
        headCount++;
      }
    }
    System.out.println("Number of heads = "+headCount);
    myCoin.setFace(0);
    System.out.println(myCoin);
  }
}
