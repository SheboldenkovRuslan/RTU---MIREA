public class TestBall
{
    public static void main (String[] args)
    {
        Ball ball = new Ball ();
        System.out.println(ball);
        ball = new Ball (10, 30);
        System.out.println(ball);
        ball.move (10, 15);
        System.out.println(ball);

    }
}
