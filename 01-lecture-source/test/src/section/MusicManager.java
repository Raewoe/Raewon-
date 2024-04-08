package section;

import java.util.ArrayList;
import java.util.List;

public class MusicManager {

    private List<MusicDTO> musicList = new ArrayList<>();

    public void addList(MusicDTO music) {
        musicList.add(music);
    }

    public List<MusicDTO> selectList() {

        return musicList;
    }

    public List<MusicDTO> searchArtist(String artist) {

        List<MusicDTO> searchList = new ArrayList<>();

        for(MusicDTO music : musicList) {
            if(music.getArtist().contains(artist)) {
                searchList.add(music);
            }
        }

        return searchList;
    }

    public List<MusicDTO> searchTitle(String title) {

        List<MusicDTO> searchList = new ArrayList<>();

        for(MusicDTO music : musicList) {
            if(music.getTitle().contains(title)) {
                searchList.add(music);
            }
        }

        return searchList;
    }

    public boolean updateMusic(MusicDTO updateMusic){

        MusicDTO old = null;

        for(int i = 0; i < musicList.size(); i++) {
            if(musicList.get(i).getId() == updateMusic.getId()) {
                old = musicList.set(i, updateMusic);
            }
        }

        return old != null;
    }


    public boolean removeMusic(int id) {

        MusicDTO old = null;

        for(int i = 0; i < musicList.size(); i++) {
            if(musicList.get(i).getId() == id) {
                old = musicList.remove(i);
            }
        }

        return old != null;
    }
}
