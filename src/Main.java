
//public class Main {
//Video 14
//    public static void main(String[] args) {
//
//        int x = 8;
//
//        if (x>10 && x<=20) //11-20
//            System.out.println("Hello");
//        else
//            System.out.println("Bye");
//
//    }
//}

//public class Main {
//    //printing greatest between two values
//    public static void main(String[] args) {
//
//        int x = 8;
//        int y = 12;
//
//        if (x>y)
//            System.out.println(x);
//        else
//            System.out.println(y);
//
//    }
//}

import java.sql.SQLOutput;

//

//public class Main {
//    //Video 16
//    //Ternary operator
//    public static void main(String[] args) {
//
//        int x = 4;
//        int result = 0;
//
//        if (x%2==0)
//           result= 10;
//        else
//            result =20;
//        System.out.println(result);
//
//            result = x%2==0? 10 : 20;
//            System.out.println(result);
//
//    }
//}

//public class Main {
    //Video 17,18 Switch Statements
//    public static void main(String[] args) {
//
//        String day = "Thurday";
//        String result = "";
//        result = switch(day)
//    {
//            case "Monday"  ->  "8AM";
//
//            case "Saturday", "Sunday" -> "6AM";
//
//            default ->  "7AM";
//        };
//            System.out.println(result);
//
//        }
//    }

public class Main
{
    //Video 20 While Loop in Java
    public static void main(String[] args)
    {

        int i = 6;
        while (i <= 4)
        {
            System.out.println("Hello " + i);
            i++;
        }

        System.out.println("Bye " + i);
    }

}
