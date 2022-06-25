package Clases.BalanceComprobacion;

public class Asiento {
    private String mCuenta;
    private String mCuenta1;
    private double mDebe;
    private double mHaber;
    private int mRegistro;
    private String mReferencia;
    private String mReferencia1;
    public Asiento(double mDebe, double mHaber, String mCuenta, String mCuenta1, int mRegistro, String mReferencia, String mReferencia1) {
        this.mDebe = mDebe;
        this.mHaber = mHaber;
        this.mRegistro = mRegistro;
        this.mReferencia = mReferencia;
        this.mReferencia1 = mReferencia1;
        this.mCuenta=mCuenta;
        this.mCuenta1=mCuenta1;
    }
    
    public String getmCuenta() {
        return mCuenta;
    }
    public void setmCuenta(String mCuenta) {
        this.mCuenta = mCuenta;
    }
    public String getmCuenta1() {
        return mCuenta1;
    }
    public void setmCuenta1(String mCuenta1) {
        this.mCuenta = mCuenta1;
    }
    public double getmDebe() {
        return mDebe;
    }
    public void setmDebe(double mDebe) {
        this.mDebe = mDebe;
    }
    public double getmHaber() {
        return mHaber;
    }
    public void setmHaber(double mHaber) {
        this.mHaber = mHaber;
    }
    public int getmRegistro() {
        return mRegistro;
    }
    public void setmRegistro(int mRegistro) {
        this.mRegistro = mRegistro;
    }
    public String getmReferencia() {
        return mReferencia;
    }
    public void setmReferencia(String mReferencia) {
        this.mReferencia = mReferencia;
    }
    public String getmReferencia1() {
        return mReferencia1;
    }
    public void setmReferencia1(String mReferencia1) {
        this.mReferencia1 = mReferencia1;
    }
}
