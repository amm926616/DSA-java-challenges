package reverseAString;

public class Main {
    public static void main(String[] args) {
        String name = "AungMyintMyat";

        char[] nameCharArray = name.toCharArray();

        StringBuilder reversedName = new StringBuilder();

        for (int i=0; i < nameCharArray.length; i++) {
            reversedName.append(nameCharArray[nameCharArray.length -i -1]);
            System.out.println(nameCharArray[i]);
        }

        System.out.println(reversedName);

    }
}

// What you've learnt
// for loop, advanced for loop.
// StringBuilder
