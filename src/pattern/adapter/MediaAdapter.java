/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.adapter;

/**
 *
 * @author Max
 */
public class MediaAdapter implements MediaPlayer{
    
    private AdvancedMediaPlayer vlcAdapterMediaPlayer;
    private AdvancedMediaPlayer mp4AdapterMediaPlayer;

    public MediaAdapter() {
        this.vlcAdapterMediaPlayer = new  VlcPlayer();
         this.mp4AdapterMediaPlayer = new Mp4Player();
    }
    

    @Override
    public void play(String audioType,String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcAdapterMediaPlayer.playVlc(fileName);
        }else{
           mp4AdapterMediaPlayer.playMp4(fileName);
        }
    }
    
}
