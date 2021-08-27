package com.example.ex00.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import com.example.ex00.dto.SampleDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

@Log4j2
@Controller
public class HomeController {


    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("Welcome home! The client locale is {}." + locale);
        log.info("Welcome home! The client locale is {}." + locale);
        log.info("Welcome home! The client locale is {}." + locale);
        log.info("Welcome home! The client locale is {}." + locale);
        log.info("Welcome home! The client locale is {}." + locale);
        log.info("Welcome home! The client locale is {}." + locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        SampleDTO dto = new SampleDTO();
        dto.setFirst("Hong");
        dto.setLast("Gil Dong");

        model.addAttribute("serverTime", formattedDate );
        model.addAttribute("dto", dto );

        return "home";
    }

}

