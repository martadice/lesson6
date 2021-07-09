public class lesson6 {
    public static void main(String[] args) {

        short X1 = 12;
        short Y1 = 5;

        if (X1 > Y1) {
            System.out.println("X1 is bigger");

        }
        if (X1 < Y1) {
            System.out.println("Y1 is bigger");
        }
        if (X1 == Y1) {
            System.out.println("X1 is equal to y1");
        } else {
            System.out.println("X1 is not equal to y1");
        }
        if (X1 % 2 == 0) {
            System.out.println("Even number");
        }
        if (Y1 % 2 == 0) {
            System.out.println("Uneven/odd number");
        }
        if (X1 < 0 || Y1 < 0) {
            System.out.println("X1 or Y1 is a negative number");
        } else {
            System.out.println("X1 or Y1  is a positive  number");
        }
        if (X1 < 100 || Y1 < 100) {
            System.out.println("X1 or Y1 is smaller than 100");
        }
        int sum;
        sum = X1 + Y1;
        System.out.println("Result is: " + sum);

    double result = X1 - Y1;
    result = Math.round(result*100)/100;
        System.out.println("Result is " + result);
}

}