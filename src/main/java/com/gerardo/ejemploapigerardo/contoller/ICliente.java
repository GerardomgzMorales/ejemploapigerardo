package com.gerardo.ejemploapigerardo.contoller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerardo.ejemploapigerardo.model.Cliente;


@Repository
public interface ICliente extends JpaRepository<Cliente, Integer> {

}
