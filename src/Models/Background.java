package Models;

public class Background extends DrawsGraphic {
    private AllBG allBG;

    public Background(AllBG allBG) {
        super(0,0,900,600);
        this.allBG = allBG;
    }
    @Override
    public void draw(){
        allBG.setGc(getGraphicsContext2D());
        allBG.drawBG();

    }

}
