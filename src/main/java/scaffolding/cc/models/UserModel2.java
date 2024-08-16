package scaffolding.cc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel2 {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fecha;
}