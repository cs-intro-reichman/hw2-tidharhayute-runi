public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].split(":")[0]);
        int minutes = Integer.parseInt(args[0].split(":")[1]);

        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        System.out.println((totalHours < 10 ? "0" + totalHours : totalHours) + ":" + (newMinutes < 10 ? "0" + newMinutes : newMinutes));
    }
}
