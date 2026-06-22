package first_class;

public class Simple_Interest {
    public static void main(String[] args) {
        int principle = 8888;
        int rate = 5;
        int time = 3;
//        explicit type casting
        double si = (double) (principle * rate * time) / 100;

        System.out.println("Interest rate is : " +si);

//        implicit typecasting 
        System.out.println(2+2);
        System.out.println("2"+2);

    }
}
