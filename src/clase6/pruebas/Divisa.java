package clase6.pruebas;

public class Divisa {

    private int importe;
    private String denominacion;

    public Divisa(int imp, String den) {
        this.importe = imp;
        this.denominacion = den;
    }

    public int getImporte() {
        return importe;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Divisa sumar(Divisa d) throws Exception {
        Divisa res;
        if (d.denominacion.equals(this.denominacion)) {
            res = new Divisa(d.importe + this.importe, this.denominacion);
            return res;
        } else {
            throw new Exception("Denominación diferente: no se pueden sumar");
        }
    }
}
