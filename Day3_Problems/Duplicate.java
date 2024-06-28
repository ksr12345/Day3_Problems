public class Duplicate {
    public static void main(String[] args){
        int[] mylist = {2, 4, 2, 3, 5, 4, 3};
        System.out.println("Duplicate Elements are:");
        int count = 0;
        for (int k : mylist) {
            for (int i : mylist) {
                if (k == i) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println(k);
            }
            count = 0;
        }
    }
}
