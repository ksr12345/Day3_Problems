public class ReverseArray {
    public static void main(String[] args){
        int[] mylist = {4, 3, 6, 2, 7};
        System.out.println("Reverse Order is:");
        for (int i = (mylist.length-1); i >= 0 ; i--){
            System.out.println(mylist[i]);
        }
    }
}
