package Clases.BalanceComprobacion;
public class ElementoBalanceDeComprobacion {
    private String mCodigo;
    private String mCuenta;
    private double mSumaDebe;
    private double mSumaHaber;
    private double mSaldoDebe;
    private double mSaldoHaber;

    public ElementoBalanceDeComprobacion(String codigo, String cuenta, double sumaDebe, double sumaHaber, double saldoDebe, double saldoHaber) {
        mCodigo = codigo;
        mCuenta = cuenta;
        mSumaDebe = sumaDebe;
        mSumaHaber = sumaHaber;
        mSaldoDebe = saldoDebe;
        mSaldoHaber = saldoHaber;
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

    public double getSumaDebe() {
        return mSumaDebe;
    }

    public void setSumaDebe(double sumaDebe) {
        mSumaDebe = sumaDebe;
    }

    public double getSumaHaber() {
        return mSumaHaber;
    }

    public void setSumaHaber(double sumaHaber) {
        mSumaHaber = sumaHaber;
    }

    public double getSaldoDebe() {
        return mSaldoDebe;
    }

    public void setSaldoDebe(double saldoDebe) {
        mSaldoDebe = saldoDebe;
    }

    public double getSaldoHaber() {
        return mSaldoHaber;
    }

    public void setSaldoHaber(double saldoHaber) {
        mSaldoHaber = saldoHaber;
    }
    @Override
    public String toString() {
        return "\t\t" + mCuenta + " \t\t" + mSaldoDebe + " \t\t" +  mSaldoHaber + " \t\t" +  mSumaDebe + " \t\t" + mSumaHaber;                      
    }
    
}
