package helpers;

import java.util.List;
import java.util.Map;

public class Recording {
    
    Long Id;
    String title;
    Map<String, Track> tracks;
    
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Map<String, Track> getTracks() {
        return tracks;
    }
    public void setTracks(Map<String, Track> tracks) {
        this.tracks = tracks;
    }



    
    

}
