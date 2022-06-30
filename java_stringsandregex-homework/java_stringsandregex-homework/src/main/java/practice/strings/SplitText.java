package practice.strings;

public class SplitText {

  public static void main(String[] args) {
    String text1 = "Family is a union that comprises a group of people connected by blood relationship and marriage" +
            "The reason why we enter into matrimony and decide to start a family can vary" +
            "However, the main purpose of many young couples is still the same giving birth to progeny, to bring them up and look after them till maturity" +
            "In general there are two kinds of family in our society: nuclear family and extended family" +
            "The number of unfruitful marriages without offspring is increasing at a great rate" +
            "Only heaven knows what will happen next and how it will turn out for us in the foreseeable future";
    System.out.println(splitTextIntoWords(text1));
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String[] words = text.split("[\\W]");
    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);}

    return text.replaceAll("[\\d\\s]+", "\n").trim();
    }
  }
