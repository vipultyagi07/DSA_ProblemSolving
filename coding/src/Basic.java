import java.util.HashSet;
import java.util.Set;

interface MyInterface{
        public void hello(int x);
    }

    class MyInterfaceImpl implements MyInterface{
        public void hello(int x){
            int a = (int)Math.pow(2, 2);

            System.out.println("number is "+x);
        }


    }


    public class Basic {
        public static void main(String[] args) {

            Set<Integer> answer= new HashSet<>();

            MyInterface myInterface= new MyInterfaceImpl(); // this is DMD(dynamic method dispatch)
            myInterface.hello(70);
        }

    }