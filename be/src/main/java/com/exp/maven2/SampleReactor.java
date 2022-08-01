package com.exp.maven2;

import de.vandermeer.asciitable.AsciiTable;

import prerna.sablecc2.om.PixelDataType;
import prerna.sablecc2.om.PixelOperationType;
import prerna.sablecc2.om.nounmeta.NounMetadata;
import prerna.test.HelloReactor;
import prerna.sablecc2.reactor.AbstractReactor;
import java.sql.*;

import org.apache.commons.io.FileUtils;

public class SampleReactor extends AbstractReactor {

	@Override
	public NounMetadata execute()
	{
		
		        
        AsciiTable at = new AsciiTable();
        
        at.addRule();
        at.addRow("row 1 col 1", "row 1 col 2");
        at.addRule();
        at.addRow("row 2 col 1", "row 2 col 2");
        at.addRule();
        
        String rend = at.render();
        
        System.out.println(rend);   
		
		try
		{
		DriverManager.getConnection("yo");
			System.out.println(FileUtils.sizeOf(new java.io.File("c:/users/pkapaleeswaran/workspacej3/temp/depoutput")));
		}catch(Exception ignored)
		{
		}

		return new NounMetadata("Succeeded in saying hello Sam ple", PixelDataType.CONST_STRING, PixelOperationType.OPERATION);
	}

	
}
