public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        //Tanpa ternary operator

        if(nilai >= 75){
            ucapan = "Selamat anda lulus";
        }else {
            ucapan = "Anda gagal";
        }

        System.out.println(ucapan);

        // Code dengan ternary operator
        var nilai1 = 75;
        String ucapan1 = nilai >=75 ? "Selamat anda lulus" : "Anda gagal";

        System.out.println(ucapan1);
    }
}
