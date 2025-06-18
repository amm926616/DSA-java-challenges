package challenges.occurrencecounter;

public class Main {
    public static void main(String[] args) {
        String longString = """
                            Starting the day with a cup of coffee helps me focus better.\s
                            Coffee gives me the energy I need to begin my work with a clear mind.\s
                            Some people prefer tea, but for me, coffee is part of my morning ritual.\s
                            A productive day often begins with good habits — a healthy breakfast,\s
                            some stretching, and definitely coffee. Staying focused throughout the\s
                            day can be hard, but small routines like this make a big difference.
                           \s""";

        String searchingWord = "coffee";

        System.out.println("Occurrence Counts: " + occurrenceSearch(longString, searchingWord));
    }

    public static int occurrenceSearch(String longString, String searchWord) {
        String[] words = longString.split("\\s"); // special regex character in java that represents white space characters like space tabs etc.

        int wordCount = 0;

        String searchingWord = searchWord.strip().toLowerCase();

        System.out.println("Searching for: " + searchingWord);

        for (String word: words) {
            if (word.toLowerCase().equals(searchingWord)) {
                wordCount += 1;
            }
        }

        return wordCount;
    }
}
