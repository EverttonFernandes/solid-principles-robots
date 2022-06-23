package solid.principles.dip.good.tools;

import solid.principles.dip.good.CutterArm;

public class CutterPizza implements CutterArm {

    @Override
    public void cut() {
        System.out.println("Cut pizza");
    }

}
