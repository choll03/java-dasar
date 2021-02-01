public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Wow anda lulus");
                break;
            case "B":
            case "C":
                System.out.println("Nilai cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // versi lamda java 14
        switch (nilai) {
            case "A" -> System.out.println("Wow anda lulus");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin salah jurusan");
            }
        }


        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow anda lulus";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin salah jurusan";
            }
        }

        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield "Wow anda lulus";
            case "B", "C":
                yield "Nilai anda cukup baik";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield "Mungkin salah jurusan";
        };

        System.out.println(ucapan);
    }
}
