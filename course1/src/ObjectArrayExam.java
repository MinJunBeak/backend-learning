public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[1] = new Movie();
        m[2] = new Movie();
        m[0].title = "안녕, 할부지";
        m[1].title = "파일럿";
        m[2].title = "빅토리";
        System.out.println(m[0].title);
        System.out.println(m[1].title);
        System.out.println(m[2].title);
    }
}