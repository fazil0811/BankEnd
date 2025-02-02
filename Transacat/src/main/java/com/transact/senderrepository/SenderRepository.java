package com.transact.senderrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.senderentity.SenderEntity;

public interface SenderRepository extends JpaRepository<SenderEntity, Integer> {

}
