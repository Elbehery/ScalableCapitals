package de.scalable.capital;

import java.util.Scanner;

/**
 * Created by mustafa on 31.07.16.
 */
public class TestCrawler {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Search Query");
        String query = scan.nextLine();
        System.out.println("Please wait for the result ...");

        //String query = "Natural Language Processing";

        Crawler crawler = new Crawler(query);
        crawler.getTopFiveCrawledJavaScriptLibraries();

       /* System.out.println(crawler.getResultLinks().size());

        for (String link : crawler.getResultLinks())
            System.out.println(link);
*/
    }
}
