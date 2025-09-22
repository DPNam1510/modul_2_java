package mvc_furama.utils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class CheckValidate {
    public static boolean checkId(String id) {
        String regexId = "^NV-\\d{4}$";
        return id.matches(regexId);
    }
    public static boolean checkId1(String id) {
        String regexId = "^KH-\\d{4}$";
        return id.matches(regexId);
    }

    public static boolean checkName(String name) {
        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
        return name.matches(regexName);
    }

    public static boolean checkDate(String date) {
       DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       LocalDate localDate = LocalDate.parse(date, dateTime);
       int age = Period.between(localDate, LocalDate.now()).getYears();
       return age > 18;
    }
    public static boolean checkIdCard(String idCard) {
        String regexIdCard ="^(\\d{9}|\\d{12})$";
        return idCard.matches(regexIdCard);
    }
    public static boolean checkPhone(String phone) {
        String regexPhone ="^0\\d{9}$";
        return phone.matches(regexPhone);
    }
    public static boolean checkSalary(int salary) {
        return salary > 0;
    }
}
