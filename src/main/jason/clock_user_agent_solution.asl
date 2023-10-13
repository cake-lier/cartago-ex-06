!use_clock.

+!use_clock : true <-
    makeArtifact("clock", "io.github.cakelier.ClockSolution", [], ClockId);
    focus(ClockId);
    +count(0);
    start.

// The plan needs to be atomic as not to overlap addition and removal of beliefs with other plans
@plan [atomic]
+tick : count(N) & N < 9 <-
    println("Ticks are now ", N + 1);
    /* Here we are leveraging the "-+" operator, which removes a belief from the belief base with the same functor, right before
     * adding the one specified. */
    -+count(N + 1).

+tick : count(9) <-
    println("Ticks are now 10, stopping");
    stop.

{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }