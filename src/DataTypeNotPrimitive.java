public class DataTypeNotPrimitive {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        // kalau tak initialize iniByte, akan error
        // kalau letak value takpa/ ataupun letak null (data tak primitif
        // default value dia null

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //conversion primitve into not primitive

        int iniInt = 100;

        Integer iniInteger2 = iniInt; // automatic conversion using this

        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        //error dari short ke Integer, kena guna method
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float iniFloat =ageObject.floatValue();

    }
}
