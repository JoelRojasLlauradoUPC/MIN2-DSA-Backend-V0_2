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

        ranking.add(new Team("Los Dragones",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6Mxlh0knmw29iisDfL6sncplhpevwyD0VFg&s.png",
                230));

        ranking.add(new Team("Los Piratas",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr7rjkSn-cJkkD9K24bb1_t3HsjQCg1Loimw&s.png",
                210));

        ranking.add(new Team("Reyes de la UPC",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqWssw3sNtGU74Z8P9Lo3ko3pEmI1C6eXhRw&s.png",
                200));

        ranking.add(new Team("Los Lobos",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRD84exw7sizVvu-dlXGI6FnvM_S1ROhzp71A&s.png",
                190));

        ranking.add(new Team("Los Pescadores",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7hLwuI2rRDQlZRqBIVBAAgM_wCkc5YCb-PQ&s.png",
                180));

        ranking.add(new Team("Los Samurai",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9B5mMBSqj7ipOP-XKTiCGCwjRI4Juk3NRuQ&s.png",
                175));

        ranking.add(new Team("Las Sombras",
                "https://images.vexels.com/media/users/3/316780/isolated/preview/c7cc4a1a411cb0e08e70fd26f216c8bc-murcielago-en-las-sombras.png.png",
                165));

        ranking.add(new Team("Team Rocket",
                "https://images.vexels.com/media/users/3/145821/isolated/preview/44247e29bf035ece825b8b2bf8af88c2-ilustracion-de-cohete-ilustracion-de-cohete.png.png",
                155));

        ranking.add(new Team("Los Navegantes",
                "https://images.vexels.com/media/users/3/265848/isolated/preview/c612f25b019e389238cd6e6c5eca51a0-barco-plano-barco.png.png",
                140));

        ranking.add(new Team("Las Estrellas",
                "https://images.vexels.com/media/users/3/134126/isolated/preview/37fb3358f410d3a764891e06e132c218-estrella-de-dibujos-animados-05.png",
                135));

        ranking.add(new Team("Los Magos",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbKJ-rZUceeH67I5n5JkhVwejbfEFWiOFXzw&s",
                120));



        return Response.ok(new GenericEntity<List<Team>>(ranking) {}).build();
    }

}
