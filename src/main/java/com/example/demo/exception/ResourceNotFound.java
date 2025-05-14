package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
    
    //faltou colocar o exception mas n estava funcionando
    public ResourceNotFound(String message) {
        super(message);
    }
}
