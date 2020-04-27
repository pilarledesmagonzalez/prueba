package org.example;

import javax.servlet.annotation.WebServlet;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MongoConnection mongo = new MongoConnection();
    }
}
