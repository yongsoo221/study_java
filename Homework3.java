import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("수를 입력하세요: ");
        String num2 = sc.nextLine();
        String[] parts = num2.split(" ");

        int[] arr = new int[num1];
        for(int i = 0; i < num1; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < num1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d", min);
    }
}
