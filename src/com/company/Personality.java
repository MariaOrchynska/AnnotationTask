package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Personality {
    int IntValue();
    String StringValue() ;


}
