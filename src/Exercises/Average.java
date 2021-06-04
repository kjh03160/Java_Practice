package Exercises;

public class Average {
    public double computeAverage(int[] intArray){
        double result = 0;
        for (int i = 0; i < intArray.length; i++){
            result += intArray[i];
        }
        return result / intArray.length;
    }

    public double computeAverage2(int[] intArray){
        double result = 0;
        for (int num : intArray){
            result += num;
        }
        return result / intArray.length;
    }

    public static void main(String[] args) {
        Average finder = new Average();

        // 테스트 1
        int[] testArray1 = {3, 7, 3};
        System.out.println(finder.computeAverage(testArray1));

        // 테스트 2
        int[] testArray2 = {1, 3, 4, 7};
        System.out.println(finder.computeAverage(testArray2));

        // 테스트 3
        int[] testArray3 = {4};
        System.out.println(finder.computeAverage(testArray3));

        // 테스트 4
        int[] testArray4 = {1, 2, 3, 4, 5};
        System.out.println(finder.computeAverage(testArray4));
    }
}
