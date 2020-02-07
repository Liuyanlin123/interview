package design_patterns.Command命令模式;

public class BakeChickenWingCommand extends Command {


    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void ExcuteCommand() {
        barbecuer.BakeChickenWing();
    }
}
