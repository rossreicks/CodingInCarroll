package day7;

import java.awt.Button;
import java.awt.Label;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TopMovies {
	
	public static void main(String[] args) throws IOException{
		
		ProgressBar pb = new ProgressBar(0,249);
		JFrame frame = new JFrame("IMDB's Top 250");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pb);
		frame.pack();
		frame.setSize(200, 200);
		frame.setVisible(true);
		
		Document doc = Jsoup.connect("http://www.imdb.com/chart/top").get();
		File file = new File("movies.csv");
		PrintWriter wr = new PrintWriter(file);
		Elements links = doc.select(".titleColumn a");
		for(int i = 1; i < 251; i++){
			StringBuilder sb = new StringBuilder();
			String link = links.get(i-1).attr("href");
			Document moviePage = Jsoup.connect("http://www.imdb.com" + link).get();
			String title = moviePage.select(".title_wrapper h1").text();
			title = title.substring(0, title.length()-7);
			if(title.contains(",")){
				title  = "\"" + title + "\"";
			}
			String year = moviePage.select("#titleYear a").text();
			String rating = moviePage.select(".subtext meta").attr("content");
			String duration = moviePage.select(".subtext time").text();
			String[] genres = moviePage.select(".subtext a span").text().split(" ");
			sb.append("\"");
			for(int j = 0; i < genres.length;i++){
				sb.append(genres[j] + ",");
			}
			sb.append(genres[genres.length-1] + "\"");
			String genre = sb.toString();
			String stars = moviePage.select(".ratingValue span").text().substring(0, 3);
			sb = new StringBuilder();
			sb.append(title + "," + year +  "," + rating + "," + duration + "," + genre + "," + stars);
			String line = sb.toString();
			wr.println(line);
			pb.incrementBar();
		}
		frame.dispose();
		wr.flush();
		wr.close();
		
	}
	
}
