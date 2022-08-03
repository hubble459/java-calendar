public class Apple {
    public static void main(String[] args) {
        new Apple().run();
    }

    public void run() {
        Calendar cld = new Calendar();
        cld.newDailyAppointment("Leg Day", 2019, 12, 9);
        cld.newMonthlyAppointment("Pride Month", 2020, 1, 1);
        cld.newAppointment("Gay", 2019, 12, 10);
        cld.newAppointment("Hey", 2019, 12, 10);
        System.out.println(cld);
    }
}
