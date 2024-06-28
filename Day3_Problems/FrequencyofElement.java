public class FrequencyofElement {
    public static void main(String[] args){
        int[] mylist = {2, 4, 2, 3, 5, 4, 3};
        int count = 0;
        for (int k : mylist) {
            for (int i : mylist) {
                if (k == i) {
                    count++;
                }
            }
            System.out.println(k + " has frequency " + count);
            count = 0;
        }
    }
}
