package com.ufv.dis;

public class EmpleadoBR {

    double calcularSalarioBruto(String tipoEmpleado, double ventasMes, double horasExtra) throws BRException {
        if(ventasMes < 0 || horasExtra < 0 || tipoEmpleado == null)
        {
            throw new BRException("Valores de entrada no válidos");
        }
        return 0;
    }

    double calcularSalarioNeto(double salarioBruto)
    {
        return 0;
    }
}
