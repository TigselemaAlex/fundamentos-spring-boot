package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependecy;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencyReto;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

    //Injectar la dependecia
    //Primero se declara la interfaz
    private ComponentDependency componentDependency;
    private MyBean myBean;

    private MyBeanWithDependecy myBeanWithDependecy;

    private MyBeanWithDependencyReto myBeanWithDependencyReto;

    //Se crea el cosntructor y se inicializa la dependencia
    //Qualifier => le pasas que clase quieres que se implemente
    public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
                                  MyBean myBean, MyBeanWithDependecy myBeanWithDependecy,
                                  MyBeanWithDependencyReto myBeanWithDependencyReto) {
        this.componentDependency = componentDependency;
        this.myBean = myBean;
        this.myBeanWithDependecy = myBeanWithDependecy;
        this.myBeanWithDependencyReto = myBeanWithDependencyReto;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        componentDependency.saludar();
        myBean.print();
        myBeanWithDependecy.printWithDependecy();
        myBeanWithDependencyReto.mostrar();
    }
}
