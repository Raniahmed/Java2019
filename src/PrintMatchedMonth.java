public class PrintMatchedMonth {

    public static void main(String[] args) {
        // print the matched month
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String month : months) {
            System.out.println(month);
            boolean isDecember = month.equalsIgnoreCase("December");
            if (isDecember == true) {
                System.out.println("December is here");
                break;
            }

        }
    }

}
