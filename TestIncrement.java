package Test;
public class TestIncrement {
    public static void main(String[] args) {
        int i = 100;//variable i declartion
        int ilnc = i++;//variable ilnc declartion
        System.out.println("For i++");
        System.out.println("The value of i is "+ i);//display value of i
        System.out.println("The value of i++ is "+ ilnc);//display value of ilnc

        ilnc = ++i;
        System.out.println("\nFor ++i");
        System.out.println("The value of i is "+ i);
        System.out.println("The value of i++ is "+ ilnc);
    }
}
