package Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 200sx on 4/1/2017.
 */
public class Book {
    private String title;
    private int age;
    private List<String> authors;

    public Book(String title, int age, String... authors){
        this.setTitle(title);
        this.setAge(age);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public List<String> getAuthors() {
        return Collections.unmodifiableList(this.authors);
    }

    private void setAuthors(String... aut) {
        List<String> currentList = new ArrayList<>();

        for (String s : aut) {
            currentList.add(s);
        }

        this.authors = currentList;
    }
}
