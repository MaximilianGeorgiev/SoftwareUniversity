package Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 200sx on 4/6/2017.
 */
public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar(){
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        entries.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule(){
        Collections.sort(this.entries, WeeklyEntry.BY_DAY_COMPARATOR);

        return this.entries;
    }


}
