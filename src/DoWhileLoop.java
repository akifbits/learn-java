public class DoWhileLoop {
    public static void main (String[] args){

        var counter = 100; // eventho salah , dia still akan run dulu sekali
        do {
            System.out.println("Perulangan Ke-"+counter);
            counter++;
        }while(counter<=10);
    }

}
