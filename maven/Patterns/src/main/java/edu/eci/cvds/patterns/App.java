package edu.eci.cvds.patterns;

public class App 
{
    public static void main( String[] args ){
		String resu ;
		resu = "";
		if (args.length == 0){
			System.out.print("Hello Wordl!");
		}
		else {
			for(int i= 0;i<args.length;i++){
				resu = resu + " "+ args[i];
			}
		System.out.println("Hello " + resu );
		}
        
    }
}
