public class Prime {


    public static void main(String[] args) {

        int i,m,n=22, flag=0;

       if(n==1||n==0){

           System.out.println("not prime");
       }
        m=n/2;

       for(i=2;i<=m;i++){
           if(n%i==0){

               System.out.println(n +" is not prime");

               flag=1;
               break;
           }

        }
        if(flag==0){
            System.out.println(n+" is prime");
        }
    }
    }
