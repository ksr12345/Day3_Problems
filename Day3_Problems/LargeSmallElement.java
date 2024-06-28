public class LargeSmallElement {
    public static void main(String[] args){
        int[] mylist = {4, 3, 6, 2, 7};
        int large = mylist[0];
        int small = mylist[0];
        for (int i = 0; i < mylist.length ; i++){
            if (mylist[i] > large){
                large = mylist[i];
            }
            if (mylist[i]< small){
                small = mylist[i];
            }
        }
        System.out.println("Largest is "+ large + " Smallest is "+ small);

    }
}
