package upeu.edu.pe.biblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {

	private int idprestamo;
	private String fecha_pres;
	private String fecha_dev;
	private int idempleado;
	private int idcliente;
}
