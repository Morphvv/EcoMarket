package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cuentas_usuario")
@Getter
@Setter
@Builder


public class CuentaUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable= false, unique = true)
    private String nombreUsuario;

    @Column(nullable= false, unique = true) 
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)    
    private String rol;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String estadoCuenta;

    private LocalDateTime ultimoAcceso;
    
}
