package restInterfaces;

import java.util.Collection;

import models.player.Player;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

public interface PlayerSvcApi {

	public static final String PONG_PLAYERS = "/player";
	public static final String ID_PARAMETER = "id";

	/**
	 * This endpoint in the API returns the players that have been added to the
	 * server. The Player objects should be returned as JSON.
	 * 
	 * To manually test this endpoint, run your server and open this URL in a
	 * browser: http://localhost:8080/myriads/player
	 * 
	 * @return
	 */
	@GET(PONG_PLAYERS)
	public Collection<Player> getPlayersList();

	@POST(PONG_PLAYERS)
	public Player addPlayer(@Body Player p);

}
