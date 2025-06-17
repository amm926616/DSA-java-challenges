package palindrome;

public class Main {
    public static void main(String[] args) {
        String myName = "Aung Myint Myat";
        String palindromeString = "whattahw";

        System.out.println(checkPalindrome(myName));
        System.out.println(checkPalindrome(palindromeString));;
    }

    public static String checkPalindrome(String inputString) {
        // plan
        // တစ်ဝက်ကနေခွဲ
        // နောက်ကတစ်ခြမ်းကို ပြောင်းပြန်ပြန်
        // အရှေ့တစ်ဝက်နဲ့တူလားစစ်

        // hint
        // check for both sides

        char[] inputStringArray = inputString.toCharArray();

        if (inputString.length() % 2 == 0) {
            for  (int i = 0; i < inputString.length() / 2; i++) {
                char frontCharacter = inputStringArray[i];
                char backCharacter = inputStringArray[inputString.length() - i - 1];

                if (frontCharacter != backCharacter) {
                    return inputString + " is not a palindrome: ";
                }
            }
        } else {
            int newLength = inputStringArray.length - 1;

            for (int i = 0; i < newLength / 2; i++) {
                char frontCharacter = inputStringArray[i];
                char backCharacter = inputStringArray[newLength - i - 1];

                if (frontCharacter != backCharacter) {
                    return inputString + " is not a palindrome: ";
                }
            }
        }

        return inputString + " is a palindrome: ";

    }
//
//    public List<String> splitStringInHalf(String inputString) {
//        int lenOfString = inputString.length();
//        String firstHalf = "";
//        String secondHalf = "";
//        if (lenOfString % 2 == 0) {
//            firstHalf = inputString.substring(0, lenOfString / 2);
//        }
//    }
}
