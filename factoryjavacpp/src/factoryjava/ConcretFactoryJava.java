package factoryjava;


import java.io.IOException;

import javax.swing.JFrame;

import interfaces.IBuilder;
import interfaces.IFactoryIde;

public class ConcretFactoryJava implements IFactoryIde{
	private static ConcretFactoryJava instance = null;
	
	private ConcretFactoryJava() {}
	
	public JFrame SHighlighter(String dir) throws IOException{ 
		return new SHJava(dir);
	}
	public JFrame SHighlighter() throws IOException{ 
		return new SHJava();
	}
    public IBuilder Builder(){
        return new BuilderJava();
    }
    public static IFactoryIde getInstance() {
    	if(instance == null)
    		instance = new ConcretFactoryJava();
    	return instance;
    }

}
