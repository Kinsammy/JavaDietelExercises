package revisionWithChief;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NativeTest {
    private Native amirah;
    private Native wumi;
    private Native jude;
    private Native rapheal;

    @BeforeEach
    public void setUp(){
        amirah = new Native();
        amirah.setFirstName("Amira");
        amirah.setSurname("Yusuf");
        amirah.setNativeId("SCV1308");
        wumi = new Native("SCV1308","Adewumi", "Adeola");
        jude = new Native("Jude");
        amirah.setCohorts(Cohorts.PARAGONS);
        Laptop amirahLaptop = new Laptop();
        amirahLaptop.setColor("Pink");
        amirahLaptop.setModel("Dell");
        amirahLaptop.setModelId("Lt132");
    }

    @Test
    public void checkNative() {
        assertNotNull(amirah.getNativeId());
        assertEquals("Amira", amirah.getFirstName());
        assertNotNull(wumi.getNativeId());
        assertEquals("SCV1308", wumi.getNativeId());
        assertEquals("Sam Immanuel", Native.getChief() );
        assertEquals(Cohorts.PARAGONS, amirah.getCohorts());
    }

    @Test
    public void nativeCountTest(){
        int nativeCount = amirah.countNatives();
        assertEquals(1, amirah.countNatives());
        assertEquals(37, amirah.countNatives("Paragon"));
        assertEquals(5, amirah.countNatives("Paragon", "Juno"));
    }


    @Test
    public void findNativeTest(){
        Native[] wimps;
        Native[] paragons = new Native[4];
        Native[] natives = {amirah, wumi, jude, rapheal};
        Native foundNative = amirah.findNatives(natives);
    }
}
