public class EvenOddPosition {
    public static void main(String[] args){
        int[] mylist = {4, 3, 6, 2, 7};
        System.out.println("Even position elements:");
        for (int i = 0; i < mylist.length ; i++){
            if (i%2 == 0){
                System.out.println(mylist[i]);
            }
        }
        System.out.println("Odd position elements:");
        for (int i = 0; i < mylist.length ; i++){
            if (i%2 != 0){
                System.out.println(mylist[i]);
            }
        }
    }
}
