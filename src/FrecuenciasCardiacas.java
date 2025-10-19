 public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;


    /**
     * Constructores
     */
    public FrecuenciasCardiacas() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    /**
     * Métodos propios de Java
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int díaNacimiento) {
        this.diaNacimiento = díaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    /**Metodo que imprimie los datos*/
    public void detalle() {
        System.out.println("\nNombre: " + nombre + " " + apellido);
        System.out.println("Fecha de nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento);
    }
    /**Método para calcular la edad*/
    public int calcularEdad() {
        int anioActual = 2025;
        int mesActual = 10;
        int diaActual = 19;

        /**Validación de las fevhas**/
        if (anioNacimiento < 0 || mesNacimiento < 1 || mesNacimiento > 12 || diaNacimiento < 1 || diaNacimiento > 31) {
            System.out.println("Ingrese una fecha válida");
            return -1;
        }

        int edad = anioActual - anioNacimiento;

        if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
            edad=edad-1;
        }

        System.out.println("Su edad es: " + edad + " años");
        return edad;
    }
     /**Método para calular la frecuencia cardiaca*/
    public int calcularFrecuenciaMaxima(int edad) {
        return 220 - edad;
    }

    /**Método resume la frecuencia Cardiaca*/
    public void mostrarFrecuenciaEsperada(int edad) {
        int frecuenciaMaxima = calcularFrecuenciaMaxima(edad);
        double rangoMin = frecuenciaMaxima * 0.50;
        double rangoMax = frecuenciaMaxima * 0.85;

        System.out.println("Frecuencia cardiaca máxima: " + frecuenciaMaxima + " pulsos por minuto");
        System.out.println("Rango de frecuencia cardiaca esperada: entre " +
                String.format("%.1f", rangoMin) + " y " +
                String.format("%.1f", rangoMax) + " pulsos por minuto");
    }
}


