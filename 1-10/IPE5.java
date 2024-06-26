public class IPE5 {
    public static void FahtoCal(int Fah) {
        float cal = 5 * (Fah - 32) / 9;
        System.out.println("cal= " + cal);
    }

    public static void CaltoFah(int cal) {
        float fah = (9 * cal) / 5 + 32;
        System.out.println("fah = " + fah);
    }

    public static void main(String[] args) {
        // 5. that converts Fahrenheit temperature to centigrade and vis-a-versa
        // Centigrade =(5* (fahr.-32))/9
        // fa = 9 *ca /5 +32
        FahtoCal(50);
        CaltoFah(10);

    }

}
