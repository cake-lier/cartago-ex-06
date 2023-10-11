import cartago.Artifact;
import cartago.OPERATION;

public class Clock extends Artifact {

    void init() {
        /* Initialize here your fields. */
    }

    @OPERATION
    void start() {
        /* Add here your implementation for the start operation. */
    }

    @OPERATION
    void stop() {
        /* Add here your implementation for the stop operation. */
    }

    /* Add your code here for annotating an internal operation. */
    void tick() {
        /* Add here your implementation for the tick internal operation. */
    }
}
