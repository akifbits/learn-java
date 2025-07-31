public class ForEach {
    public static void main(String[] args) {
        // code tanpa for each

        String[] array = {
                "Nik", "Akif", "Danis"
        };

        for (int i=0; i< array.length; i++) {
            System.out.println(array[i]);
        }

        // code guna for each
        for (var value : array) { //bole guna var atau ikut data type array tu, String
            System.out.println(value);
        }

    }
}
