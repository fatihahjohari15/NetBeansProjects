/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author User-PC
 */
class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    title = ttl; length = lngth; avail = true; 
  }

  public void show()
  {
   System.out.println(title + ", " + length + " min. available:" + avail );
  }
}

public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Microcosmos", 90 );
    Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG" );
    item1.show();
    item2.show();

  }
}

    
