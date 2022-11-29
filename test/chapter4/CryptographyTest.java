//package chapter4;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CryptographyTest {
//    private Cryptography cryptography;
//    @BeforeEach
//    public void setUp() {
//        cryptography = new Cryptography();
//    }
//
//    @Test
//    public void testThatObjectExist() {
//        assertNotNull(cryptography);
//    }
//
//    @Test
//    public void encrypt(){
//        String encryptedCode = Cryptography.encrypt(4132);
//        assertEquals(new String("0918"), encryptedCode);
//    }
//
//    @Test
//    public void decrypt(){
//        int encryptedCode = Cryptography.decrypt(2981);
//        assertEquals(1452, encryptedCode);
//    }
//}
