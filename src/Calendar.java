import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void newAppointment(String description, int year, int month, int day) {
        appointments.add(new Appointment(description, year, month, day));
    }

    public void newDailyAppointment(String description, int year, int month, int day) {
        for (int i = month; i <= 12; i++) {
            for (int j = day; j <= LocalDate.of(year, month, day).lengthOfMonth(); j++) {
                appointments.add(new Appointment(description, year, i, j));
            }
        }
    }

    public void newMonthlyAppointment(String description, int year, int month, int day) {
        for (int i = month; i <= 12; i++) {
            appointments.add(new Appointment(description, year, i, day));
        }
    }

    @Override
    public String toString() {
        ArrayList<LocalDate> dates = new ArrayList<>();
        String result = "";
        for (Appointment appointment : appointments) {
            if (!dates.contains(appointment.date)) {
                result += appointment.toString();
                for (Appointment appointment1 : appointments) {
                    if (appointment1.date.isEqual(appointment.date) && !appointment.description.equals(appointment1.description)) {
                        result += "\n" + appointment1.description;
                    }
                }
                result += "\n\n";
                dates.add(appointment.date);
            }
        }
        return result;
    }
}
