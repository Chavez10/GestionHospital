
package com.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Configuraciones {
   public DriverManagerDataSource dataSrc = new DriverManagerDataSource();
    
    public DriverManagerDataSource conectar(){
        dataSrc.setDriverClassName("com.mysql.jdbc.Driver");
        dataSrc.setUrl("jdbc:mysql://localhost:3306/hospitalbd");
        dataSrc.setUsername("root");
        dataSrc.setPassword("");
        return dataSrc;
    } 
}
