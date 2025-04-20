import java.time.LocalDate;
import java.util.*;

public class Gallery {
    private Map<String,List<Photo>> galleryTags;
    private Map<LocalDate,List<Photo>> galleryDate;
    private Map<String,List<Photo>> galleryLocation;

    public Gallery() {
        galleryTags = new HashMap<>();
        galleryDate = new HashMap<>();
        galleryLocation = new HashMap<>();
    }

    public Map<String, List<Photo>> getGalleryTags() {
        return galleryTags;
    }

    public void setGalleryTags(Map<String, List<Photo>> galleryTags) {
        this.galleryTags = galleryTags;
    }

    public Map<LocalDate, List<Photo>> getGalleryDate() {
        return galleryDate;
    }

    public void setGalleryDate(Map<LocalDate, List<Photo>> galleryDate) {
        this.galleryDate = galleryDate;
    }

    public Map<String, List<Photo>> getGalleryLocation() {
        return galleryLocation;
    }

    public void setGalleryLocation(Map<String, List<Photo>> galleryLocation) {
        this.galleryLocation = galleryLocation;
    }

    public void addPhoto(Photo photo) {
        for (String tag : photo.getTag()) {
            if (galleryTags.containsKey(tag)) {
                galleryTags.get(tag).add(photo);
            } else {
                galleryTags.put(tag, new ArrayList<>(List.of(photo)));
            }
        }

        if (galleryDate.containsKey(photo.getDate())) {
            galleryDate.get(photo.getDate()).add(photo);
        } else {
            galleryDate.put(photo.getDate(), new ArrayList<>(List.of(photo)));
        }

        if (galleryLocation.containsKey(photo.getLocation())) {
            galleryLocation.get(photo.getLocation()).add(photo);
        } else {
            galleryLocation.put(photo.getLocation(), new ArrayList<>(List.of(photo)));
        }
    }

    public List<Photo> searchByTag(Set<String> tags){
        List<Photo> PhotoResult= new ArrayList<>();
        for(String t:tags){
            if(galleryTags.containsKey(t)){
                PhotoResult.addAll(galleryTags.get(t));
            }
        }
        for(Photo p:PhotoResult){
            System.out.println(p.getTag());
            System.out.println(p.getDate());
            System.out.println(p.getLocation());
            System.out.println("-----------------------------");
        }
        return PhotoResult;
    }

    public List<Photo> searchByDate(LocalDate Date){
        List<Photo> PhotoResult= new ArrayList<>();
            if(galleryDate.containsKey(Date)){

                PhotoResult.addAll(galleryDate.get(Date));
            }
        for(Photo p:PhotoResult){
            System.out.println(p.getTag());
            System.out.println(p.getDate());
            System.out.println(p.getLocation());
            System.out.println("-----------------------------");
        }
        return PhotoResult;
    }

    public List<Photo> searchByLocation(String Location){
        List<Photo> PhotoResult= new ArrayList<>();
        if(galleryLocation.containsKey(Location)){

            PhotoResult.addAll(galleryLocation.get(Location));
        }
        for(Photo p:PhotoResult){
            System.out.println(p.getTag());
            System.out.println(p.getDate());
            System.out.println(p.getLocation());
            System.out.println("-----------------------------");
        }
        return PhotoResult;
    }
}
