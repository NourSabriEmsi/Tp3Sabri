package ma.emsi.nour.tp3sabri;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    @Path("personnes/{nom}")
    public String hello(@PathParam("nom") String nom) {
        return "Hello, " + nom;
}
}