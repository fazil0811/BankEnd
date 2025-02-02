package com.transact.mytransaction;

import com.transact.receiverentity.ReceiverEntity;
import com.transact.senderentity.SenderEntity;

public class MyTransaction {

	private SenderEntity sender;
	private ReceiverEntity receiver;
	public SenderEntity getSender() {
		return sender;
	}
	public void setSender(SenderEntity sender) {
		this.sender = sender;
	}
	public ReceiverEntity getReceiver() {
		return receiver;
	}
	public void setReceiver(ReceiverEntity receiver) {
		this.receiver = receiver;
	}
}
	