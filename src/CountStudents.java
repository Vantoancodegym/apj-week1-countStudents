import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] points={6,7,1,2,7,8,9,10,3,6,7,3,7,8,9};
        System.out.println(count(points)+" students have point lager than 5");
    }
    public static int count(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=5){
                count++;
            }
        }
        return count;
    }
}
