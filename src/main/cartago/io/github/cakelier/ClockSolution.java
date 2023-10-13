package io.github.cakelier;

import cartago.Artifact;
import cartago.INTERNAL_OPERATION;
import cartago.OPERATION;

public class ClockSolution extends Artifact {
    private boolean ticking;

    private void init() {
        this.ticking = false;
    }

    @OPERATION
    public void start() {
        if (!this.ticking) {
            this.ticking = true;
            execInternalOp("tick");
        }
    }

    @OPERATION
    public void stop() {
        this.ticking = false;
    }

    @INTERNAL_OPERATION
    private void tick() {
        while (this.ticking) {
            signal("tick");
            await_time(1000);
        }
    }
}
