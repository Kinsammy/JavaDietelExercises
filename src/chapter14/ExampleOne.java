package chapter14;

public class ExampleOne {
    public static void main(String[] args) {
        String name = "";
        Byte item11 = Byte.parseByte("65");
        Byte item112 = Byte.parseByte("66");
        Byte item13 = Byte.parseByte("67");

        byte[] myByteArray = {item11, item112, item13};

        String myName = new String(myByteArray, 0, 3);
        System.out.println("str:: " +myName);
        System.out.println(myName.length() == 3);

        char[] charArray= {'A', 'b', 'c', 'd'};
        String mySchoolName = new String(charArray);
        System.out.println(mySchoolName);

        String secondame = new String("martha");
        System.out.println(secondame);
        System.out.println(secondame.charAt(3));
    }
}
