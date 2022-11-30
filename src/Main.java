public class Main {
    public static void main(String[] args) {
        String sentence = "My name is Idan Zakhaim";
        char[] testChars = {'a', 'e', 'Y', 'm'};
        System.out.println(most(sentence, testChars));
    }

    public static char most(String sentence, char[] testChars) {
        int count;
        char mostChar;
        int[] countChars = new int[testChars.length];
        for (int i = 0; i < testChars.length; i++) {
            count = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if ((Character.toLowerCase(sentence.charAt(j)) == testChars[i]) || Character.toUpperCase(sentence.charAt(j)) == testChars[i]) {
                    count++;
                }
            }
            countChars[i] = count;
        }
        mostChar=testChars[0];
        for (int countChar : countChars) {
            for (int j = 0; j < countChars.length; j++) {
                if (countChar < countChars[j]) {
                    mostChar = testChars[j];
                }
            }
        }
            return mostChar;
        }
}