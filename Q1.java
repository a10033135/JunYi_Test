/**
 * one
 */
public class Q1 {

    public static void main(String[] args) {
        // 第一題
        String firstText = "MyName";
        String firstResult = getWord(firstText);
        System.out.println(firstResult);

        // 第二題
        String secondText = "My Name is Evan";
        String secondResult = getSentence(secondText);
        System.out.println((secondResult));
    }

    public static String getWord(String text) {

        StringBuilder result = new StringBuilder();
        for (String s : text.split("")) {
            result.insert(0, s);
        }

        return result.toString();
    }

    public static String getSentence(String text) {
        String[] strings = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : strings) {
            StringBuilder textBuilder = new StringBuilder();
            for (String letter : word.split("")) {
                textBuilder.insert(0, letter);
            }
            result.append(textBuilder.toString() + " ");
        }
        return result.toString();
    }
}