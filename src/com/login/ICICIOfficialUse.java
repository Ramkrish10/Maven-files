package com.login;

public class ICICIOfficialUse extends ICICIBank {

	@Override
	public void bankAccountNo() {
    System.out.println("Bank acc no is 65321455");
    super.bankAddress();
    super.bankName();
    this.bankRegisterNo();
	}

	@Override
	public void bankRegisterNo() {
	System.out.println("Bank register no hsge54655232");
		
	}

	
	public static void main(String[] args) {
		ICICIOfficialUse a = new ICICIOfficialUse();
		a.bankAccountNo();
	}
}
