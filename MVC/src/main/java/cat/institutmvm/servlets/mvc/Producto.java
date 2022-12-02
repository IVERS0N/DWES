/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.servlets.mvc;

/**
 *
 * @author daw
 */
public class Producto {
    private int id;
    private String titulo;
    private float precio;
    private String interprete;
    private String album;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getInterprete() {
        return interprete;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public Producto(){
        this.id = -1;
        this.titulo = "";
        this.precio = 0f;
        this.interprete = "";
        this.album = "";
    }
 
    public Producto(int id, String titulo, float precio, String interprete, String album) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.interprete = interprete;
        this.album = album;
    }
}
