public class fibonachi {

    public static void main(String[] args){

        int count = 10;
        int a = 0,b=1,c;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i <= count ; i++) {
            c= a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
}
