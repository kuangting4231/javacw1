package exercise2;

public class tryq {
	
	    public static void main(String []args) {
	       System.out.println("Hello World!");
		
			try{
			exceptiona();
			}catch(Exception e){
				System.out.println(e.getMessage());
				//System.exit(0);//������䣬finally�е����ݾͲ���������
			}finally{
			System.out.println("������");
			}
			
	    }
		static void exceptiona() throws Exception{
			throw new Exception("I am you father");
		}
	
}
