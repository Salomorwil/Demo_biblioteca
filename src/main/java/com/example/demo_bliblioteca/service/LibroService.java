package com.example.demo_bliblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo_bliblioteca.model.Libro;
import com.example.demo_bliblioteca.repository.LibroRepository;


@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorID(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "producto eliminado";
    }

    public int totalLibrosv1(){
        return libroRepository.totalLibros();
    }

    public Libro buscarIsbn(String isbn){
        return libroRepository.buscarPorIsbnv1(isbn);
    }  
}
