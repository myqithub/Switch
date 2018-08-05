package pkgswitch;

/**
 * @author: Veysel Dogan 
 * Date: 05-Aug-2018
 * Console Application: Switch 
 * Main
 * Class
 */
public class Switch {

    /*
    switch(expressions){
    case value1:
    //statement sequance 
    break:}...
     */

    public static void main(String[] args) {
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("i 0");//if case =0 will write "1 0 " in screen but we dont put break so will write all them
            case 1:
                System.out.println("i 1");
            case 2:
                System.out.println("i 2");
            default:
                System.out.println("Default Message");//switch case help when making a menu 

        }

        int month = 14;//for month=14 will "wrong" because 14 no month.
        String monthString;//We wrote break in here so will loop fnish
        switch (month) {// if month = 5 going to write May
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "Augst";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "Novamber";
                break;
            case 12:
                monthString = "December";
                break;

            default:
                monthString = ("Wrong Month");//there is always this message. This is default message and allows you to finish the cycle  
                break;
        }
        System.out.println(monthString);//in the end will write we choose month

    }

}
