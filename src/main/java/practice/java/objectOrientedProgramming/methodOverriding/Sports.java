package practice.java.objectOrientedProgramming.methodOverriding;

public class Sports {

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
