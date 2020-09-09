import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int b[];
        int i;
        boolean z=true;
        b = new int[10];
        for (i = 0; i < 10; i++) {
            b[i] = (int)(Math.random()*100);
        }
        System.out.println("Массив целых чисел с помощью метода random() класса Math:");
        for (i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
        while (z) {
            z = false;
            for (i = 1; i < 10; i++) {
                if (b[i] < b[i - 1]) {
                    int swap = b[i - 1];
                    b[i - 1] = b[i];
                    b[i] = swap;
                    z=true;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (i = 0; i < 10; i++)
        {
            System.out.print(b[i]);
            if(i!=9) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Массив целых чисел с помощью класса Random:");
        for (i = 0; i < 10; i++) {
            Random random = new Random();
            b[i] = random.nextInt(101)+1;
        }

        for (i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
        z=true;
        while (z) {
            z = false;
            for (i = 1; i < 10; i++) {
                if (b[i] < b[i - 1]) {
                    int swap = b[i - 1];
                    b[i - 1] = b[i];
                    b[i] = swap;
                    z=true;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (i = 0; i < 10; i++)
        {
            System.out.print(b[i]);
            if(i!=9) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}
