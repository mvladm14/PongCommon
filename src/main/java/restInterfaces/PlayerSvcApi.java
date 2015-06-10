package restInterfaces;

import java.util.Collection;

import models.phone.Accelerometer;
import models.phone.MagneticField;
import models.phone.PhoneSensors;
import models.player.Player;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface PlayerSvcApi {

	public static final String PONG_PLAYERS = "/player";
	public static final String ID_PARAMETER = "id";
	public static final String PONG_PLAYER_PATH = PONG_PLAYERS + "/{id}/";
	public static final String PLAYER_ACCELEROMETER = PONG_PLAYER_PATH
			+ "accelerometer/";
	public static final String PLAYER_MAGNETIC = PONG_PLAYER_PATH + "magnetic/";
	public static final String TIME_STAMP = PONG_PLAYER_PATH + "timestamp/";
	
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

	/**
	 * This endpoint in the API returns the gyroscope coordinates that have been
	 * added to the server. The GryoscopeCoordinates objects should be returned
	 * as JSON.
	 * 
	 * To manually test this endpoint, run your server and open this URL in a
	 * browser: http://localhost:8080/myriads/player/{playerId}
	 * 
	 * @return
	 */
	@GET(PONG_PLAYER_PATH)
	public PhoneSensors getPhoneSensors(@Path(ID_PARAMETER) long id);

	/**
	 * This endpoint allows clients to add GryoscopeCoordinates objects by
	 * sending POST requests that have an application/json body containing the
	 * GryoscopeCoordinates object information.
	 * 
	 * @return
	 */
	@POST(PONG_PLAYER_PATH)
	public PhoneSensors setPhoneSensors(@Path(ID_PARAMETER) long id,
			@Body PhoneSensors gv);

	@GET(PLAYER_ACCELEROMETER)
	public Accelerometer getAccelerometer(@Path(ID_PARAMETER) long id);

	@POST(PLAYER_ACCELEROMETER)
	public Accelerometer setAccelerometer(@Path(ID_PARAMETER) long id,
			@Body Accelerometer accelerometer);

	@GET(PLAYER_MAGNETIC)
	public MagneticField getMagnetic(@Path(ID_PARAMETER) long id);

	@POST(PLAYER_MAGNETIC)
	public MagneticField setMagnetic(@Path(ID_PARAMETER) long id,
			@Body MagneticField magneticField);
	
	@GET(TIME_STAMP)
	public long getTimeStamp(@Path(ID_PARAMETER) long id);

	@POST(TIME_STAMP)
	public long setTimeStamp(@Path(ID_PARAMETER) long id,
			@Body long timestamp);
}