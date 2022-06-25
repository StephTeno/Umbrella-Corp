package Clases.Estados_financieros;
public class ElementosEF {
    private String mCodigo;
    private String mCuenta;
    private double mValor;

    public ElementosEF(String codigo, String cuenta, double valor) {
        mCodigo = codigo;
        mCuenta = cuenta;
        mValor = valor;
    }

    public String getCodigo() {
        return mCodigo;
    }

    public void setCodigo(String codigo) {
        mCodigo = codigo;
    }

    public String getCuenta() {
        return mCuenta;
    }

    public void setCuenta(String cuenta) {
        mCuenta = cuenta;
    }

    public double getValor() {
        return mValor;
    }

    public void setValor(double valor) {
        mValor = valor;
    }
}
