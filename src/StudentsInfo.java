import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentsInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("students.txt");

            System.out.print("Введите количество студентов: ");
            int count = scanner.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.println("Студент " + (i+1));

                System.out.print("Имя: ");
                String name = scanner.next();

                System.out.print("Возраст: ");
                int age = scanner.nextInt();

                System.out.print("Средний балл: ");
                double averageGrade = scanner.nextDouble();

                fileWriter.write("Имя: " + name + ", Возраст: " + age + ", Средний балл: " + averageGrade + "\n");
            }

            System.out.println("Информация о студентах успешно записана в файл.");

        } catch (IOException e) {
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
            }
            scanner.close();
        }
    }
}