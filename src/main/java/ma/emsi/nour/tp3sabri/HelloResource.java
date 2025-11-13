package ma.emsi.nour.tp3sabri;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    @Path("personnes/{nom}")
    public Response hello(@PathParam("nom") String nom) {
        return Response.serverError().entity("Internal Server Error").build();}
    @GET
    @Path("test/{valeur}")
    @Produces("text/plain")
    public String testParam(@PathParam("valeur") String valeur) {
        return valeur;}
    @GET
    @Path("testArray/{valeur}")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] testArray(@PathParam("valeur") String val) {
        return new String[]{ val };}}