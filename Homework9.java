import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("db.txt"))) {
            String line;
            while((line = bf.readLine()) != null) {
                String[] split = line.split("\\s+");
                users.put(split[0], split[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("id와 password를 입력해주세요.");
        System.out.print("id : ");
        String id = sc.nextLine().trim();

        if (users.containsKey(id)){
            System.out.print("password : ");
            String pw = sc.nextLine().trim();
            if(users.get(id).equals(pw)){
                System.out.println("id와 비밀번호가 일치합니다.");
            }else{
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }else{
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
        }
    }
}