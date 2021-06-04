package TryCatch;

public class TryCatch {
    public static void main(String[] args){
        int[] intArray = new int[5];
        for (int i = 0; i < 10; i++){
            try {
                System.out.println(intArray[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }
}
