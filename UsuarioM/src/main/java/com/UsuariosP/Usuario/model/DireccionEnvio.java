package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "direcciones_envio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DireccionEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;
    
    private String calle;
    private String numero;
    private String comuna;
    private String ciudad;
    private String region;
    private String codigoPostal;
    private String referencia;
    private String direccionPrincipal;
    private Boolean activa;

    
}
