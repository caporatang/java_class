package 상속;

public class ManagerUse {

	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.address = "경기도 군포시";
		mg.bonus = 1000000000;
		mg.name = "김모군";
		mg.rrn = 950112;
		mg.saslary = 2354000;
		
		
		mg.test();
		
		System.out.println(mg);

	}

}
