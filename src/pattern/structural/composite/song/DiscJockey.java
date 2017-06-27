/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/10/composite-design-pattern-tutorial/
 */
package pattern.structural.composite.song;

public class DiscJockey{

    SongComponent songList;

    // newSongList contains every Song, SongGroup,
    // and any Songs saved in SongGroups

    public DiscJockey(SongComponent newSongList){

        songList = newSongList;

    }

    // Calls the displaySongInfo() on every Song
    // or SongGroup stored in songList

    public void getSongList(){

        songList.displaySongInfo();

    }

}