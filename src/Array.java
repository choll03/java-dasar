public class Array {

    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "ismail";
        arrayString[1] = "skom";
        arrayString[2] = "mkom";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        String[] arrayString2 = new String[3];

        String[] namaNama = {
                "ismail", "skom", "mkom"
        };

        // menghapus data array
        namaNama[0] = null;

        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8
        };

        System.out.println(arrayInt.length);

        String[][] members = {
                {"ismail", "skom", "mkom"},
                {"Nur", "skom"},
                {"Jika"},
        };

        System.out.println(members[2][0]);
    }
}
