import java.util.*;
class Game 
{

    Question[] ques = new Question[5];
    Player player = new Player();

    String[] qdata = {"Who scored the highest individual score in international odi cricket?","Which hitler party came into power in 1933?","When is the world population day observed?","Which city is known as Electronic City of India?","What does the term PLC Stand for?"};
    String[] opt1 = {"Guptill","Labour Party","May 31","Mumbai","Programmable Logic Controller"};
    String[] opt2 = {"Sachin","Nazi Party","October 4","Hyderabad","Programmable Lift Computer"};
    String[] opt3 = {"Rohit","Ku-Klux-Kian","December 10","Guragon","Program List Control"};
    String[] opt4 = {"Gayle","Democratic Party","July 11","Bangalore","Piezo Lamp Connector"};
    int[] answers = {3,2,4,4,1};


    public void initGame()
    {

        for(int i=0;i<5;i++)
		{
            ques[i]=new Question();
        }


        for(int i=0;i<5;i++)
        {

            ques[i].question = qdata[i];
			ques[i].opt1 = opt1[i];
			ques[i].opt2 = opt2[i];
			ques[i].opt3 = opt3[i];
			ques[i].opt4 = opt4[i];
			ques[i].correctAnswer = answers[i];

        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<5;i++)
          {
              boolean status=ques[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Yahh! Thats A Right Answer (+20)");
                  player.score=player.score+20;
              }
              else{
                  System.out.println("Opps! You Made A Wrong Choice (-10)");
                  player.score=player.score-10;
              }
          }

        System.out.println(player.name+" Your Final Score Is "+player.score);

    }

}

class Question 
{

    Scanner sc=new Scanner(System.in);
    String question, opt1, opt2, opt3, opt4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+opt1);
        System.out.println("2. "+opt2);
        System.out.println("3. "+opt3);
        System.out.println("4. "+opt4);
        System.out.println("Please Choose Your Answer");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
       return false;
    }

}

class Player 
{

	Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails()
	{

        System.out.println("Enter Player's Name");
        name=sc.next();

    }

}

class Main 
{

		public static void main(String[] args) {
        Game game=new Game();
        game.initGame();
        game.play();

    }
}