import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scan.nextInt();

        if (score < 80) {
            System.out.println("불합격");
        } else if (score >= 90) {
            System.out.println("A반");
        } else if (score >= 85) {
            System.out.println("B반");
        } else {
            System.out.println("C반");
        }
    }
}