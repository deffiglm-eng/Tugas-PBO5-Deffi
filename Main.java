import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simulasi Student
        System.out.print("Input Nama Student: "); String sName = sc.nextLine();
        System.out.print("Alamat Student: "); String sAddr = sc.nextLine();
        Student s = new Student(sName, sAddr);
        s.addCourseGrade("PBO", 90);
        s.addCourseGrade("Basis Data", 85);

        // Simulasi Teacher
        System.out.print("\nInput Nama Dosen: "); String tName = sc.nextLine();
        System.out.print("Alamat Dosen: "); String tAddr = sc.nextLine();
        Teacher t = new Teacher(tName, tAddr);
        t.addCourse("PBO");

        // Output Hasil
        System.out.println("\n--- Data Hasil Input ---");
        System.out.println(s.toString());
        s.printGrades();
        System.out.println("Rata-rata: " + s.getAverageGrade());

        System.out.println("\n" + t.toString());
        System.out.println("Tambah Matkul PBO: " + (t.addCourse("PBO") ? "Berhasil" : "Gagal (Sudah ada)"));

        sc.close();
    }
}