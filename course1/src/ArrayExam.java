public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A', 'P', 'P', 'L', 'E'};
        for (int i = 0; i < c.length; i++) {
            int s = c[i] + 32;
            System.out.print((char) s);
        }
    }
}