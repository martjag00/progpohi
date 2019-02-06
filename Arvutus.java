public class Arvutus{
	public static void main(String[] arg){
		int vanus=12;
		if(vanus<18){
			System.out.println("lapsepilet");
		} else {
			if(vanus<7){
				System.out.println("Tasuta");
			} else {
				System.out.println("Täispilet");
			}
		}	
		for(int nr=0; nr<vanus; nr++){
			System.out.println("Õnne!");
		}
	}
}