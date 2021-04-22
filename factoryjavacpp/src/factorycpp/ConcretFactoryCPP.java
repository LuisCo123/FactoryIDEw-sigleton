package factorycpp;

import java.io.IOException;

import javax.swing.JFrame;

import factoryjava.ConcretFactoryJava;
import interfaces.IBuilder;
import interfaces.IFactoryIde;
public class ConcretFactoryCPP implements IFactoryIde{
	private static ConcretFactoryCPP instance = null;
	
	private ConcretFactoryCPP() {}
	
	public JFrame SHighlighter(String dir)throws IOException {
		return new SHCPP(dir);
	}
	public JFrame SHighlighter()throws IOException {
		return new SHCPP();
	}
	public IBuilder Builder() {
		return new BuilderCPP();
	}
	public static IFactoryIde getInstance() {
    	if(instance == null)
    		instance = new ConcretFactoryCPP();
    	return instance;
    }

}
