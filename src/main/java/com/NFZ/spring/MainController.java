package com.NFZ.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller
public class MainController {

    @Autowired
    private Crud crud;
    @Autowired
    private CrudDoc crudDoc;

    //@Autowired
    //private LoginRepository loginRepository;

    @PostMapping(path = "/addDoctors")
    public String addNewDoctor (@RequestParam String Nazwa, @RequestParam String Specjalizacja,
                                            @RequestParam String Stopien, @RequestParam String Placowka){
        Doctors nDoctors = new Doctors();
        nDoctors.setNazwa(Nazwa);
        nDoctors.setSpecjalizacja(Specjalizacja);
        nDoctors.setStopien(Stopien);
        nDoctors.setPlacowka(Placowka);
        crudDoc.save(nDoctors);
        return "DodanieLekarzy";
    }

    @PostMapping(path="/addUsers")
    public String addNewUser (@RequestParam String Imie, @RequestParam String Nazwisko,
                              @RequestParam Long Pesel, @RequestParam String Miasto,
                              @RequestParam String Ulica, @RequestParam Integer NumerDomu,
                              @RequestParam String Email, @RequestParam String Specjalizacja,
                              @RequestParam String Datawizyty, @RequestParam String Datauro,
                              @RequestParam String Placowka) {
            Users nUsers = new Users();
            nUsers.setImie(Imie);
            nUsers.setNazwisko(Nazwisko);
            nUsers.setPesel(Pesel);
            nUsers.setMiasto(Miasto);
            nUsers.setUlica(Ulica);
            nUsers.setNumerDomu(NumerDomu);
            nUsers.setEmail(Email);
            nUsers.setDatawizyty(Datawizyty);
            nUsers.setDatauro(Datauro);
            nUsers.setSpecjalizacja(Specjalizacja);
            nUsers.setPlacowka(Placowka);
            crud.save(nUsers);

            return "NFZstrona";
        //}
        /*
        int searchId = 23232; // ID of the Car
        boolean exists = crud.existsById(searchId);
        System.out.println(exists);
        return "NFZstrona";*/
    }


    @GetMapping(path = "/lekarze")
    public String lekarze(Model model){
        Iterable<Doctors> Doctorslist =crudDoc.findAll();
        model.addAttribute("Doctorslist", Doctorslist);
        return "Lekarze";
    }
    @GetMapping(path = "/wizyty")
    public String wizyty(Model model){
        Iterable<Users> Userslist =crud.findAll();
        model.addAttribute("Userslist", Userslist);
        return "Wizyty";
    }
/*
    @GetMapping(path = "/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("login", new Login());
        return "Rejestracja";
    }
    @PostMapping("/process_register")
    public String processRegister(Login login) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(login.getPassword());
        login.setPassword(encodedPassword);

        loginRepository.save(login);

        return "Rejestracja_prawidlowa";
    }
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<Login> listUsers = loginRepository.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

 */
    @GetMapping(path = "/login")
    public String zaloguj(){return "login";}
    @GetMapping(path = "/")
    public String powrot(){
        return "NFZstrona";
    }
    @GetMapping(path = "/dodanie-lekarzy")
    public String dodanie(){
        return "DodanieLekarzy";
    }
    @GetMapping(path = "/placowki")
    public String placowki(){
        return "Placowki";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Users> getAllUsers() {
        return crud.findAll();
    }
    @GetMapping(path="/doctors")
    public @ResponseBody Iterable<Doctors> getAllDoctors() {
        return crudDoc.findAll();
    }


    }


