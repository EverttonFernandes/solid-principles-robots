package solid.principles.dip.good;

public class CutterArm implements CutPizza {

    @Override
    public void cutPizza() {
        System.out.println("Cut pizza");
    }

}
