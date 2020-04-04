public class Stringbuilder {

    public static String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder();
        for (String word : words) {
            sentence.append(word);
        }
        return sentence.toString();
    }

    public static void main(String[] args) {
        String[] myStringArray = {"Shahar", "Number", "One"};
        System.out.println(joinWords(myStringArray));
    }
}
