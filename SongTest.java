
import java.util.Scanner;

public class SongTest {
    public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);




		Singer frank = new Singer ("Frank Sinatra");
        Singer wham = new Singer ("Wham!");
        Singer mariah = new Singer ("Mariah Carey");
        Singer chris = new Singer ("Chris Rea");
    	Singer sia = new Singer ("Sia");


        new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
    	new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
    	new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
    	new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
    	new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
    	new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );


		/*singers[0] = frank;
		songs[0] = song2;

		singers[1] = wham;
		songs[1] = song3;

		singers[2] = mariah;
		songs[2] = song1;

		singers[3] = chris;
		songs[3] = song4;

		singers[4] = sia;
		songs[4] = song5;

        songs[5]= song6;
        */

   while (true){
  System.out.println("\n**********Welcome to our DMST Christmas Music Application**********\n");
  System.out.println("Menu:");
  System.out.println("Type 1 to display singers' list");
  System.out.println("Type 2 to display Frank's Sinatra available songs");
  System.out.println( "\nType here\n");


  int choice = scanner.nextInt();

    if (choice == 1){
      System.out.println("\nList of : Singers\n");
      for (Singer singer: Singer.singers){
		  if (singer!=null)
            System.out.println(singer.toString());
}
}


	 else if (choice == 2){
		 System.out.println("\nNumber of Sinatra songs:\n");
		 int count=0;
       for(int i=0; i<Singer.singers.length; i++){
			if (Singer.singers[i] == frank){
				for (int j=0; j<Song.songs.length; j++){
				  if (Song.songs[j]!= null){
					  if (Song.songs[j].getSinger().equals(Singer.singers[i])){
				count++;
			            }

	         }
          }
          if (count>0){
			  System.out.println(count+ " songs were found");
			  for (int j=0; j<Song.songs.length; j++){
				   if (Song.songs[j].getSinger().equals(Singer.singers[i])){
				System.out.println("\nTitle is:\n " +Song.songs[j].getTitle() + " and the url of this song is:" +Song.songs[j].getUrl());
			 }
			}
		  }
		  else if (count == 0){
			  System.out.println("0 songs were found");
		  }
}
}
}

    else {
		System.out.println ("Your insertion is not valid. You can choose 1 or 2");
	}





}
    }
}