package com.mj.generateReadable;
import java.util.*;

public interface RandomDoubles {
    Random RAND = new Random(47);
    
    default double next() {
        return RAND.nextDouble();
    }
}