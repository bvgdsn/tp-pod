import java.time.LocalDateTime;

public class cliente {
    private int dni;
    private String nacionalidad;
    private LocalDateTime fecha_registro;  

    public cliente(int dni, String nacionalidad,LocalDateTime fecha_registro) {
        if (dni < 0) {
            throw new IllegalArgumentException("DNI must be greater than or equal to 0");
        }
        if (nacionalidad == null || nacionalidad.isEmpty()) {
            throw new IllegalArgumentException("Nacionalidad must have at least 1 character");
        }
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        String fechaRegistro = null;
		return "dni=" + dni + " nacionalidad='" + nacionalidad + "' fecha_registro=" + fechaRegistro;
    }

    public static void main(String[] args) {
        // Valid user
        cliente usuarioValido = Cliente();
        System.out.println(usuarioValido);

        // Invalid user with negative DNI
        try {
            Cliente();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Invalid user with empty nacionalidad
        try {
            Cliente();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

	private static cliente Cliente() {
		// TODO Auto-generated method stub
		return null;
	}

	public LocalDateTime getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(LocalDateTime fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
}
