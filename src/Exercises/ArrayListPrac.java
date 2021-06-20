package Exercises;

import java.util.ArrayList;

public class ArrayListPrac {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList <Integer> remainPeople = new ArrayList<>();
        ArrayList <Integer> extractedPeople = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            remainPeople.add(i);
        }
        int count = 0;

        while (remainPeople.size() != 1){
            for (int i = 0; i < remainPeople.size(); i++){
                count++;
                if (count == k){
                    System.out.println(remainPeople.get(i) + "번 군사가 죽습니다");
                    extractedPeople.add(i);
                    count = 0;
                }
            }
            for (int x = extractedPeople.size() - 1; x >= 0; x--){
                int index = extractedPeople.get(x);
                remainPeople.remove(index);
            }
            // ArrayList.get() 하면 int가 아닌 Object가 리턴되어 다른 remove 함수가 호출된다.
//            for (int x = extractedPeople.size() - 1; x >= 0; x--){
//                System.out.println(remainPeople.remove(extractedPeople.get(x)));
//            }
            extractedPeople.clear();
        }
        return remainPeople.get(0);
    }

    public static int getSurvivingIndex2(int n, int k) {
        ArrayList <Integer> remainPeople = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            remainPeople.add(i);
        }
        int killIndex = 0;

        while (remainPeople.size() != 1){
            killIndex = (killIndex + k - 1) % remainPeople.size();
            System.out.println(remainPeople.remove(killIndex) + "번 군사가 죽습니다.");
        }
        return remainPeople.get(0);
    }
    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex2(20, 5) + "번 자리에 서있으면 됩니다.");
    }

}
