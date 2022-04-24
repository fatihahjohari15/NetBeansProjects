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
class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // U, SG, SX

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl, lngth );            //use the super class's constructor
    director = dir;  rating = rtng; 
  }
  
  public Movie( String ttl, String dir, String rtng )
  {
  super( ttl );    // invoke the matching parent class constructor  
  director = dir;  rating = rtng;     // initialize members unique to Movie
  }

 
  @Override
   public void show()
   {
       super.show();
       System.out.println(director+ ", "+rating);
   }
} 

