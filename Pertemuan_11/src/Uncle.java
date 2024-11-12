import java.util.HashMap;
import java.util.Map;

public class Uncle {
    private String name;
    private Map<Niece, String> presents;

    protected Uncle(String name) {
        this.name = name;
        presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient) || presents.containsValue(description)) {
            return false;
        }
        presents.put(recipient, description);
        recipient.receivePresent(this, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Hadiah dari " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println("- " + niece.getName() + ": " + presents.get(niece));
        }
    }
}
