public class p01_RectangleOf10x10Stars {
    public static void main(String[] args) {

        for (int rows = 0; rows < 10; rows++) {
            for (int cols = 0; cols < 10; cols++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
