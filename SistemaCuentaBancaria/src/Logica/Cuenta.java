package Logica;

import java.awt.Desktop;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private TipoCuenta tipoCuenta;
    private double servicioBanco;
    private Date FechaCreacion;
    
    public HashMap <Double, Double> transacciones;
    public HashMap <Double, Double> retiros;

    // Enumeración para el tipo de cuenta
    public enum TipoCuenta {
        AHORRO,
        CORRIENTE
    }

    public Cuenta() {
        transacciones = new HashMap<>();
        retiros = new HashMap<>();
    }
    
      public void RegistrarCuenta(long numeroCuenta, double saldo, TipoCuenta tipoCuenta, double servicioBanco, Date creacion) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.servicioBanco = servicioBanco;
        this.FechaCreacion = creacion;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getServicioBanco() {
        return servicioBanco;
    }

    public void setServicioBanco(double servicioBanco) {
        this.servicioBanco = servicioBanco;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.numeroCuenta ^ (this.numeroCuenta >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.tipoCuenta);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.servicioBanco) ^ (Double.doubleToLongBits(this.servicioBanco) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.FechaCreacion);
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
        final Cuenta other = (Cuenta) obj;
        if (this.numeroCuenta != other.numeroCuenta) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.servicioBanco) != Double.doubleToLongBits(other.servicioBanco)) {
            return false;
        }
        if (this.tipoCuenta != other.tipoCuenta) {
            return false;
        }
        return Objects.equals(this.FechaCreacion, other.FechaCreacion);
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + ", servicioBanco=" + servicioBanco + ", FechaCreacion=" + FechaCreacion + '}';
    }


    
    public static void leerPDF(JFrame inicio){
        try {
            File file = new File("Términos y Condiciones del Banco.pdf");
            
            if(file.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(file);
                }else{
                    JOptionPane.showMessageDialog(inicio, "La computadora no tiene soporte","Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(inicio, "EL archivo a sido elimado o no se a encontrado","Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
}
