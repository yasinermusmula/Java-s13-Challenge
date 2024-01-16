package employeeApp;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {


        String[] developers = new String[3];

        HealthPlan h1 = new HealthPlan(1,"A Sigorta",Plan.BASIC);
        HealthPlan h2 = new HealthPlan(2, "B Sigorta",Plan.ADVANCE);

        System.out.println(h1);
        System.out.println(h2);

        //["A Sigorta", "B Sigorta",null]
        String[] healthPlans = new String[3]; // Ne kadar eleman olacağını belirttik.
        healthPlans[0] = h1.getName();
        healthPlans[1] = h2.getName();

        System.out.println("******************************");

        // new String[]{"A Sigorta","B Sigorta"}
        Employee employee = new Employee(1,"Ali Veli", "ali@veli.com","1234",healthPlans);
        employee.addHealthplan(0,"C Sigorta");
        employee.addHealthplan(2,"A Sigorta");
        employee.addHealthplan(2,"X Sigorta");
        employee.addHealthplan(3,"Y Sigorta");


        System.out.println(Arrays.toString(employee.getHealthplans())); // toString() javada her zaman bir objryi, referans degeri olan bi şeyi alır ve bizim için stringe cevirir
        // Bir metoda Sınıfının üzerinden erişebiliyorsan o metot static metodtur.
        // Static metotlar instance'lara bağlıdeğillerdir. Direk olarak sınıflara bağlıdır.

        // Employee.addHealthPlan(); mesela buna ulaşamayız çünkü static bir metot değil.

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programında ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
