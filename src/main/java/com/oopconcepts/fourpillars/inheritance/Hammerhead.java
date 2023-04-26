package com.oopconcepts.fourpillars.inheritance;

import com.oopconcepts.fourpillars.Shark;

public class Hammerhead extends Shark {

    private boolean hasHammerShapedHead = true;
    public Hammerhead(String name) {
        super(name);
    }

    public boolean getHasHammerShapedHead(){ return hasHammerShapedHead;}


}
