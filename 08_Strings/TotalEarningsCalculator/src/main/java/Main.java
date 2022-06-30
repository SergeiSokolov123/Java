public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //TODO: напишите ваш код, результат вывести в консоль
        int text1 = text.indexOf("Вася заработал");
        int text2 = text.indexOf("рублей");
        String str1 = text.substring(text1 + 14, text2).trim();
        //System.out.println(str1);
        int text3 = text.indexOf("Петя -");
        int text4 = text.indexOf("рубля");
        String str2 = text.substring(text3 + 6, text4).trim();
        //System.out.println(str2);
        int text5 = text.indexOf("а Маша -");
        int text6 = text.lastIndexOf("рублей");
        String str3 = text.substring(text5 + 8, text6).trim();
        //System.out.println(str3);
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
        System.out.println(sum);


    }

}