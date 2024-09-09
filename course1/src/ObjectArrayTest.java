public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book();
        b[0].title = "자바";
        b[0].price = 30000;
        b[0].company = "한빛";
        b[0].author = "박매일";
        b[0].page = 500;
        b[0].isbn = "11889900";
        System.out.println("b[0].title = " + b[0].title);
        System.out.println("b[0].price = " + b[0].price);
        System.out.println("b[0].company = " + b[0].company);
        System.out.println("b[0].author = " + b[0].author);
        System.out.println("b[0].page = " + b[0].page);
        System.out.println("b[0].isbn = " + b[0].isbn);
        b[1] = new Book();
        b[2] = new Book();
    }
}