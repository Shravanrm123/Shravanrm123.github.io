package com.mylittleworld.bookorderservice.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mylittleworld.bookorderservice.api.Model.Order;


@Repository
public interface OrderRepo extends JpaRepository<Order,Integer>
{

}
