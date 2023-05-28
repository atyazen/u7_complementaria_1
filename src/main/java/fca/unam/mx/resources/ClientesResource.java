package fca.unam.mx.resources;

import fca.unam.mx.dal.StoreDal;
import fca.unam.mx.dto.ProductDto;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/clientes")
public class ClientesResource {

    @Inject
    StoreDal storeDal;


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Mostrar todos los clientes")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response getClientes() {

        var responseDto = storeDal.getClientes();
        return Response.ok(responseDto).build();
    }

    @POST

    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Add a new product")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response registerUser(ProductDto productDto) {
        var responseDto = storeDal.addProduct(productDto);
        return Response.ok(responseDto).build();
    }


}
