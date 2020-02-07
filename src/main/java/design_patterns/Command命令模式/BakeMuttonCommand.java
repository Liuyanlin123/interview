package design_patterns.Command命令模式;

public class BakeMuttonCommand extends Command {


    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void ExcuteCommand() {
        barbecuer.BakeMutton();
    }
}
