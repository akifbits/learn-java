public class MethodVariableArgument {
    public static void main(String[] args) {
//        int[] values = {80,78,80,79,60};
        // kena buat array dulu kalau tak guna variable argument
//        sayCongrats("Akif",values);
        sayCongrats("Akif",70,80,90,78,80);
    }

//    static void sayCongrats(String name, int[] values){
     static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){ //sini dia still akan array
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " +name+ ", Anda Lulus!");
        }else {
            System.out.println("Maaf" +name+ ", Anda Gagal :(");
        }
    }
}
