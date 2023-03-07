package Bai2;

import Bai1.Student;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[200];
    static int soSinhVien = 0;

    public static void main(String[] args) {
        int check = 0;
        Student student = new Student();
        do {
            System.out.println("****************HACKATHON-JAVA-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập số sinh viên và nhập thông tin cho các sinh viên");
            System.out.println("2. In thông tin các sinh viên đang quản lý");
            System.out.println("3. Sắp xếp các sinh viên theo điểm trung bình tăng dần");
            System.out.println("4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên");
            System.out.println("5. Thống kê số sinh viên nam, nữ đang quản lý");
            System.out.println("6. In ra thông tin các sinh viên xếp loại giỏi và trung bình");
            System.out.println("7. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    student = inputData(student);
                    break;
                case 2:
                    System.out.println("Danh sachs sinh viên");
                    System.out.println(student.displayData());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
            }
        } while (check != 7);

    }

    static Student inputData(Student student) {
        System.out.print("Nhập số sinh viên cần quản lý: ");
        soSinhVien = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < soSinhVien; i++) {
            System.out.print("Mã sinh viên: ");
            student.setStudentId(scanner.nextLine());
            System.out.println("");
            System.out.print("Tên sinh viên: ");
            student.setStudentName(scanner.nextLine());
            System.out.println("");
            System.out.print("Tuổi sinh viên: ");
            student.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("");
            System.out.print("Giới tính: ");
            student.setSex(scanner.nextLine());
            System.out.println("");
            System.out.print("Số điện thoại: ");
            student.setPhone(scanner.nextLine());
            System.out.println("");
            System.out.print("Địa chỉ: ");
            student.setAddress(scanner.nextLine());
            System.out.println("");
            System.out.print("Điểm thi html: ");
            student.setHtml(Float.parseFloat(scanner.nextLine()));
            System.out.println("");
            System.out.print("Điểm thi css: ");
            student.setCss(Float.parseFloat(scanner.nextLine()));
            System.out.println("");
            System.out.print("Điểm thi javascript: ");
            student.setJavascript(Float.parseFloat(scanner.nextLine()));
        }
        return student;
    }
}