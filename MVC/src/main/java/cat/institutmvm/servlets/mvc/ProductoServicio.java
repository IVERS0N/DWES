/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.servlets.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw
 */
public class ProductoServicio {
    int contador = 0;
    ArrayList<Producto> addSong = new ArrayList<>();
    public void addMusica(String interprete, float precio, String titulo, String album){
        Producto musica = new Producto();
        contador++;
        musica.setId(contador); 
        musica.setInterprete(interprete);
        musica.setPrecio(precio);
        musica.setTitulo(titulo);
        musica.setAlbum(album);
        addSong.add(musica);
    }

    public ArrayList<Producto> getSongs(){
        return addSong;
    }
    
       public List<Producto> getProductos(){
        List<Producto> products = new ArrayList<>();
        products.add(new Producto(1,"Quedate",799f,"Quevedo","BZRP Music Sessions"));
        products.add(new Producto(2,"Cuidao por ahí",599f,"Bad Bunny","Oasis"));
        products.add(new Producto(3,"Shelter",159f,"Finneas O'Connell","When We All Fall Asleep, Where Do We Go?"));
        return addSong;
    }
       
    /**
     *
     * @param id
     * @return
     */
    public Producto getProducto(int id) {
        Producto product = null;
        switch(id)
        {
            case 1:
                product = new Producto(1,"Quedate",799f,"Quevedo","BZRP Music Sessions");
                break;
            case 2:
                product = new Producto(2,"Cuidao por ahí",599f,"Bad Bunny","Oasis");
                break;
            case 3:
                product = new Producto(3,"Shelter",159f,"Finneas O'Connell","When We All Fall Asleep, Where Do We Go?");
                break;
        }
        return product;
    } 
    
}
