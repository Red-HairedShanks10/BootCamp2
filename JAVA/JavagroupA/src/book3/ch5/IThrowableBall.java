package book3.ch5;

public interface IThrowableBall {
    void throwBall();
    void catchBall();
}

interface IKickableBall{
    void kickBall();
    void catchBall();
}

interface IPlayableBall extends IKickableBall, IThrowableBall{
    void dropBall();
}
