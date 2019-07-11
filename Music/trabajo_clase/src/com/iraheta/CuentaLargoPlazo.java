package com.iraheta;

public class CuentaLargoPlazo extends Cuenta{

    public final double SALDO_RETIRAR =0.05;

    public boolean retirar(double monto){
       monto += (monto* SALDO_RETIRAR);
        return super.retirar(monto);
    }
}
