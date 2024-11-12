import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Niece {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> receivedPresents;

    protected Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        receivedPresents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    public void receivePresent(Uncle uncle, String description) {
        receivedPresents.put(uncle, description);
    }

    public int clearPresents() {
        int count = receivedPresents.size();
        receivedPresents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println("Hadiah untuk " + name + ":");
        for (Uncle uncle : receivedPresents.keySet()) {
            System.out.println("- Dari " + uncle.getName() + ": " + receivedPresents.get(uncle));
        }
    }

    @Override
    public String toString() {
        return name + " (Ulang Tahun: " + day + "/" + month + ")";
    }
}
