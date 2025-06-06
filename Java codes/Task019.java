// Write a program to print enum values

import java.util.*;

public class Task020 {
    public static void main(String[] args) {
        System.out.println("Displaying elements from Element enum:\n");

        for (Element e : Element.values()) {
            System.out.println("Symbol : " + e.name());
            System.out.println("Label : " + e.label);
            System.out.println("Atomic Number : " + e.atomicNumber);
            System.out.println("Atomic Weight : " + e.atomicWeight);
            System.out.println();
        }

        System.out.println("Lookup by label 'Oxygen': " + Element.valueOfLabel("Oxygen"));
        System.out.println("Lookup by atomic number 2: " + Element.valueOfAtomicNumber(2));
        System.out.println("Lookup by weight 1.008f: " + Element.valueOfAtomicWeight(1.008f));
    }
    
public enum Element {
    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    LI("Lithium", 3, 6.94f),
    BE("Beryllium", 4, 9.0122f),
    B("Boron", 5, 10.81f),
    C("Carbon", 6, 12.011f),
    N("Nitrogen", 7, 14.007f),
    O("Oxygen", 8, 15.999f),
    F("Fluorine", 9, 18.998f),
    NE("Neon", 10, 20.180f);

    public final String label;
    public final int atomicNumber;
    public final float atomicWeight;

    private static final Map<String, Element> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();
    private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {
        for (Element e : values()) {
            BY_LABEL.put(e.label, e);
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }

    private Element(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static Element valueOfAtomicNumber(int number) {
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static Element valueOfAtomicWeight(float weight) {
        return BY_ATOMIC_WEIGHT.get(weight);
    }
}

}

/*
output:

Displaying elements from Element enum:

Symbol : H
Label : Hydrogen
Atomic Number : 1
Atomic Weight : 1.008

Symbol : HE
Label : Helium
Atomic Number : 2
Atomic Weight : 4.0026

Symbol : LI
Label : Lithium
Atomic Number : 3
Atomic Weight : 6.94

Symbol : BE
Label : Beryllium
Atomic Number : 4
Atomic Weight : 9.0122

Symbol : B
Label : Boron
Atomic Number : 5
Atomic Weight : 10.81

Symbol : C
Label : Carbon
Atomic Number : 6
Atomic Weight : 12.011

Symbol : N
Label : Nitrogen
Atomic Number : 7
Atomic Weight : 14.007

Symbol : O
Label : Oxygen
Atomic Number : 8
Atomic Weight : 15.999

Symbol : F
Label : Fluorine
Atomic Number : 9
Atomic Weight : 18.998

Symbol : NE
Label : Neon
Atomic Number : 10
Atomic Weight : 20.18

Lookup by label 'Oxygen': O
Lookup by atomic number 2: HE
Lookup by weight 1.008f: H

*/
