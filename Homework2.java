import java.util.Scanner;
class Student {
    int studentNumber;
    String name;
    String major;
    int phone;

    int getStudentNumber() {
        return studentNumber;
    }

    String getName() {
        return name;
    }

    String getMajor() {
        return major;
    }

    int getPhone() {
        return phone;
    }

    void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    void setName(String studentName) {
        this.name = studentName;
    }

    void setMajor(String major) {
        this.major = major;
    }

    void setPhone(int phone) {
        this.phone = phone;
    }
}
class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        String inputInfo = sc.nextLine();
        String[] studentInfo = inputInfo.split(" ");
        s1.setStudentNumber(Integer.parseInt(studentInfo[0]));
        s1.setName(studentInfo[1]);
        s1.setMajor(studentInfo[2]);
        s1.setPhone(Integer.parseInt(studentInfo[3].substring(1)));

        Student s2 = new Student();
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        inputInfo = sc.nextLine();
        studentInfo = inputInfo.split(" ");
        s2.setStudentNumber(Integer.parseInt(studentInfo[0]));
        s2.setName(studentInfo[1]);
        s2.setMajor(studentInfo[2]);
        s2.setPhone(Integer.parseInt(studentInfo[3].substring(1)));

        Student s3 = new Student();
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        inputInfo = sc.nextLine();
        studentInfo = inputInfo.split(" ");
        s3.setStudentNumber(Integer.parseInt(studentInfo[0]));
        s3.setName(studentInfo[1]);
        s3.setMajor(studentInfo[2]);
        s3.setPhone(Integer.parseInt(studentInfo[3].substring(1)));

        String s1AddPhone = "0" + Integer.toString(s1.getPhone());
        String s1Split1 = s1AddPhone.substring(0,3);
        String s1Split2 = s1AddPhone.substring(3,7);
        String s1Split3 = s1AddPhone.substring(7);

        String s2AddPhone = "0" + Integer.toString(s2.getPhone());
        String s2Split1 = s2AddPhone.substring(0,3);
        String s2Split2 = s2AddPhone.substring(3,7);
        String s2Split3 = s2AddPhone.substring(7);

        String s3AddPhone = "0" + Integer.toString(s3.getPhone());
        String s3Split1 = s3AddPhone.substring(0,3);
        String s3Split2 = s3AddPhone.substring(3,7);
        String s3Split3 = s3AddPhone.substring(7);

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫 번째 학생: %d %s %s %s-%s-%s\n", s1.getStudentNumber(), s1.getName(), s1.getMajor(), s1Split1, s1Split2, s1Split3);
        System.out.printf("두 번째 학생: %d %s %s %s-%s-%s\n", s2.getStudentNumber(), s2.getName(), s2.getMajor(), s2Split1, s2Split2, s2Split3);
        System.out.printf("세 번째 학생: %d %s %s %s-%s-%s", s3.getStudentNumber(), s3.getName(), s3.getMajor(), s3Split1, s3Split2, s3Split3);
    }
}