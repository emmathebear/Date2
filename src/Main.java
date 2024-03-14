import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = dataToYear(data);
        String month = dataToMonth(data);
        String day = dataToDayOfMonth(data);
        String dayOfWeek = dataToDayOfWeek(data);
        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("day of week: " + dayOfWeek);
    }
    public static String dataToYear(OffsetDateTime data){
        if (data == null){
            return "origin data was null";
        }
        return String.valueOf(data.getYear());
    }
    public static String dataToMonth(OffsetDateTime data){
        if (data == null){
            return "origin data was null";
        }
        return String.valueOf(data.getMonth());
    }
    public static String dataToDayOfMonth(OffsetDateTime data){
        if (data == null){
            return "origin data was null";
        }
        return String.valueOf(data.getDayOfMonth());
    }
    public static String dataToDayOfWeek(OffsetDateTime data){
        if (data == null){
            return "origin data was null";
        }
        return String.valueOf(data.getDayOfWeek());
    }
}