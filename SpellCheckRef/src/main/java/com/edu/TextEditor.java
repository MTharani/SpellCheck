package com.edu;

public class TextEditor 
{
  private SpellCheck spellcheck;


  public TextEditor(SpellCheck spellcheck) {
	super();
	this.spellcheck = spellcheck;
}


public void textFunction()
  {
	  if(spellcheck!=null)
	  {
		  spellcheck.spellCheck();
	  }
	  else
	  {
		  System.out.println("SpellCheck is Disable");
	  }
  }
  
}
