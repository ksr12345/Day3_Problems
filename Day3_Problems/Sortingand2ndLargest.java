import java.util.Arrays;

public class Sortingand2ndLargest {
    public static void main(String[] args){
        int[] mylist = {4, 3, 6, 2, 7};
        int n = mylist.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < (n-i-1); j++){
                if (mylist[j] > mylist[j+1]) {
                    int temp = mylist[j];
                    mylist[j] = mylist[j+1];
                    mylist[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted List is: "+ Arrays.toString(mylist));
        System.out.println("Second Largest Element: "+ mylist[n-2]);
    }
}
