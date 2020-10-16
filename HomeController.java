package com.app.coronaVirusTracker.controllers;
import com.app.coronaVirusTracker.models.LocationStats;
import com.app.coronaVirusTracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;
    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
       int totalReportedCasesCount = allStats.stream().mapToInt(stat-> Integer.parseInt(stat.getTotalCasesCount())).sum();
       //allStats.stream().filter(s->s.getCountry().startsWith("United")).forEach(System.out::println);
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCasesCount",totalReportedCasesCount);
        return "home";

    }
}
