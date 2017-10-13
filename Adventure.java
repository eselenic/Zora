import java.util.Scanner;
public class Adventure{
private String name;
public int amount;
public int weapon;
public void start()
{
	Scanner in = new Scanner(System.in);
	String start = in.nextLine();
	while(!start.equals("PLAY") && !start.equals("DIRECTIONS"))
	{
		System.out.println("Make sure you type the keyword with ALL CAPS correctly to continue.");
		start = in.nextLine();
	}
	if(start.equals("PLAY"))
	{
	  weapon = 0;
	  amount = 20;
	  play();
	}
	if(start.equals("DIRECTIONS"))
	{
		System.out.println("ZORA is a text adventure game that will take you through different senarios. Type in the keywords that are in ALL CAPS to continue.");
		System.out.println("Do you want to play? YES or NO?");
		String answer = in.nextLine();
		if(answer.equals("YES"))
		{
			play();
		}
		if(answer.equals("NO"))
		{
			System.out.println("That's ok...that doesn't hurt at all...");
		}
	}
}
public void play()
{
	Scanner in = new Scanner(System.in);
	System.out.println("What's your name?");
	name = in.nextLine();
	System.out.println("Hi " + name + ". My name is Zora.");
	System.out.println("My castle is underattack. I need to get back. Can you help me? YES or NO");
	String var = in.nextLine();
	while(!var.equals("YES") && !var.equals("NO") &&!var.equals("MAYBE"))
	{
		System.out.println("Make sure you type the keyword with ALL CAPS correctly to continue.");
		var = in.nextLine();
	}
	if(var.equals("YES"))
	{
		game();
	}
	if(var.equals("NO"))
	{
		System.out.println("That's ok i'll just let all the ppl die.");
	}
	if(var.equals("MAYBE"))
	{
		System.out.println(name + ", alright now your just being mean! YES or NO?");
		String var2 = in.nextLine();
		if(var2.equals("YES"))
		{
			game();
		}
		if(var2.equals("NO"))
		{
			System.out.println("Whatever.");
		}
	}
}
public void game()
{
	Scanner in = new Scanner(System.in);
	System.out.println("Sicketh! That's what we say in Estonia when someone agrees to help someone else");
	System.out.println("I can't exactly remember when I first came here which road I took.");
	System.out.println("The first route has takes me through a dark forest and the other one is underground the city. Route ONE or route TWO?");
	System.out.println("Which path does should I take?");
	String path = in.nextLine();
	while(!path.equals("TWO") && !path.equals("ONE"))
	{
		System.out.println("Make sure you type the keyword with ALL CAPS correctly to continue.");
		path = in.nextLine();
	}
	if(path.equals("ONE"))
	{
	 System.out.println("Not bad! Coolio this place is kinda neat");
	 System.out.println("Wait...did you hear that branch snap? Oh my I'm scareth.");
	 System.out.println("'I've been wating for you Zora!'");
	 path();
	}
	if(path.equals("TWO"))
	{
	 System.out.println("A begger tugs on your shirt");
 	 path2();
	}
}
public void path()
{
	Scanner in = new Scanner(System.in);
	System.out.println("Does Zora FIGHT, or RUN?");
	String vars = in.nextLine();
	while(!vars.equals("FIGHT") && !vars.equals("RUN"))
	{
		System.out.println("Make sure you type the keyword with ALL CAPS correctly to continue.");
		vars = in.nextLine();
	}
	if(vars.equals("FIGHT"))
	{
		System.out.println("Malchior the crazy guy raises his sword.");
		System.out.println("Zora has no weapon so she is killed.");
		System.out.println("You die as well. Great.");
	}
	if(vars.equals("RUN"))
	{
		System.out.println("Malchior the crazy guy raises his weapon");
		System.out.println("Zora rolls away as he strikes and grabs your arm. You safetly escape.");
		attack();
	}
}
public void path2()
{
	Scanner in = new Scanner(System.in);
	System.out.println("'Please give me money! I'm dying *cough*");
	System.out.println("Is she SHADY or do you give her MONEY?");
	String vars = in.nextLine();
	while(!vars.equals("SHADY") && !vars.equals("MONEY"))
	{
		System.out.println("Make sure you type the keyword with ALL CAPS correctly to continue.");
		vars = in.nextLine();
	}
	if(vars.equals("SHADY"))
	{
		System.out.println("In rage, the begger stabs you and takes all of Zora's money.");
		System.out.println("You can feel his life slip away");
		System.out.println("You Die");
	}
	if(vars.equals("MONEY"))
	{
		System.out.println("As you go to pull out your wallet, the begger takes almost all of your money!");
		System.out.println("At least you made it out safe and continue down the dark path.");
		amount = amount - 10;
		attack();
	}
}
public void attack()
{
	Scanner in = new Scanner(System.in);
	System.out.println("You see something shiny in the alley. Do you ENTER or CONTINUE?");
	String opt2 = in.nextLine();
	while(!opt2.equals("CONTINUE") && !opt2.equals("ENTER"))
	{
		System.out.println("Make sure you type the keyword with ALL CAPS correctly to continue.");
		opt2 = in.nextLine();
	  }
	if(opt2.equals("ENTER"))
	{

		System.out.println("Zora carefully enters the alley and reaches for the object");
	 	System.out.println("Cold steel emerges into your view");	 
	 	System.out.println("You have now added a SWORD to your inventory. Press any key to continue.");
		weapon = 1;
		in.nextLine();
 	}
	if(opt2.equals("CONTINUE"))
  	{
		System.out.println("Zora sees a run down cigar shop.");
   		System.out.println("You both enter and realize too late that you've been caught by the riddler.");
   		weapon = 0;
    }
	System.out.println("Zora sees a run down cigar shop.");
	System.out.println("You both enter and realize too late that you've been caught by the riddler.");
	Part_2 f = new Part_2();
	f.getboard();
}
public void castle()
{
	Scanner in = new Scanner(System.in);
	System.out.println("Zora finally makes it to the castle. There she see's the rebel who over threw her kingdom");
	System.out.println("Does Zora FIGHT or NEGOTIATE");
	String ans = in.nextLine();
	if(ans.equals("FIGHT"))
	{
		if(weapon == 1)
		{
			System.out.println("You win boy");
		}
		else
		{
			System.out.println("You Die");
		}
	}
	if(ans.equals("NEGOTIATE"))
	{
		if(amount <= 10)
		{
			System.out.println("you win");
		}
		else
		{
			System.out.println("youdie");
		}
	}
}
}