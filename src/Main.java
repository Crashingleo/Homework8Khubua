public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Task 1");
        int [] arrow1 = new int[3];
        arrow1[0] = 1;
        arrow1[1] = 2;
        arrow1[2] = 3;

        double [] arrow2 = {1.57, 7.654, 9.986};

        int [] arrow3 = new int[2];
        arrow3[0] = 2323;
        arrow3[1] = 23333;

    }
    public static void task2() {
        System.out.println("Task 2");

        int [] arrow1 = new int[3];
        arrow1[0] = 1;
        arrow1[1] = 2;
        arrow1[2] = 3;
        for (int i = 0; i < arrow1.length; i++)
        {
            if (i < (arrow1.length - 1))
            {
            System.out.print(arrow1[i] + ", ");
            } else System.out.print(arrow1[i]);
        }
        System.out.println("");

        double [] arrow2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrow2.length; i++)
        {
            if (i < (arrow2.length - 1))
            {
                System.out.print(arrow2[i] + ", ");
            } else System.out.print(arrow2[i]);
        }
        System.out.println("");



        int [] arrow3 = new int[2];
        arrow3[0] = 2323;
        arrow3[1] = 23333;
        for (int i = 0; i < arrow3.length; i++)
        {
            if (i < (arrow3.length - 1))
            {
                System.out.print(arrow3[i] + ", ");
            } else System.out.print(arrow3[i]);
        }
        System.out.println("");
    }
    public static void task3() {
        System.out.println("Task 3");
        int [] arrow1 = new int[3];
        arrow1[0] = 1;
        arrow1[1] = 2;
        arrow1[2] = 3;
        for (int i =  arrow1.length-1 ; i >= 0; i--)
        {
            if (i > (0))
            {
                System.out.print(arrow1[i] + ", ");
            } else System.out.print(arrow1[i]);
        }
        System.out.println("");

        double [] arrow2 = {1.57, 7.654, 9.986};
        for (int i =  arrow2.length - 1 ; i >= 0; i--)
        {
            if (i > 0)
            {
                System.out.print(arrow2[i] + ", ");
            } else System.out.print(arrow2[i]);
        }
        System.out.println("");

        int [] arrow3 = new int[2];
        arrow3[0] = 2323;
        arrow3[1] = 23333;
        for (int i =  arrow3.length - 1 ; i >= 0; i--)
        {
            if (i > (0))
            {
                System.out.print(arrow3[i] + ", ");
            } else System.out.print(arrow3[i]);
        }
        System.out.println("");


    }
    public static void task4() {
        System.out.println("Task 4");
        int [] arrow1 = new int[3];
        arrow1[0] = 1;
        arrow1[1] = 2;
        arrow1[2] = 3;

        for (int i = 0; i < arrow1.length; i++) {
            if (arrow1[i] % 2 > 0)
            {arrow1[i] += 1;}
            System.out.print(arrow1[i] + ", ");
        }
        System.out.println("");


    }
    public static void task5() {
        System.out.println("Task 5 ");

    }
}