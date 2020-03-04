package com.company;
import javax.swing.*;
import java.lang.Enum;

public class Main {

    public static void main(String[] args) {
    }

    public enum Planets {
        MERCURY, VENUS, EARTH, MARS, JUPITER,
        SATURN, URANUS, NEPTUNE, PLUTO
    }

    public class EnumTest {
        Planets planet;


        public EnumTest(Planets planet) {
            this.planet = planet;
        }
        public void planetEnumeration(){
            switch(planet) {
                case MERCURY:
                    System.out.println("Woohoo mercury");
                    break;

                    case VENUS:
                    System.out.println("yayy venus");
                    break;

                    case EARTH:
                    System.out.println("hehehe its us");
                    break;

                    case MARS:
                    System.out.println("mars D: ");
                    break;

                    case JUPITER:
                    System.out.println("JUPITERR");
                    break;

                    case SATURN:
                    System.out.println("SATURNN");
                    break;

                    case URANUS:
                    System.out.println("Uranusss");
                    break;

                    case NEPTUNE:
                    System.out.println("NEPTUNEE");

                    case PLUTO:
                    System.out.println("Dwarf planet:)");


            }
        }
    }
}



