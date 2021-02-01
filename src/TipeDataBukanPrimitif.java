public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 30;
        Integer iniInteger2 = iniInt;
        int ageAgain = iniInteger2;

        Integer iniObject = ageAgain;

        short shortAge = iniObject.shortValue();
        long longAge = iniObject.longValue();

    }
}
