import java.util.Scanner;

public class zodiac{
	public static Scanner console = new Scanner(System.in);
	public static void main(final String[] args) {
        intro();
        season(console);

    }

    public static void intro() {
        System.out.println("This program will let you know your");
        System.out.println("sign of the zodiac.");
        System.out.println("Please enter your date of birth ");
        System.out.println("in the following way (Month/Day).");
    }

    public static void season(final Scanner console) {
        final int month = console.nextInt();
        final int day = console.nextInt();
		
		//Aries (March 21 - April 19)
		if (month == 3 && day >= 21) {
				System.out.println("Aries");
		}
		else if (month == 3 && day <= 20) {
			System.out.println("Pisces");
		}
		//Taurus (April 20 - May 20)	
		if (month == 4 && day >=20) {
			System.out.println("Taurus");
		}
		else if (month == 4 && day <= 19) {
			System.out.println("Aries");
		}
		//Gemini (May21 - June 20)
		if (month == 5 && day >=21) {
			System.out.println("Gemini");
		}
		else if (month == 5 && day <= 20) {
			System.out.println("Taurus");
		}
		//Cancer (June 21 -July 22)
		if (month == 6 && day >=21 ) {
			System.out.println("Cancer");
		}
		else if (month == 6 && day <= 20) { 
			System.out.println("Gemini");
		}
		//Leo(July23 - August22)
		if (month == 7  && day >= 23) {
			System.out.println("Leo");
		}
		else if (month == 7 && day <= 22) {
			System.out.println("Cancer");
		}
		//Virgo (August23 - September22)
		if (month == 8 && day >= 23) {
			System.out.println("Virgo");
		}
		else if (month == 8 && day <= 22){
			System.out.println("Leo");
		}
		//Libra (September23 - October22)
		if (month == 9  && day >= 23) {
			System.out.println("Libra");
		}
		else if (month == 9 && day <= 22) {
			System.out.println("Virgo");
		}
		//Scorpio(October23 - November 21)
		if (month == 10 && day >=23) {
			System.out.println("Scorpio");
		}
		else if (month == 10 && day <= 22){
			System.out.println("Libra");
		}
		//Saggitarius (November 22 - December 21)
		if (month == 11  && day >= 22) {
			System.out.println("Saggitarius");
		}
		else if (month == 11 && day <= 21){
			System.out.println("Scorpio");
		}
		//Capricorn (December 22 - January19)
		if (month == 12  && day >= 22) {
			System.out.println("Capricorn");
		}
		else if ((month == 12 && day <= 21)) {
			System.out.println("Saggitarius");
		}
		//Aquarius (January20 - February18)
		if (month == 1 && day >= 20) {
			System.out.println("Aquarius");
		}
		else if (month == 1 && day <= 19 ){
			System.out.println("Capricorn");
		}
		//Pisces(February19 - March20)
		if (month == 2  && day >= 19) {
			System.out.println("Pisces");
		}
		else if (month == 2 && day <= 18){
			System.out.println("Aquarius");
		}
	}
	
	
}

