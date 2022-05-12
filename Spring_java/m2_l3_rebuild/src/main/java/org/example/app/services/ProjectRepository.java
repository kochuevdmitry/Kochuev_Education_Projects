package org.example.app.services;

import java.util.List;

public interface ProjectRepository<T> {
    List<T> retreiveAll();
    List<T> retreiveByAuthor(String author);

    void store(T book);

    boolean removeItemById(Integer bookIdToRemove);
    boolean removeItemByAuthor(String bookAuthorToRemove);
    boolean removeItemByTitle(String bookTitleToRemove);
    boolean removeItemBySize(Integer bookSizeToRemove);

}
