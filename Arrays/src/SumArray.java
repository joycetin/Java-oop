public class SumArray {
    public static void main(String[] args) {
        int ages[] = {1, 3, 5, 7, 9};
        int sum = 0;

        for (int a:ages
             )
            sum += a;
            System.out.println(sum);
        double average = sum / ages.length;
        System.out.println(average);
    }
}
