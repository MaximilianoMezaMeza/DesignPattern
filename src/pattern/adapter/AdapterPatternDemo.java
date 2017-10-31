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
public class AdapterPatternDemo {
    static public void main(String [] argv){
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("vlc", "MyMovie.vlc");
        audioPlayer.play("mp4", "MyMovieMp4.mp4");
        audioPlayer.play("mp3", "Echoes.mp3");
        audioPlayer.play("avi", "Echoes.avi");
    } 
}
