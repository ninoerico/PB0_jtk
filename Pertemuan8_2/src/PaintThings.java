public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350);
        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
        System.out.println("Paint needed for the deck: " + deckAmt + " gallons");
        System.out.println("Paint needed for the big ball: " + ballAmt + " gallons");
        System.out.println("Paint needed for the tank: " + tankAmt + " gallons");
    }
}

//Polymorph Reference