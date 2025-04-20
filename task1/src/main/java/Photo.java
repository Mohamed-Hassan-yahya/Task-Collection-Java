import java.time.LocalDate;
import java.util.Set;

public class Photo {
    private Set<String> Tag;
    private LocalDate Date;
    private String Location;

    public Photo(Set<String> Tag, LocalDate Date, String Location,double Latitude,double Longitude) {
        this.Tag=Tag;
        this.Date=Date;
        this.Location=Location;

    }

    public Set<String> getTag() {
        return Tag;
    }

    public void setTag(Set<String> tag) {
        Tag = tag;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


}
