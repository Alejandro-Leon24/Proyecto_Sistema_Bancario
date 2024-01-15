package Logica;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Usuario{
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date FechaNacimiento;
     private String contrasena;
    
    //private List<Cuenta> cuentas;
    public HashMap<Long, Cuenta> Cuentas;
    
    public Usuario(){
        //cuentas = new ArrayList<>();
        Cuentas = new HashMap<>();
    }
    public void RegistrarUsuario(String cedula, String nombre, String apellido, String direccion, Date FechaNacimiento, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.contrasena = contrasena;
        
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public void crearCuenta(long n, Cuenta c){

        Cuentas.put(n, c);
    }

    public Cuenta obtenerCuenta(Long numeroCuenta) {
        return Cuentas.get(numeroCuenta);
    }
    
    public String obtenerTodasCuentas(){
        return Cuentas.toString();
    }
    
    public boolean RevisarCuentasRepetidas(Long numero){
        return this.Cuentas.containsKey(numero);
        
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.cedula);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellido);
        hash = 83 * hash + Objects.hashCode(this.direccion);
        hash = 83 * hash + Objects.hashCode(this.FechaNacimiento);
        hash = 83 * hash + Objects.hashCode(this.contrasena);
        hash = 83 * hash + Objects.hashCode(this.Cuentas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        if (!Objects.equals(this.FechaNacimiento, other.FechaNacimiento)) {
            return false;
        }
        return Objects.equals(this.Cuentas, other.Cuentas);
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", FechaNacimiento=" + FechaNacimiento + ", contrasena=" + contrasena + ", Cuentas=" + Cuentas + '}';
    }


    
}
