package solid.principles.ocp.good.robot;

import solid.principles.ocp.good.abstraction.UseKnife;
import solid.principles.ocp.good.abstraction.UsePaintbrush;

public class Robot implements UseKnife, UsePaintbrush {

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String cutWithKnife() {
        return "I can cut";
    }

    @Override
    public String paintWithPaintbrush() {
        return "I can paint";
    }

    public String getName() {
        return name;
    }
}
