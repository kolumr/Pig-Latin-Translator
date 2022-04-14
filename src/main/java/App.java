import java.util.Scanner;

public class App {
    //Create an empty String where we will save our translated String
    public static String strArr ="";

    //Create a function to translate the String
    static void pig_it(String str){
        //Create an array of the words using the provided String.
        String[] arr = str.split(" ");

        // loop through each word in the Array
        for (String s : arr){
            //Check if the word is a punctuation mark, you can add more punctuation marks to the code
            if (!s.equals("!")&& !s.equals(".")&&!s.equals("?")){

                //Move 1st letter of the word to the end of the word and add "ay"
                String n = s.substring(1);

                //Use StringBuilder to create a String object that can utilize the available String class methods
                StringBuilder strNew1 = new StringBuilder(strArr);

                //Append the substring, then the 1st character of the word to the end and add "ay".
                //Since we are concatenating the Strings and a space to separate the words.
                strArr = strNew1.append(n).append(s.charAt(0)).append("ay").append(" ").toString();

                //If the word is a punctuation mark, add it to the String
            }else{
                StringBuilder strNew2 = new StringBuilder(strArr);
                strArr = strNew2.append(s).append(" ").toString();
            }
        }
        System.out.println("Your String in Pig Latin is:" + strArr);
    }
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the pig latin translator");
        System.out.println("Enter the String");

        // Read user input
        String newStr = myObj.nextLine();

        // Output user input
        System.out.println("Your String is: " + newStr);

        //Call the function with the given input as argument
        pig_it(newStr);
    }
}
