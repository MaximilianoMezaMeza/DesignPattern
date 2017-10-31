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
public class AudioPlayer implements MediaPlayer {
    
    MediaAdapter adapterMediaPlayer;

    public AudioPlayer() {
        adapterMediaPlayer=new MediaAdapter();
    }
    
    
    
    @Override
    public void play(String audioType,String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("playing Mp3, "+fileName);
        }else{
            if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            adapterMediaPlayer.play(audioType, fileName);
            }else{
                System.out.println("Format not supported for file : "+fileName);
            }
        }
    }
    
}
