package com.splusk.template.bid.operations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.splusk.template.bid.domain.Bid;

@Path("/bids")
@Produces(MediaType.APPLICATION_JSON)
public interface IBidResource {
    
    @GET
    @Path("/{id:[1-9][0-9]*}")
    public Bid getBid(@PathParam("id") String bidId);
    
}
