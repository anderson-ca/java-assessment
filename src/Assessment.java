import java.util.ArrayList;

public class Assessment {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        ArrayList<User> capList = new ArrayList<>();

        User one = new User("anderson","cardoso",false);

        User two = new User("jane","doe", true);

        User three = new User("jack", "john", false);


        userList.add(one);

        userList.add(two);

        userList.add(three);

        for (User element: userList) {
            System.out.println(element.firstName);

        }

        capitalizeRecords(userList);

        capList = capitalizeRecords(userList);

        for (User element: capList) {
            System.out.println(element.firstName);

        }




    }

    /////////////////////////////////////////////////////
    /////////////////////////////////////////////////////
    /////////////////////////////////////////////////////

    /////////////// Square (int)
    public static int square(int number) {

        int timesItsself = (number * number);

        return timesItsself;
    }


    ////////////// Sum (int)
    public static int sum(int number1, int number2) {
        int theSum = (number1 + number2);

        return theSum;
    }


    ///////////// Sum (double)
    public static double sum(double number1, double number2) {
        double theSum = (number1 + number2);

        return theSum;
    }

    ///////////// Average (int[])
    public static int average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    /////////////// CapitalizeRecords.
    public static ArrayList<User> capitalizeRecords(ArrayList<User> input) {
        String[] fn;
        String[] ln;

        ArrayList<User> newList = input;

        for (User element : newList) {
            fn = element.getFirstName().split("");
            ln = element.getLastName().split("");

            for (int i = 0; i < fn.length; i++) {

                fn[0].toUpperCase();

            }

            for (int i = 0; i < ln.length; i++) {

                ln[0].toUpperCase();

            }

            element.setFirstName(fn.toString());
            element.setLastName(ln.toString());

        }

        return newList;


    }


}

/////////////////////////////////////////////////////
/////////////////////////////////////////////////////
/////////////////////////////////////////////////////

