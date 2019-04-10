package exercise2;

public class tryq {
	
	    public static void main(String []args) {
	       System.out.println("Hello World!");
		
			try{
			exceptiona();
			}catch(Exception e){
				System.out.println(e.getMessage());
				//System.exit(0);//加上这句，finally中的内容就不会运行了
			}finally{
			System.out.println("结束了");
			}
			
	    }
		static void exceptiona() throws Exception{
			throw new Exception("I am you father");
		}
	
}
