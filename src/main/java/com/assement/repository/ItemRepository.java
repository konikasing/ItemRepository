package com.assement.repository;

import org.springframework.stereotype.Repository;

import com.assement.assement33.entiies.Item;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}