import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String month = String.valueOf(data.getMonth());
        String day = String.valueOf(data.getDayOfMonth());
        String dayOfWeek = String.valueOf(data.getDayOfWeek());
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("day of week: " + dayOfWeek);
    }
}