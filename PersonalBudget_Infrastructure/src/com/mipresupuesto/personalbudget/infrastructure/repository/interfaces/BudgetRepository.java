package com.mipresupuesto.personalbudget.infrastructure.repository.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mipresupuesto.personalbudget.entity.BudgetEntity;


@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, UUID>{
	
//	@Query("SELECT u FROM User u WHERE u.status = ?1")
//	User findUserByStatus(Integer status);
//
//	@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
//	User findUserByStatusAndName(Integer status, String name);
	
//	
//	@Query(value = "SELECT * FROM USERS u WHERE u.status = 1",nativeQuery = true)
//			Collection<User> findAllActiveUsersNative();
	
//	@Query("SELECT b FROM Budget b WHERE b.idPerson = :idPerson and b.idYear = :idYear")
//	@Query("SELECT b FROM Budget b WHERE b.idPerson = :? and b.idYear = ?2")
	@Query(value = "SELECT * FROM Budget u WHERE u.idPerson = ?1 and b.idYear = ?2", nativeQuery = true)
	Optional<BudgetEntity> findByPersonAndYear(UUID idPerson, UUID idYear);

}
