
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Set<String> tags1=new HashSet<>();
        tags1.add("Mohamed");
        tags1.add("Hassan");
        tags1.add("Yahya");

        Set<String> tags2=new HashSet<>();
        tags2.add("Mohamed");
        tags2.add("Mokhtar");
        tags2.add("zizo");

        Set<String> tags3=new HashSet<>();
        tags3.add("sara");
        tags3.add("Hassan");
        tags3.add("ahmed");

        Photo p1=new Photo(tags1,LocalDate.of(2003,3,25),"Cairo",3,4);
        Photo p2=new Photo(tags2,LocalDate.of(2003,6,25),"Cairo",5,8);
        Photo p3=new Photo(tags3,LocalDate.of(1997,10,5),"qalyub",10,40);

        Gallery gallery=new Gallery();
        gallery.addPhoto(p1);
        gallery.addPhoto(p2);
        gallery.addPhoto(p3);


//        Set<String> tag=new HashSet<>();
//        tag.add("sara");
//        gallery.searchByDate(LocalDate.of(2003,3,25));
//        gallery.searchByLocation("Cairo");
//        gallery.searchByLocation("qalyub");

    }
}
