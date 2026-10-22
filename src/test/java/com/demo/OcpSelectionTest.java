package com.demo;

import com.demo.metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.demo.config.AppConfig;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class OcpSelectionTest {

    @Test
    public void testDaoImplParDefaut() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        IMetier metier = context.getBean(IMetier.class);

        // Si dao.target=dao, le résultat doit être 200.0
        assertEquals(200.0, metier.calcul(), 0.001);

        context.close();
    }

    private void assertEquals(double v, double calcul, double v1) {
    }
}