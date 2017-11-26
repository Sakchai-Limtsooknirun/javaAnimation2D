package Models;


public class BoatKeyAction {

    private Boat boat;
    private boolean isMoveUp, isMoveDown, isMoveRight, isMoveleft, isSpeedUp, isSpeedDown;

    public BoatKeyAction(Boat boat) {
        this.boat = boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void setMoveUp(boolean moveUp) {
        isMoveUp = moveUp;
    }

    public void setMoveDown(boolean moveDown) {
        isMoveDown = moveDown;
    }

    public void setMoveRight(boolean moveRight) {
        isMoveRight = moveRight;
    }

    public void setMoveleft(boolean moveleft) {
        isMoveleft = moveleft;
    }

    public void setSpeedUp(boolean speedUp) {
        isSpeedUp = speedUp;
    }

    public void setSpeedDown(boolean speedDown) {
        isSpeedDown = speedDown;
    }

    public void action() {
        if (isMoveUp) boat.goUp();
        if (isMoveDown) boat.goDown();
        if (isMoveleft) boat.goLeft();
        if (isMoveRight) boat.goRight();
        if (isSpeedUp) boat.speedUp();
        if (isSpeedDown) boat.speedDown();

    }
}
