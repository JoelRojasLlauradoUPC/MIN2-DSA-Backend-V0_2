package edu.upc.dsa.services;

import edu.upc.dsa.SystemManager;
import edu.upc.dsa.models.Team;
import edu.upc.dsa.models.User;
import edu.upc.dsa.services.dto.FishingRod;
import edu.upc.dsa.services.dto.RequestCapturedFish;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Api(value = "/teams", tags = {"teams"})
@Path("/teams")
@Produces(MediaType.APPLICATION_JSON)
public class TeamsService {
//    private final SystemManager gm = SystemManager.getInstance();

    @GET
    @Path("/ranking")
    @ApiOperation(value = "List all teams rankings")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = Team.class, responseContainer = "List")
    })
    public Response getTeamsRanking() {

        List<Team> ranking = new ArrayList<>();

        ranking.add(new Team("Porxinos",
                "https://cdn.pixabay.com/photo/2017/07/11/15/51/kermit-2493979_1280.png",
                250));

        ranking.add(new Team("rey/reina de xxx",
                "https://example.com/avatar.png",
                200));

        ranking.add(new Team("Los Magos",
                "https://example.com/magos.png",
                120));

        return Response.ok(new GenericEntity<List<Team>>(ranking) {}).build();
    }

}
