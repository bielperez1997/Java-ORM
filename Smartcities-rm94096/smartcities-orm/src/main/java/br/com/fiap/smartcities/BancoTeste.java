package br.com.fiap.smartcities;

import jakarta.persistence.Persistence;

public class BancoTeste {

 

    public static void main(String[] args) {

         Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();

    }

   

}