package com.exp.maven2;

import de.vandermeer.asciitable.AsciiTable;
import prerna.sablecc2.reactor.IReactor;
import prerna.test.HelloReactor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!   " );
        
        AsciiTable at = new AsciiTable();
        
        at.addRule();
        at.addRow("row 1 col 1", "row 1 col 2");
        at.addRule();
        at.addRow("row 2 col 1", "row 2 col 2");
        at.addRule();
        
        String rend = at.render();
        
        System.out.println(rend);   
        IReactor reac = new HelloReactor();
        System.out.println(reac.execute());
        
    }
    
    
    
}
