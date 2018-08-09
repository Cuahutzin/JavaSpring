package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;

public class CurrentAccount implements Account {
	public Card creditCard;

	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String createAccount() {		
		//TODO Auto-generated method stub 
		return "Current Account created successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return this.creditCard.cardDetails();
	}

}
