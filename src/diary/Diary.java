package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked;
    private final String password;
    private final List<Entry> entries;

    public Diary(String ownersName, String password){
        this.password = password;
        isLocked = true;
        entries = new ArrayList<>();
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        if (password.equals(this.password)){
            isLocked = false;
        }
    }

    public void lock() {
        isLocked = true;
    }

    public void write(String title, String body) {
        if (!isLocked) {
            writeIntoDiary(title, body);
        }

    }

    private void writeIntoDiary(String title, String body){
        int id = numberOfEntries() + 1;
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    public int numberOfEntries() {
        return entries.size();
    }

    public Entry findEntryWith(int id) {
        for (Entry entry : entries){
            if (entry.getId()== id)
                return entry;
        }
        return null;
    }
}
