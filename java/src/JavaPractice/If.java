package JavaPractice;

public class If {
    public static void main(String[] args) {
        boolean cond = 1< 6;
        boolean cond1 = 3> 8;
        boolean cond2 = 5 != 2;
        boolean cond3 = 7 == 8;
        boolean A = false;
        boolean B = true;
        System.out.println("Print cond "+ cond);
        System.out.println("Print cond1 "+ cond1);
        System.out.println("Print cond2 "+ cond2);
        System.out.println("Print cond3 "+ cond3);
        System.out.println("------------"+ A);
        System.out.println("------------"+ B);
        System.out.println("------------"+ B);

        int myInt = 15;

        if (myInt < 10){
            System.out.println("Yes, it's true " +myInt);
        }
        else if (myInt > 20){
            System.out.println("No! its false! " +myInt);
        }
        else {
            System.out.println("None of the above. " +myInt);
        }

        System.out.println("Print here loop---------------------------");


        int loop = 0;
        while (true){
            System.out.println("Looping " +loop);
            if (loop ==5){
                break;
            }
            loop ++;
            System.out.println("Running");
        }






















    }
}
