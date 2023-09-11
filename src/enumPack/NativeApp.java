package enumPack;

import java.util.Arrays;

import static enumPack.Day.*;

public class NativeApp {
    public static void main(String[] args) {
        Native amirah = new Native(TUESDAY);
        System.out.printf("Amirah Birth day is %s%n",amirah.getDayOfBirth());
        Region region = Region.SOUTH_SOUTH;
        System.out.println(Arrays.toString(region.getStates()));

    }
}
