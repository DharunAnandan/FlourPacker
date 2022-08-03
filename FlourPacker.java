public class FlourPacker{
    public static void main(String[] args) {
        System.out.println(canPack(1,2,8));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
            return false;
        }

        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
    }
}
