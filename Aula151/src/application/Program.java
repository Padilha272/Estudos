package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Scanner sc = new Scanner(System.in);
		System.out.println("Moment: ");
		String moment = sc.nextLine();
		System.out.println("Title: ");
		String title = sc.nextLine();
		System.out.println("Content :");
		String content = sc.nextLine();
		System.out.println("Likes: ");
		int likes = sc.nextInt();
		
		Post post = new Post(sdf.parse(moment),title,content,likes);
		System.out.println("How many comments ?");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i =0 ;i<n;i++) {
			System.out.println("Comment: ");
			Comment comment = new Comment(sc.nextLine());  
			post.addComment(comment);
		}
		
		System.out.println(post);
	}

}
