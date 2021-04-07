package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class MainController {

    final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
    final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", LOCALE);
    final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);

    @GetMapping("/cas")
    public ModelAndView zobrazCas() {
        ModelAndView result = new ModelAndView("cas");
        result.addObject("cas", LocalTime.now().format(TIME_FORMATTER));
        return result;
    }

    @GetMapping("/datum")
    public ModelAndView zobrazDatum() {
        ModelAndView result = new ModelAndView("datum");
        result.addObject("datum", LocalDate.now().format(DATE_FORMATTER));
        return result;
    }
}
