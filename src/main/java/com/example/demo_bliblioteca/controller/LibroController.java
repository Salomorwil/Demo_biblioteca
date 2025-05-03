package com.example.demo_bliblioteca.controller;

import com.example.demo_bliblioteca.service.LibroService;
import com.example.demo_bliblioteca.model.Libro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public List<Libro> agregarLibros(){
        return libroService.getLibros();
    }
    
    @GetMapping("/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.getLibroId(id);
    }

    @DeleteMapping("/{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibros(){
        return libroService.totalLibrosv1();
    }

    @GetMapping("/isbn/{isbn}")
    public Libro buscarPorIsbn(@PathVariable String isbn){
        return libroService.buscarIsbn(isbn);
    }

}
