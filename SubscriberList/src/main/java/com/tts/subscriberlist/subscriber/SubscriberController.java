package com.tts.subscriberlist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;


@Controller
//Indicates that an annotated class is a "Controller" (e.g. a web controller).
//This annotation serves as a specialization of @Component, allowing for implementation classes to be auto-detected through classpath scanning.
// It is typically used in combination with annotated handler methods based on the org.springframework.web.bind.annotation.RequestMapping annotation.
public class SubscriberController {

@Autowired
//Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
// This is an alternative to the JSR-330 javax.inject.Inject annotation, adding required-vs-optional semantics.
private SubscriberRepository subscriberRepository;

@GetMapping (value= "/")
//Annotation for mapping HTTP GET requests onto specific handler methods.
//Specifically, @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
    public String index(Subscriber subscriber, Model model) {
         //Where we want to go when our application is started.
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Sarah");
        return "subscriber/index";
    }
    private Subscriber subscriber;


    @PostMapping(value="/")
    //Annotation for mapping HTTP POST requests onto specific handler methods.
    //Specifically, @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST).
    //Adding a new Subscriber below:
    //for Slides

//    public String addNewSubscriber(Subscriber subscriber, Model model) {
//        subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(), subscriber.getUserName(), subscriber.getSignedUp()));
//        model.addAttribute("firstName", subscriber.getFirstName());
//        model.addAttribute("lastName", subscriber.getLastName());
//        model.addAttribute("userName", subscriber.getUserName());
//        return "subscriber/result";
//    }

    //Adding a new subscriber for a different purpose via homework
    public String addNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(),
                subscriber.getLastName(), subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/result";
    }

    //Searching for a new subscriber for a different purpose via homework
    @GetMapping(value = "/search")
    //Annotation for mapping HTTP GET requests onto specific handler methods.
    //Specifically, @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).

    public String getNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.findByFirstName(subscriber.getFirstName());
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/search";
    }
    //ask yuyu or erik in lab on /sun/monday how to get this done
    @RequestMapping ("resume.html")
    public String resume(Subscriber subscriber) {
        return "resume"; // this returns the template name to be rendered from resources/templates. You don't need to provide the extension.
    }
    @RequestMapping ("thursday.html")
    public String thursday(Subscriber subscriber) {
        return "thursday"; // this returns the template name to be rendered from resources/templates. You don't need to provide the extension.
    }
}