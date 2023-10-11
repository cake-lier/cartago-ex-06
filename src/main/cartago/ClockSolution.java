import cartago.Artifact;
import cartago.INTERNAL_OPERATION;
import cartago.OPERATION;

public class ClockSolution extends Artifact {
    boolean ticking;

    void init() {
        this.ticking = false;
    }

    @OPERATION
    void start() {
        if (!this.ticking) {
            this.ticking = true;
            execInternalOp("tick");
        }
    }

    @OPERATION
    void stop() {
        this.ticking = false;
    }

    @INTERNAL_OPERATION
    void tick() {
        while (this.ticking) {
            signal("tick");
            await_time(1000);
        }
    }
}
