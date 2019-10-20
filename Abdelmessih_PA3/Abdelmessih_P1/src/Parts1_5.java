
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;



public class Parts1_5 {
    public static int Ask() {

        SecureRandom rand = new SecureRandom();
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);

        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        return rand_int1 * rand_int2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userNum, num;
        num = Ask();
        while (true) {
            userNum = sc.nextInt();
            if (userNum == num) {
                System.out.println("Very good!");
                num = Ask();
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }

    static class Part2 {
        public int Num1, Num2, ans;

        void GenerateQuest() {

            Random rand = new Random();
            Num1 = rand.nextInt(9) + 1;
            Num2 = rand.nextInt(9) + 1;
            ans = Num1 * Num2;
            System.out.print("How much is " + Num1 + " times " + Num2 + "?");
        }
        public void main(String[] args) {
            int flag = 0, i;
            String[] Right_question = {"Very good!", "Excellent !", "Nice Work!", "Keep up the good work!"};
            String[] Wrong_question = {"No Please try again.", "Wrong. Try once more", "Don't Give up!", "no. Keep trying."};
            while (flag == 0) {
                Scanner sc = new Scanner(System.in);
                Part2 s1 = new Part2();
                s1.GenerateQuest();
                int your_ans = sc.nextInt();
                Random rand = new Random();
                i = rand.nextInt(3);
                if (your_ans == s1.ans) {
                    System.out.println(Right_question[i]);
                    flag = 1;
                } else {
                    System.out.println(Wrong_question[i]);

                }
            }
        }

        static class Part3 {
            static Scanner sc = new Scanner(System.in);
            static Random rm = new Random();
            private static int count = 0, cor = 0, incor = 0;

            public static void main(String[] args) {

                while (count < 10) {
                    count++;
                    int n1 = rm.nextInt(10);
                    int n2 = rm.nextInt(10);
                    Random rnum = new Random();
                    mult(n1, n2);
                }
                percen();
            }
            static void mult(int n1, int n2) {
                int multi = n1 * n2;
                while (true) {
                    System.out.println("How much " + n1 + " times " + n2 + "?");
                    int n3 = sc.nextInt();
                    if (n3 == multi) {
                        cor++;
                        correct();
                        break;
                    } else {
                        incor++;
                        incorrect();
                        break;
                    }
                }
            }
            static void correct() {
                int c1 = rm.nextInt(4);
                switch (c1) {
                    case 0:
                        System.out.println("Very Good!");
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;
                }
            }
            static void incorrect() {
                int c2 = rm.nextInt(4);
                switch (c2) {
                    case 0:
                        System.out.println("No, please try again!");
                        break;
                    case 1:
                        System.out.println("wrong, try once more!");
                        break;
                    case 2:
                        System.out.println("Don't give up!");
                        break;
                    case 3:
                        System.out.println("No, keep trying!");
                        break;
                }

            }
            static void percen() {
                if (cor >= 7.5) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help");
                }
            }


            static class Part4 {
                static Scanner sc = new Scanner(System.in);
                static Random rm = new Random();
                static int count = 0, cor = 0, incor = 0;

                public static void main(String[] args) {
                    System.out.println("Difficulty level");
                    System.out.println("Enter Level number: ");
                    int lb = sc.nextInt();
                    switch (lb) {
                        case 1:
                            while (count < 10) {
                                count++;
                                int n1 = rm.nextInt(10);
                                int n2 = rm.nextInt(10);
                                Random rnum = new Random();
                                mult(n1, n2);
                            }
                            percen();
                            break;
                        case 2:
                            while (count < 10) {
                                count++;
                                int N1 = rm.nextInt(100);
                                int N2 = rm.nextInt(100);
                                Random rnum = new Random();
                                mult(N1, N2);
                            }
                            percen();
                            break;
                    }
                }

                static void mult(int N1, int N2) {
                    System.out.println("Monitor Student Performance");
                    int multi = N1 * N2;
                    while (true) {
                        System.out.println("How much " + N1 + " times " + N2 + "?");
                        int n3 = sc.nextInt();
                        if (n3 == multi) {
                            cor++;
                            correct();
                            break;
                        } else {
                            incor++;
                            incorrect();
                            break;
                        }
                    }
                }

                static void correct() {
                    int c1 = rm.nextInt(4);
                    switch (c1) {
                        case 0:
                            System.out.println("Very Good !");
                            break;
                        case 1:
                            System.out.println("Excellent !");
                            break;
                        case 2:
                            System.out.println("Nice Work !");
                            break;
                        case 3:
                            System.out.println("Keep up the good work !");
                            break;
                    }
                }

                static void incorrect() {
                    int c2 = rm.nextInt(4);
                    switch (c2) {
                        case 0:
                            System.out.println("No, please try again !");
                            break;
                        case 1:
                            System.out.println("wrong, try once more !");
                            break;
                        case 2:
                            System.out.println("Don't give up !");
                            break;
                        case 3:
                            System.out.println("No, keep trying!");
                            break;
                    }

                }
                static void percen() {
                    if (cor >= 7.5) {
                        System.out.println("Congratulations, you are ready to go to the next level!");
                    } else {
                        System.out.println("Please ask your teacher for extra help");
                    }
                }


                static class Part5 {
                    public static void main(String[] args) {
                        Scanner scan = new Scanner(System.in);

                        int arithmetic, a, b;
                        a = 3;
                        b = 4;
                        System.out.println("Pick a type of arithmetic problem to study (1-5)");
                        arithmetic = scan.nextInt();
                        if (arithmetic == 1) {
                            int sum = a + b;
                            System.out.println("sum =" + sum);
                        } else if (arithmetic == 2) {
                            int difference = a - b;
                            System.out.println("difference " + difference);
                        } else if (arithmetic == 3) {
                            int multiply = a * b;
                            System.out.println("multiplication " + multiply);
                        } else if (arithmetic == 4) {
                            int divide = a / b;
                            System.out.println("division " + divide);
                        } else if (arithmetic == 5) {
                            int mixed = (a + b) * a;
                            System.out.println("random mixture =" + mixed);
                        }
                    }
                }
            }
        }
    }
}
