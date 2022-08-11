package co.develhope.CrudRestAPI.repositories;

import co.develhope.CrudRestAPI.entities.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages",
        collectionResourceDescription = @Description("repo-prog-languages description"))
public interface ProgrammingLanguagesRespository extends JpaRepository<ProgrammingLanguages,Long> {
}
