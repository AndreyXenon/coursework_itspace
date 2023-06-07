package com.reactspringcrud.ITArticles.repository;

import com.reactspringcrud.ITArticles.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByPublished(boolean published);

    List<Article> findByTitleContaining(String title);
}
