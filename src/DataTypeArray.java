public class DataTypeArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Nik";
        arrayString[1] = "Akif";
        arrayString[2] = "Danis";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Nikk";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //Array initializer
        String[] namaNama = {
                "Nik", "Akif", "Danis"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9
        };

        System.out.println(namaNama[0]);
        System.out.println(arrayInt[0]);

        //Operation in Array
        // check panjang array
        System.out.println(namaNama.length);

       // arrayInt[0] = null;  cannot equal to null since it is primitive data type
        arrayInt[0] = 0;

        //Array dalam Array
        String[][] members = {
                {"Nik", "Akif", "Danis"},
                {"Muhammad", "Shaffi"},
                {"Muhammad", "Amsyar"}
        };
        System.out.println(members[0][1]);
    }
}
