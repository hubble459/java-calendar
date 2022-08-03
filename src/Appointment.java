import java.time.LocalDate;

public class Appointment {
    protected String description;
    protected LocalDate date;

    public Appointment(String description, int year, int month, int day) {
        this.description = description;
        this.date = LocalDate.of(year, month, day);
    }

    public boolean occursOn(int year, int month, int day) {
        return date.isEqual(LocalDate.of(year, month, day));
    }

    @Override
    public String toString() {
        return date.toString() + "\n" + description;
    }
}
