package solid.principles.ocp.bad;

public class RobotOCPBad {
    String name;
    DomesticTools domesticTool;

    public RobotOCPBad(String name, DomesticTools domesticTool) throws Exception {
        this.name = name;
        this.domesticTool = validateDomesticTool(domesticTool);
    }

    private DomesticTools validateDomesticTool(DomesticTools domesticTool) throws Exception {
        if (domesticTool == null)
            throw new Exception("Without domestic tool");
        return domesticTool;
    }

    public String doHousework() {
        String getHousework = "";

        if (DomesticTools.CUT.equals(this.getDomesticTool()))
            getHousework = "I can cut";

        if (DomesticTools.PAINT.equals(this.getDomesticTool()))
            getHousework = "I can paint";

        return getHousework;
    }

    public DomesticTools getDomesticTool() {
        return domesticTool;
    }
}
