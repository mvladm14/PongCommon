package restInterfaces;

import java.util.Collection;

import models.BallCoordinates;
import models.PongBall;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface PongBallSvcApi {

	public static final String PONG_BALL = "/pongBall";
	public static final String ID_PARAMETER = "id";
	public static final String PONG_BALL_PATH = PONG_BALL + "/{id}/";

	@GET(PONG_BALL)
	public Collection<PongBall> getPongBalls();

	@POST(PONG_BALL)
	public PongBall addPongBall(@Body PongBall pongBall);

	@GET(PONG_BALL_PATH)
	public BallCoordinates getCoordinates(@Path(ID_PARAMETER) long id);

	@POST(PONG_BALL_PATH)
	public BallCoordinates setCoordinates(@Path(ID_PARAMETER) long id,
			@Body BallCoordinates coordinates);

}