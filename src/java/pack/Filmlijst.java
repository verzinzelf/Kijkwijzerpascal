/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.util.ArrayList;

/**
 *
 * @author Pascal
 */
public class Filmlijst {
    


    String html ="";
    String opvraag="";
    String website="";
  
   private ArrayList<Film> array;
    
    public Filmlijst(){ 
        
        array = new ArrayList<Film>();
    }
    
    public void voegtoefilm(){
        array.add(new Film(1877832, "X-Men: Days of Future Past", new Kijkwijzer("horror")));
        array.add(new Film(1086772, "Blended", new Kijkwijzer("detective")));
        array.add(new Film(1179031, "Cold in July", new Kijkwijzer("actie")));
        array.add(new Film(2405372, "Stand clear of the closing doors", new Kijkwijzer("romantisch")));
        array.add(new Film(2380331, "Words and Pictures", new Kijkwijzer("horror")));
        array.add(new Film(1294970, "The angriest man in Brooklyn", new Kijkwijzer("actie")));
 
        
    }
   

    public String maakPagina(){   // alle films op 1 pagina weergeven (tijdelijk uitgeschakeld).
      
        for(Film film : array)
        { 
        html += "<div class=\"informatie\">"
             +" De naam van de film:  "+ film.getNaam()+"<br />"
             + film.getPlaatjes()
             + "<a href=http://www.imdb.com/title/tt"+film.getImdb()+">" + "http://www.imdb.com/title/tt" + film.getImdb() + "</a><br /><br />"
             +  "</div>";
        }
     
        return html; 
    }   // eindigt hier
    
 /*     public String maakWebsite(){
            int i=0; 
            for(i=0; i<6; i++){
                website="<a href=http://www.imdb.com/title/tt"+array.get(i).getImdb()+">" + "http://www.imdb.com/title/tt" + array.get(i).getImdb() + "</a><br /><br />";
            }
                return website;
    }*/
    
    public String getOpvraag(int i){
        opvraag += "<div class=\"informatie\">"
                + "<br/>" + array.get(i).getPlaatjes()
                + array.get(i).getNaam()+"<br />"
          //      + this.maakWebsite()
                + "<a href=http://www.imdb.com/title/tt"+array.get(i).getImdb()+">" + "http://www.imdb.com/title/tt" + array.get(i).getImdb() + "</a><br /><br />"
                +  "</div>";
                
        return opvraag;
    }
  
}
