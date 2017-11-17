package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {

   
    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
    }

    public Result clients() {
        return ok(clients.render());
    }

    public Result contact() {
        return ok(contact.render());
    }

    public Result services() {
        return ok(services.render());
    }
}
