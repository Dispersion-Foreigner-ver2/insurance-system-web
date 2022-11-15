
package com.example.InsuranceSystem_Web.src.DAO.CustomerDAO;

import com.example.InsuranceSystem_Web.src.Domain.Customer.Ship;

import java.util.ArrayList;

public interface ShipDAO {
  boolean add(Ship ship);

  boolean delete(int id);

  Ship get(int id);

  boolean update(Ship ship);

  int getSize();

  public ArrayList<Ship> getShipList();
}