/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video;

/**
 *
 * @author User-PC
 */
public class VideoStore
{

    /**
     *
     * @param args
     */
    public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );

    item1.show();
    item2.show();
  }
}

