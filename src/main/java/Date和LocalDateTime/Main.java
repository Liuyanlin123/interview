package Date和LocalDateTime;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        Date beginContract = new Date(2018,8,12);
        Date endContract = new Date(2019,3,20);
        LocalDate localDate = LocalDate.of(2018,8,12);
        LocalDate localDate1 = LocalDate.of(2018,8,12);
        double month = (Double.parseDouble(yearFormat.format(endContract))
                - Double.parseDouble(yearFormat.format(beginContract))) * 12
                + (Double.parseDouble(monthFormat.format(endContract))
                - Double.parseDouble(monthFormat.format(beginContract)));
        System.out.println(Double.parseDouble(decimalFormat.format(month / 12))); ;
    }
}
