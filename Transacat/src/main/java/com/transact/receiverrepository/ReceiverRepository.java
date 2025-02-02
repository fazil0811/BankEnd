package com.transact.receiverrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.receiverentity.ReceiverEntity;

public interface ReceiverRepository extends JpaRepository<ReceiverEntity, Integer>{

}
