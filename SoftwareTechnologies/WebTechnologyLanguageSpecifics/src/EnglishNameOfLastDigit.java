import java.util.Scanner;

public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputAsString = input.nextLine();

        System.out.println(returnDigitName(inputAsString));
    }

    public static String returnDigitName(String inputAsString) {
        char lastDigit = inputAsString.charAt(inputAsString.length() - 1);
        String EnglishName = "";

        if(lastDigit == '1'){
            EnglishName = "one";
        }
        else if(lastDigit == '2'){
            EnglishName = "two";
        }
        else if(lastDigit == '3'){
            EnglishName = "three";
        }
        else if(lastDigit == '4'){
            EnglishName = "four";
        }
        else if(lastDigit == '5'){
            EnglishName = "five";
        }
        else if(lastDigit == '6'){
            EnglishName = "six";
        }
        else if(lastDigit == '7'){
            EnglishName = "seven";
        }
        else if(lastDigit == '8'){
            EnglishName = "eight";
        }
        else if(lastDigit == '9'){
            EnglishName = "nine";
        }
        else if(lastDigit == '0'){
            EnglishName = "zero";
        }


        return EnglishName;
    }
}



