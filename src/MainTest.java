import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.OffsetDateTime;


class MainTest {

    @Test
    void dataToYearNull() {
        OffsetDateTime data = null;
        String year = Main.dataToYear(data);
        assertEquals("origin data was null", year);
    }
    @Test
    void dataToYearValidData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = Main.dataToYear(data);
        assertEquals("2023", year);
    }
    @Test
    void dataToYearValidData2() {
        OffsetDateTime data = OffsetDateTime.parse("2024-04-01T13:00:00Z");
        String year = Main.dataToYear(data);
        assertEquals("2024", year);
    }

    @Test
    void dataToMonthNull() {
        OffsetDateTime data = null;
        String year = Main.dataToMonth(data);
        assertEquals("origin data was null", year);
    }
    @Test
    void dataToMonthValidData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = Main.dataToMonth(data);
        assertEquals("MARCH", year);
    }
    @Test
    void dataToMonthValidData2() {
        OffsetDateTime data = OffsetDateTime.parse("2024-04-01T13:00:00Z");
        String year = Main.dataToYear(data);
        assertEquals("2024", year);
    }
    @Test
    void dataToDayOfMonthNull() {
        OffsetDateTime data = null;
        String year = Main.dataToDayOfMonth(data);
        assertEquals("origin data was null", year);
    }
    @Test
    void dataToDayOfMonthValidData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = Main.dataToDayOfMonth(data);
        assertEquals("1", year);
    }
    @Test
    void dataToDayOfMonthValidData2() {
        OffsetDateTime data = OffsetDateTime.parse("2024-04-03T13:00:00Z");
        String year = Main.dataToDayOfMonth(data);
        assertEquals("3", year);
    }
    @Test
    void dataToDayOfWeekNull() {
        OffsetDateTime data = null;
        String year = Main.dataToDayOfWeek(data);
        assertEquals("origin data was null", year);
    }
    @Test
    void dataToDayOfWeekValidData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String year = Main.dataToDayOfWeek(data);
        assertEquals("WEDNESDAY", year);
    }
    @Test
    void dataToDayOfWeekValidData2() {
        OffsetDateTime data = OffsetDateTime.parse("2024-04-01T13:00:00Z");
        String year = Main.dataToDayOfWeek(data);
        assertEquals("MONDAY", year);
    }

}