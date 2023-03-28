/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecomerce.ApiProduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author SUITE
 */
public interface ProductRepository extends JpaRepository<pe.cibertec.ecomerce.ApiProduct.entity.Product, Long> {
    
}
