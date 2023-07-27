import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int [] myNum = {6,3,2,8,1};
        String [] names = {"Ade","Joy","Ash","Peru"};

        Arrays.sort(myNum);
        System.out.println(Arrays.toString(myNum));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
