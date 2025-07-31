public class Continue {
    public static void main(String[] args) {
        for (int counter=1; counter <=100; counter++){
            if (counter % 2 == 1) { //untuk genap != 0, == 1
                continue;
            }
            System.out.println("Perulangan ganjil-"+ counter);
        }
    }
}
