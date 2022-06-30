public class Printer {
    private  String queue = "";
    private  int totalPages = 0 ;
public  void append(String name , int count ,int pages , String title) {
queue = queue + "\n" + name + "-" + title + "-" + count + pages + "стр";
totalPages = totalPages + count * pages;
    }

    public void print(String queue){
        System.out.println(queue);
    if(queue.isEmpty()){
    System.out.println("Очередь на печать пуста");}
else { System.out.println(queue);}}

    public void clear(){
        queue = "";
   totalPages = 0;
    }

    public int getPendingPagesCount () {
return totalPages;
    }
public boolean contains (String name){
        if(queue.contains(name)){
            return true;
        }
return false;
    }





}




