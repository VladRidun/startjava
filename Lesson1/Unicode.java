public class Unicode {
    public static void main(String[] args) {
        int startRange = 33, endRange = 126;
        for (int i = startRange; i <= endRange; i++) {
            System.out.println("chislo " + i + " v Unicode = " + (char) i);
        }
    }
}