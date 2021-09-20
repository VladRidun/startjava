public class Cycle {   
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            System.out.println("i=" + i);
        }
        int a= 6;
        while (a>=-6)
        {
            System.out.println("a=" + a);
            a= a - 2;}

            int x=10;
            int count = 0;
        do {
            if (x % 2 != 0) {
            count= count+x;}
            x++; 
        } while (x <= 20);
        System.out.println("Summa nechetnyh chisel ="+count);
    }
}