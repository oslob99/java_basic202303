package day08.poly.book;

public class BookMain {

    public static void main(String[] args) {
        BookView bv = new BookView();
        BookUser bu = new BookUser();
        while (true){
            try {
                bv.startUser();
            }catch (Exception e){
                System.out.println("잘못된입력입니다. 다시 입력하세요");
                continue;
            }
            System.out.println(bu.getAge()+" "+ bu.getGender()+" "+bu.getName());
        }
    }
}
