package Classwork.day22_24_June;

import java.util.Objects;

public class Search {
    String user = "";
    boolean strict;

    public Search(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public Search() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    @Override
    public String toString() {
        return "Search{" +
                "user='" + user + '\'' +
                ", strict=" + strict +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Search search = (Search) o;
        return strict == search.strict && Objects.equals(user, search.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, strict);
    }
}
