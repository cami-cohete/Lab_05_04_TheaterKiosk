public class Main {

//    num userAge = 0
//    num WRIST_BAND_AGE = 21
//    output “Enter your age: ”
//    input userAge
//    if userAge > = WRIST_BAND_AGE then
//       output “You get a paper wristband!”
//    endIf

    public static void main(String[] args)
    {
	int userAge = 0;
    final int WRISTBAND_AGE = 21;

    System.out.println("Enter your age: ");
    userAge = 23;
    System.out.println("Simulated user age is " + userAge);

    if (userAge >= 21)
    {
        System.out.println("You get a wrist Band!");
    }
    }
}
