/**
 * 
 */
package com.tsiry.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tsiry.org.entities.Societe;

/**
 * @author Tsiry MANANKASINA
 *
 */
@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe , Long>{

}
