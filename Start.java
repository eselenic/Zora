import java.util.Scanner;
public class Start {
public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println(" _____________       ___________       ____________     ___________ ");
    	System.out.println("|________    /      |  _______  |     |  ________  |   |  _______  |");
    	System.out.println("        /   /       | |       | |     | |        | |   | |       | |");
    	System.out.println("       /   /        | |       | |     | |        | |   | |       | |");
    	System.out.println("      /   /         | |       | |     | | _______| |   | |_______| |");
    	System.out.println("     /   /          | |       | |     |__________| |   |  _______  |");
    	System.out.println("    /   /           | |       | |          /   / | |   | |       | |");
    	System.out.println("   /   /            | |       | |         /   /  | |   | |       | |");
    	System.out.println("  /   /_______      | |_______| |        /   /   | |   | |       | |");
    	System.out.println(" |____________|     |___________|       /___/    |_|   |_|       |_|");
    	System.out.println("    Type PLAY to play           or            Type DIRECTIONS to learn more");
    	System.out.println();
    	Adventure p = new Adventure();
    	p.start();
    	in.nextLine();
    }
}