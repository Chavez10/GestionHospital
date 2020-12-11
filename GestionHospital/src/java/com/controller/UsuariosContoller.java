
package com.controller;

import com.config.Configuraciones;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UsuariosContoller {
    Configuraciones con = new Configuraciones();
    JdbcTemplate jdbc = new JdbcTemplate(con.conectar());
    ModelAndView mv = new ModelAndView();
    List datos;
    int idUsu;
    
    @RequestMapping("login.htm")
    public ModelAndView loggin(){
        mv.setViewName("login");
        return mv;
    }
    
    
}
