import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class AgeFormatter {
    public static void main(String[] args) {
        String birthday = "15/05/2021";
        System.out.println("Your age is: "+ ageFormatter(birthday));
        System.out.println(dateFormat(birthday));
    }

    public static int ageFormatter(String birthday){
        String[] result = birthday.split("/");
         int day = Integer.parseInt(result[0]);
        int month = Integer.parseInt(result[1]);
        int year = Integer.parseInt(result[2]);

        LocalDate date = LocalDate.now();
        LocalDate birth = LocalDate.of(year, month, day);
        Period age = Period.between(birth, date);


        return age.getYears();
    }

    public static String dateFormat(String birthday) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM dd, yyyy", Locale.of(birthday));
        return dateFormat.format(new Date());

    }


}
