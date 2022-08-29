import java.util.Scanner;

public class DsiplayMultiples {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter number :  ");
        int num = console.nextInt();


        for (int i = 1; i < num+1; i++){
        int answer=num*i;

            System.out.println(num+" x "+i+" = "+answer);

        }


    }

}
