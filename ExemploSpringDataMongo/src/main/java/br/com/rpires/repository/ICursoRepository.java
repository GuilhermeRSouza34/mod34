/**
 * 
 */
package br.com.rpires.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.rpires.domain.Curso;

public interface ICursoRepository extends MongoRepository<Curso, String> {

}
