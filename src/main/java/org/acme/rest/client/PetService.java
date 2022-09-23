
package org.acme.rest.client;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/pet")
@RegisterRestClient
public interface PetService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findByStatus")

    public List<Pet> findByStatus(@QueryParam("status") String status);
}