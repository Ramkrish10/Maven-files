package com.login;

public class IBOfficialUse implements IndianBank{

	@Override
	public void bankAccountNo() {
	System.out.println("Bank acc no is 5622445555");
	this.bankRegisterNo();
	}

	@Override
	public void bankRegisterNo() {
    System.out.println("Bank Register no fgh566594845");
    this.bankLoginId();
	}

	@Override
	public void bankLoginId() {
	System.out.println("Bank login id 23655hg652");
	this.bankPassword();
	}

	@Override
	public void bankPassword() {
	System.out.println("Bank password 6224bsc353");		
	}

	
	public static void main(String[] args) {
		IBOfficialUse a = new IBOfficialUse();
		a.bankAccountNo();
	}
}
