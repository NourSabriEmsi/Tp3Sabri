package ma.emsi.nour.tp3sabri.resources;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import ma.emsi.nour.tp3sabri.llm.LlmClientPourGemini;

@Path("/guide")
public class GuideTouristiqueResource {

    @Inject
    LlmClientPourGemini llm;

    @GET
    @Path("lieu/{ville_ou_pays}/{nbEndroits}")

    @Produces(MediaType.APPLICATION_JSON)
    public Response villeOuPays(@PathParam("ville_ou_pays") String lieu, @PathParam("nbEndroits") int nbEndroits) {
        String resultat = llm.envoyerRequete(lieu,nbEndroits);
        return Response.ok(resultat).build();    }
}