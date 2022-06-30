public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
            myPrinter.append("Большая" , 2, 100 ,"книга");
            myPrinter.append( "Маленький", 1 , 25 , "Журнал" );
            myPrinter.print("Очередь на печать");
            int totalPages = myPrinter.getPendingPagesCount();
            System.out.println("Общее количество страниц на печать" +"-" + totalPages );
            myPrinter.clear();
            System.out.println();
            myPrinter.print("Очередь на печать");
            totalPages = myPrinter.getPendingPagesCount();
            System.out.println("Общее количество страниц на печать" +"-" + totalPages );
        }











    }


