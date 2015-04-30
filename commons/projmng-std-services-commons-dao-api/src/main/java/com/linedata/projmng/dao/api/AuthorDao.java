package com.linedata.projmng.dao.api;

import java.util.Collection;
import java.util.List;

import com.linedata.projmng.commons.model.Author;
import com.linedata.projmng.commons.model.Estimation;



public interface AuthorDao {

	public Author addAuthor(Author author);
	public Author affectAnEstimation(Author author, Collection<Estimation> estmations);
 	public boolean removeAuthor(long idAuthor);
	public boolean updateAuthor(long idAuthor, Author author);
	public Author findAuthor(long idAuthor);
	public List<Author> findAllAuthor();
}
