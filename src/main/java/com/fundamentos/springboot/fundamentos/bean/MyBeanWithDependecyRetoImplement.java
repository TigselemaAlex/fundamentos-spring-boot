package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependecyRetoImplement implements MyBeanWithDependencyReto {

    private MyOperationReto myOperationReto;

    public MyBeanWithDependecyRetoImplement(MyOperationReto myOperationReto) {
        this.myOperationReto = myOperationReto;
    }


    @Override
    public void mostrar() {
        System.out.println(myOperationReto.resta(2, 1));
        System.out.println("Hola desde el reto");
    }
}
