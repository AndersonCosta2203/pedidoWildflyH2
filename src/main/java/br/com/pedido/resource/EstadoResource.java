package br.com.pedido.resource;

import br.com.pedido.domain.Estado;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("estados")
public class EstadoResource {

    @GET
    public Response findAll() {
        Estado estado = new Estado(1, "MG");

        return Response.ok().entity(estado).build();
    }
}
