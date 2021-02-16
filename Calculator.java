import java.io.*;

public class Calculator {
	float num1=0;
	float num2=0;
	float result=0;
	boolean visited = false;

	public void calculate() throws IOException
	{
		System.out.print("Start : ");
		num1=Integer.parseInt(getString());
		
		boolean run = true;
		while(run)
		{
			System.out.print("Oprand : ");
			String o = getString();
			switch(o) 
			{
			case "+":
				System.out.print(""+o+" ");
				num2=Integer.parseInt(getString());
				if(visited)
				{
					result+=num2;
				}
				else
				{
					result=num1+num2;
					visited = true;
				}
				System.out.println("Calculate : "+result);
				break;
				
			case "-":
				System.out.print(""+o+" ");
				num2=Integer.parseInt(getString());
				if(visited)
				{
					result-=num2;
				}
				else
				{
					result=num1-num2;
					visited = true;
				}
				System.out.println("Calculate : "+result);
				break;
				
			case "*":
				System.out.print(""+o+" ");
				num2=Integer.parseInt(getString());
				if(visited)
				{
					result*=num2;
				}
				else
				{
					result=num1*num2;
					visited = true;
				}
				System.out.println("Calculate : "+result);
				break;
				
			case "/":
				System.out.print(""+o+" ");
				num2=Integer.parseInt(getString());
				if(visited)
				{
					result/=num2;
				}
				else
				{
					result=num1/num2;
					visited = true;
				}
				System.out.println("Calculate : "+result);
				break;
				
			case "c":
				num1=0;
				num2=0;
				result=0;
				visited = false;
				calculate();
				break;
				
			case "e":
				run = false;
				break;
				
			default:
				System.out.print("You'r Enter Invalid Input \n");
				calculate();
				break;
			}
		}
	}
	
	public String getString() throws IOException{
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

	public static void main(String[] args) throws IOException {
		Calculator cal = new Calculator();		
		cal.runner();
	}


	//Error Handle
	public void runner()
		{
			try{
				calculate();	
				}catch(Exception e){
					System.out.println(e);
					runner();
				}
		}
}
