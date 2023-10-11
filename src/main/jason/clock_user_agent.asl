!use_clock.

+!use_clock : true <-
    makeArtifact("clock", "Clock", [], ClockId);
    focus(ClockId);
    // Add your code here for starting the count
    start.

// Add your code here for reacting to "tick" percepts and incrementing the count until the maximum value is reached

{ include("$jacamoJar/templates/common-cartago.asl") }
