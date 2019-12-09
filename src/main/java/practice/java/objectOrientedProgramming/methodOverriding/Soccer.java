/*
Task

Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that
prints the same statement as the superclass' getNumberOfTeamMembers method, except that it
replaces n with 11 (the number of players on a Soccer team).
 */
package practice.java.objectOrientedProgramming.methodOverriding;

public class Soccer extends Sports {

    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
