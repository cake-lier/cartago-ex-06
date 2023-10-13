package io.github.cakelier;

import cartago.Artifact;
import cartago.OPERATION;

public class Clock extends Artifact {

    private void init() {
        /* Initialize here your fields. */
    }

    @OPERATION
    public void start() {
        /* Add here your implementation for the start operation. */
    }

    @OPERATION
    public void stop() {
        /* Add here your implementation for the stop operation. */
    }

    /* Add your code here for annotating an internal operation. */
    private void tick() {
        /* Add here your implementation for the tick internal operation. */
    }
}
