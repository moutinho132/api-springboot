package com.dev.springboot.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Builder
@Data
@ToString

public class Votante implements Serializable {
    private String name;
    private String email;
    private String cedula;
}
