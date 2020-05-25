import java.util.Scanner;
class TimeConversion {
	public static void main(String[] args) {
		System.out.println("12-hour format to 24-hour format converter:");
		System.out.println("Enter time in 12 hour fomrat. E.g: '12:45:45AM'");
		Scanner s = new Scanner(System.in);
		String s1=s.nextLine();
		System.out.println("Converted: "+timeConversion(s1));
	}
	private static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String[] inputArray = s.split(":");
         boolean am=true;

         if(inputArray[2].substring(2).equals("PM")){
             am=false;
         }

         if(am){
             if(inputArray[0].equals("12")){
                 inputArray[0]="00";
             }
         }else{
            int hours = Integer.parseInt(inputArray[0]);
            if(hours!=12){
                hours+=12;
                inputArray[0]=String.valueOf(hours);
            }                     
         }
        return inputArray[0]+":"+inputArray[1]+":"+inputArray[2].substring(0,2);
    }
	
}